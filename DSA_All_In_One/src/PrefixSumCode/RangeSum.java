package PrefixSumCode;

public class RangeSum {
	public void getsumInRange(int A[], int B[][]) {
		int n = A.length;
		int pf[] = new int[n];
		pf[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			pf[i] = pf[i - 1] + A[i];
		}
		int bl = B.length;
		int result[] = new int[bl];

		for (int j = 0; j < B.length; j++) {
			int L = B[j][0];
			int R = B[j][1];

			if (L == 0) {
				result[j] = pf[R];
			} else {
				result[j] = pf[R] - pf[L - 1];
			}
		}
		printArr(result);
	}

	public void printArr(int J[]) {
		for (int i = 0; i < J.length; i++) {
			System.out.print(J[i] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeSum rs = new RangeSum();
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[][] = { { 1, 4 }, { 0, 5 }, { 1, 9 }, { 3, 9 } };
		rs.getsumInRange(A, B);

	}

}
// Question Link https://www.scaler.com/academy/mentee-dashboard/class/59874/assignment/problems/15991?navref=cl_tt_lst_nm