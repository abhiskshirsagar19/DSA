package ReverseArray;

public class ReverseWithN {
	public void reverse(int A[], int B) {
		int N = A.length;

		reverseswap(A, N - B - 1, N - 1);
		reverseswap(A, 0, N - B - 2);
		reverseswap(A, 0, N - 1);

		display(A);

	}

	public void reverseswap(int A[], int start, int end) {
		while (start < end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}

	public static void main(String args[]) {
		ReverseWithN rws = new ReverseWithN();
		int A[] = { 1, 2, 3, 4, 5, 6 };
		int B = 2;
		rws.reverse(A, B);
	}
}
// 1 2 3 4 5 6   2          

// 5 1 2 3 4   1
// 4 5 1 2 3   2

// 1 2 3 5 4 
// 3 2 1 5 4
// 4 5 1 2 3