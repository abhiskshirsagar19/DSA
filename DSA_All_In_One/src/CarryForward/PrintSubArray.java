package CarryForward;

public class PrintSubArray {
	public void printArray(int A[]) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j <= i; j++) {
				sum = 0;
				for (int k = j; k <= i; k++) {
					sum = A[k] + sum;
					System.out.print(A[k] + " ");
				}
				System.out.print(" = " + sum);
				System.out.println("\n===================");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSubArray sb = new PrintSubArray();
		int A[] = { 0, 1, 2, 3, 4, 5 };
		sb.printArray(A);
	}

}
