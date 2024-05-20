package PrefixSumCode;

/*Problem statement 
 Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
 
 */
public class ProductArray {
	public void withoutDivisionOperator(int A[]) {
		int n = A.length;
		int[] leftProduct = new int[n];
		int[] rightProduct = new int[n];
		leftProduct[0] = 1;
		rightProduct[n - 1] = 1;

		for (int i = 1; i < A.length; i++) {
			leftProduct[i] = leftProduct[i - 1] * A[i - 1];
			// System.out.println(leftProduct[i]);
		}

		for (int i = n - 2; i >= 0; i--) {
			rightProduct[i] = rightProduct[i + 1] * A[i + 1];
			// System.out.println(rightProduct[i]);
		}
		for (int i = 0; i < A.length; i++) {
			A[i] = leftProduct[i] * rightProduct[i];
		}
		display(A);
	}

	public void display(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArray pa = new ProductArray();
		int A[] = { 1, 2, 3, 4, 5 };
		pa.withoutDivisionOperator(A);
	}

}
// Product Array 120 120 120 120 120 
// Answer  Array 120  60 40   30  24
