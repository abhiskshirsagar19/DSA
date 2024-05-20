package ReverseArray;

public class ReverseWithFor {
	public void reverse(int A[]) {
		int n = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			A[i] = A[i] + A[n];
			A[n] = A[i] - A[n];
			A[i] = A[i] - A[n];
			n--;
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}

	public static void main(String args[]) {
		ReverseWithFor rv = new ReverseWithFor();
		int[] B = { 1, 2, 3, 4, 5, 6 };
		rv.reverse(B);
	}
}