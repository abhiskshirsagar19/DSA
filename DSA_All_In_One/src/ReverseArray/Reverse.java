package ReverseArray;

public class Reverse {
	public void reverse(int A[]) {
		int start = 0;
		int end = A.length - 1;
		while (start < end) {
			A[start] = A[start] + A[end];
			A[end] = A[start] - A[end];
			A[start] = A[start] - A[end];

			start++;
			end--;
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public static void main(String args[]) {
		int Arr[] = { 5, 4, 3, 2, 1, 0 };
		Reverse rev = new Reverse();
		rev.reverse(Arr);
	}
}
