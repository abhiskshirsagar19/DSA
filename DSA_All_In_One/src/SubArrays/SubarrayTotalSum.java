package SubArrays;

public class SubarrayTotalSum {
	public void totalSumSubarray(int A[]) {
		int sum = 0;
		int total = 0;
		for (int start = 0; start < A.length; start++) {
			sum = 0;
			for (int end = start; end < A.length; end++) {
				sum = sum + A[end];
				total = sum + total;
			}

		}
		System.out.println(total);
	}

	public void totalSumSubarrayOptimise(int A[]) {
		int total = 0;
		int individual = 0;
		int N = A.length;
		for (int i = 0; i < A.length; i++) {
			individual = ((i + 1) * (N - i) * A[i]);
			// System.out.println(individual);
			total = total + individual;
		}
		System.out.println(total);
	}

	public void totalSumsubarray(int A[]) {
		int sum = 0;
		int total = 0;
		for (int start = 0; start < A.length; start++) {
			for (int end = start; end < A.length; end++) {
				for (int p = start; p <= end; p++) {
					System.out.print(A[p] + "   ");
					sum = A[p] + sum;
				}
				System.out.print("===> " + sum);
				System.out.println();
			}

		}
		System.out.println(sum);
	}

	public static void main(String String[]) {
		int A[] = { 1, 2, 3, 4, 5, 6 };
		SubarrayTotalSum sb = new SubarrayTotalSum();
		// sb.totalSumSubarrayOptimise(A);
		sb.totalSumSubarray(A);
		// sb.totalSumsubarray(A);

	}
}
