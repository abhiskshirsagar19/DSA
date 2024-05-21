package PrefixSumCode;

public class Prefixsum {
	public void getPrefixSum(int A[]) {
		int prefixsum[] = new int[A.length];

		prefixsum[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			prefixsum[i] = prefixsum[i - 1] + A[i];
		}
		display(prefixsum);
	}

	public void display(int pf[]) {
		for (int i = 0; i < pf.length; i++) {
			System.out.print(pf[i] + " ");
		}
	}

	public static void main(String args[]) {
		Prefixsum pf = new Prefixsum();
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		pf.getPrefixSum(A);
	}
}
