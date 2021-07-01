package quiz;

public class C01_FunctionQuiz2 {

	/*
		# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요2
		 1. 최대값을 매개변수로 전달받으면
		 	0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
		 	range 함수를 만들어보세요
		 	
		 	ex: range(10)의 결과 -> [0,1,2,3,4,5,6,7,8,9]
		 	
		 2. 최소값과 최대값을 매개변수로 전달받으면
		 	최소값 부터 최대값 미만의 모든 정수값을 포함하는 int 배열을 생성하여 반환하는
		 	range 함수를 만들어보세요
		 
		 	ex: range(5, 10)의 결과 -> [5,6,7,8,9]
		 	
		 3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
		 	최소값붙터 최대값 미만까지 증가갑만큼 증가하는 int 배열을 생성하여 반화하는
		 	range 함수를 만들어보세요
		 	
		 	ex: range(40, 50, 3)의 결과 -> [40, 43, 46, 49]
	 */
	
	
	
	
	
	/*
		# 함수 오버로딩 (overloading)
			- 매개변수의 개수 또는 타입이 다르면 똑같은 함수명을 사용할 수 있다
	 */
	public static void main(String[] args) {
		System.out.println(java.util.Arrays.toString(range(10)));
		System.out.println(java.util.Arrays.toString(range(5, 10)));
		System.out.println(java.util.Arrays.toString(range(40, 50, 3)));
	}

//	1
	public static int[] range(int max) {
		int[] result = new int[max];
		for (int i = 0; i < max; i++) {
			result[i] = i;
		}
		return result;
	}
	
//	2
	public static int[] range(int min, int max) { //강사님은 start랑 stop으로 해서 작아지는거까지 작성하셨음.
		int[] result = new int[max-min];
		for (int i = 0; i < max-min; i++) {
			result[i] = i + min;
		}
		return result;
	}
	
//	3
	/** 
	 * 문서화 주석
	 * 
	 * @min
	 		시작하는 값을 넣으세요
	 * @max
	 * 끝나는 값을 넣으세요
	 * @r
	 * @return 이상한 값을 넣으면 null
	 */
	public static int[] range(int min, int max, int r) {
		int[] result = new int[(max-min)/r];
		for (int i = 0; i < (max-min)/r; i++) {
			result[i] = i*r + min;
		}
		return result;
	}
	
//	강사님
	public static int[] range2(int start, int end, int increase) {
        if (increase < 0 && start <= end) {
                return null;
        } else if (increase > 0 && start >= end) {
                return null;
        } else if (increase == 0) {
                return null;
        }
        
        int size;
        
        if (increase > 0) {
                int range = end - start;
                size = range % increase == 0 ? range / increase : range / increase + 1; 
        } else {
                int range = start - end;
                size = range % (increase * -1) == 0 ? 
                                range / (increase * -1) : range / (increase * -1) + 1;
        }
         
        System.out.println("size:  " + size);
        int[] arr = new int[size];
        
        for (int value = start, index = 0; 
                        increase > 0 ? value < end : value > end; value += increase) {
                                        
                arr[index++] = value;
                System.out.printf("arr[%d] : %d\n", index - 1, value);
        }                
        return arr;                
	}
}
