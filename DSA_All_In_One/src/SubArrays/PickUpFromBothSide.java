package SubArrays;

/*
 You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

 */
public class PickUpFromBothSide {
	public int find(int A[], int B) {
		int maxsum = 0;
		for (int i = 0; i < B; i++) {
			maxsum += A[i];
		}
		int sum = maxsum;
		int temp = B;
		for (int i = A.length - 1; i >= A.length - B; i--) {
			sum = sum + A[i] - A[temp - 1];

			if (maxsum < sum) {
				maxsum = sum;
			}
			temp--;
		}
		return maxsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PickUpFromBothSide pb = new PickUpFromBothSide();
		int A[] = { 5, -2, 3, 1, 2 };
		int B = 3;
		System.out.println(pb.find(A, B));
		;
	}

}
