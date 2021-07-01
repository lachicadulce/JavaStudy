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
		
//		1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = (int)(Math.random() * 101);
			}
		}
		
//		1. ����� Ǯ��
		for (int row = 0; row < numArr.length; ++row) {
			
			for (int column = 0; column < numArr[row].length; ++column) {
				
				numArr[row][column] = (int)(Math.random() * 101);
				
			}
		}
		
//		2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����
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
		System.out.printf("�� ��: %d, ����: %d, ���: %.2f\n\n", sum, count, sum/(double)count);
		
//		2. ����� Ǯ��
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
		System.out.printf("����: %d, ���: %.2f\n", sum, sum/(double)count);		
		
//		3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		int[] sumH = new int[numArr.length];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				sumH[i] += numArr[i][j];
			}
			System.out.printf("%d���� ��: %d\n", i, sumH[i]);
		}
		System.out.println();
		
//		3. ����� Ǯ��
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				rowSum[row] += numArr[row][column];
			}
		}
		
//		4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
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
			System.out.printf("%d���� ��: %d\n", i, sumV[i]);
		}
		
//		4. ����� Ǯ��
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
		
//		�迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� ��: " + java.util.Arrays.toString(rowSum));
		System.out.println("���� ��: " + java.util.Arrays.toString(colSum));
	}
}
