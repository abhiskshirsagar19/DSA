package SubArrays;

/*You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.*/
public class MaximumSubArrayEasy {
	public int check(int A[], int B) {
		int maxsum = 0;
		int sum = 0;
		for (int start = 0; start < A.length; start++) {
			sum = 0;
			for (int end = start; end < A.length; end++) {
				sum += A[end];
				if (sum > maxsum && sum <= B) {
					maxsum = sum;

				}
			}
		}
		if (maxsum <= B) {
			return maxsum;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubArrayEasy max = new MaximumSubArrayEasy();
		int A[] = { 1, 2, 3, 4, 5 };
		int B = 10;
		System.out.println(max.check(A, B));
	}

}
