package PrefixSumCode;

/*You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].*/
public class EvenNumberInRange {
	public void findEvenInRange(int A[], int B[][]) {
		int prefixEven[] = new int[A.length];
		grtPrefixEven(A);
		prefixEven[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			prefixEven[i] = prefixEven[i - 1] + A[i];
		}
//		for (int i = 1; i < A.length; i++) {
//			System.out.println(prefixEven[i]);
//		}
		int ansResult[] = new int[B.length];
		for (int i = 0; i < B.length; i++) {
			int L = B[i][0];
			int R = B[i][1];

			if (L == 0) {
				ansResult[i] = prefixEven[R];
			} else {
				ansResult[i] = prefixEven[R] - prefixEven[L];
			}
		}
		for (int i = 0; i < ansResult.length; i++) {
			System.out.println(ansResult[i]);
		}
	}

	public void grtPrefixEven(int A[]) {

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {

				A[i] = 1;
			} else {
				A[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 3, 1, 4, 5, 8, 9, 10, 7, 2, 1, 0 };
		int B[][] = { { 2, 6 }, { 1, 8 }, { 4, 9 }, { 0, 9 } };
		EvenNumberInRange er = new EvenNumberInRange();
		er.findEvenInRange(A, B);

	}

}
