package quiz;

public class B12_Array2Quiz {

	public static void main(String[] args) {
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
//		1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔보세요
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = (int)(Math.random() * 101);
			}
		}
		
//		1. 강사님 풀이
		for (int row = 0; row < numArr.length; ++row) {
			
			for (int column = 0; column < numArr[row].length; ++column) {
				
				numArr[row][column] = (int)(Math.random() * 101);
				
			}
		}
		
//		2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균(소수점 둘째 자리)을 구해서 출력해보세요
		int sum = 0;
		int count = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.printf("%d ", numArr[i][j]);
				sum += numArr[i][j];
				count++;
			}
			System.out.println();
		}
		System.out.printf("총 합: %d, 갯수: %d, 평균: %.2f\n\n", sum, count, sum/(double)count);
		
//		2. 강사님 풀이
		sum = 0;
		count = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			
			int len = numArr[row].length;
			count += len;
			for (int column = 0; column < len; ++column) {
				
				System.out.print(numArr[row][column] + "\t");
				sum += numArr[row][column];
			}
			System.out.println();
		}
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum/(double)count);		
		
//		3. numArr의 각 행의 합을 모두 구해서 출력해보세요
		int[] sumH = new int[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sumH[i] += numArr[i][j];
			}
			System.out.printf("%d행의 합: %d\n", i, sumH[i]);
		}
		System.out.println();
		
//		3. 강사님 풀이
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				rowSum[row] += numArr[row][column];
			}
		}
		
//		4. numArr의 각 열의 합을 모두 구해서 출력해보세요
		int buffer = 0, longest = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				buffer++;
			}
			if (buffer > longest) {
				longest = buffer;
				buffer = 0;
			} else {
				buffer = 0;
			}
		}
		int[] sumV = new int[longest];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sumV[j] += numArr[i][j];
			}
		}
		
		for (int i = 0; i < longest; i++) {
			System.out.printf("%d열의 합: %d\n", i, sumV[i]);
		}
		
//		4. 강사님 풀이
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; row++) {
			max_len = Math.max(max_len, numArr[row].length);
		}
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				colSum[column] += numArr[row][column];
			}
		}
		
//		배열을 편리하게 문자열로 변환하기
		System.out.println("행의 합: " + java.util.Arrays.toString(rowSum));
		System.out.println("열의 합: " + java.util.Arrays.toString(colSum));
	}
}
