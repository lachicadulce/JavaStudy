package quiz;

public class C01_FunctionQuiz2 {

	/*
		# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2
		 1. �ִ밪�� �Ű������� ���޹�����
		 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
		 	range �Լ��� ��������
		 	
		 	ex: range(10)�� ��� -> [0,1,2,3,4,5,6,7,8,9]
		 	
		 2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
		 	�ּҰ� ���� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
		 	range �Լ��� ��������
		 
		 	ex: range(5, 10)�� ��� -> [5,6,7,8,9]
		 	
		 3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
		 	�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȭ�ϴ�
		 	range �Լ��� ��������
		 	
		 	ex: range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
	 */
	
	
	
	
	
	/*
		# �Լ� �����ε� (overloading)
			- �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����� �� �ִ�
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
	public static int[] range(int min, int max) { //������� start�� stop���� �ؼ� �۾����°ű��� �ۼ��ϼ���.
		int[] result = new int[max-min];
		for (int i = 0; i < max-min; i++) {
			result[i] = i + min;
		}
		return result;
	}
	
//	3
	/** 
	 * ����ȭ �ּ�
	 * 
	 * @min
	 		�����ϴ� ���� ��������
	 * @max
	 * ������ ���� ��������
	 * @r
	 * @return �̻��� ���� ������ null
	 */
	public static int[] range(int min, int max, int r) {
		int[] result = new int[(max-min)/r];
		for (int i = 0; i < (max-min)/r; i++) {
			result[i] = i*r + min;
		}
		return result;
	}
	
//	�����
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
