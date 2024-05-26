package PrefixSumCode;

public class EquilibirumIndexBase {
	public void equilibirumIndexBasewithSeparateForLoop(int A[]) {
		int leftSum = 0;
		int rightSum = 0;
		System.out.println("============== Right Sum ===================");
		for (int i = 0; i < A.length; i++) {
			rightSum = 0;
			for (int j = i + 1; j < A.length; j++) {

				rightSum = A[j] + rightSum;
			}
			System.out.print(i + " Right sum : " + rightSum);
			System.out.println();
		}
		System.out.println("============== Left Sum ===================");
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			leftSum = 0;

			j = i;
			while (j > 0) {

				leftSum = A[j - 1] + leftSum;
				j--;
			}
			System.out.print(i + " Left sum : " + leftSum);
			System.out.println();
		}
	}

	public void equilibirumIndexBasewithSeparateOneLoop(int A[]) {
		int leftSum = 0;
		int rightSum = 0;
		int k = 0;
		for (int i = 0; i < A.length; i++) {
			rightSum = 0;
			for (int j = i + 1; j < A.length; j++) {
				rightSum = A[j] + rightSum;
			}
			// System.out.println(i + " Right Sum : " + rightSum);

			leftSum = 0;
			k = i;
			while (k > 0) {
				leftSum = A[k - 1] + leftSum;
				k--;
			}
			//System.out.println(i + " Left Sum : " + leftSum);

			if (rightSum == leftSum) {
				System.out.println("This is the equilibrium index : " + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilibirumIndexBase eib = new EquilibirumIndexBase();
		int A[] = { -7, 1, 5, 2, -4, 3, 0 };
		// eib.equilibirumIndexBasewithSeparateForLoop(A);
		eib.equilibirumIndexBasewithSeparateOneLoop(A);

	}

}
