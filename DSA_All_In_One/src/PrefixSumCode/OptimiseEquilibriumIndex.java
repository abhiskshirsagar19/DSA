package PrefixSumCode;

import java.util.Arrays;

public class OptimiseEquilibriumIndex {
	public int countOfEquilibrium(int A[]) {
		int count = 0;
		int prefSum[] = new int[A.length];
		prefSum[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			prefSum[i] = A[i] + prefSum[i - 1];
		}
		// System.out.println(Arrays.toString(prefSum));
		for (int i = 0; i < prefSum.length; i++) {
			int N = A.length;
			int leftSum = 0;
			int rightSum = 0;
			if (i == 0) {
				leftSum = 0;
				rightSum = prefSum[N - 1] - prefSum[i];
				System.out.println(i + "  Left Sum :" + leftSum + "   Right Sum:" + rightSum);
			} else {
				leftSum = prefSum[i - 1];
				rightSum = prefSum[N - 1] - prefSum[i];
				System.out.println(i + "  Left Sum :" + leftSum + "   Right Sum:" + rightSum);

			}
			if (leftSum == rightSum) {
				count++;
			}

		}
		// System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptimiseEquilibriumIndex oei = new OptimiseEquilibriumIndex();
		int A[] = { -7, 1, 5, 2, -4, 3, 0 };
		oei.countOfEquilibrium(A);
	}

}
