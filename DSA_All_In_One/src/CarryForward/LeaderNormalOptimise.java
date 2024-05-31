package CarryForward;

/*
 Given an integer array A containing N distinct integers, you have to find all the leaders in array A. 
 An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.
 */
public class LeaderNormalOptimise {
	// Problem facing with this method for skipping 4.
	public void findLeaders(int A[]) {
		for (int i = 0; i < A.length; i++) {
			int temp = A[i];

			boolean isVisited = false;
			for (int j = i + 1; j < A.length; j++) {
				if (temp < A[j]) {

					break;
				} else if (temp > A[j]) {

					if (!isVisited) {
						System.out.println(temp);
					}
					isVisited = true;
				}
			}
		}
	}

// Correct implementation and 
	public void findLeadersTwo(int arr[]) {
		int n = arr.length;

		// Rightmost element is always a leader
		System.out.print(arr[n - 1] + " ");

		// Traverse from n-2 to 0
		for (int i = n - 2; i >= 0; i--) {
			int current = arr[i];
			boolean isLeader = true;

			// Check if current is greater than all elements on its right
			for (int j = i + 1; j < n; j++) {
				if (current < arr[j]) {
					isLeader = false;
					break;
				}
			}

			if (isLeader) {
				System.out.print(current + " ");
			}
		}
	}

// Optimized Solution
	public void optimised(int A[]) {
		int n = A.length;
		int max_from_right = A[n - 1];
		System.out.print(A[n - 1] + " ");
		for (int i = n - 2; i >= 0; i--) {
			if (A[i] > max_from_right) {
				System.out.print(A[i] + " ");
				max_from_right = A[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaderNormalOptimise ln = new LeaderNormalOptimise();
		int A[] = { 16, 17, 4, 3, 5, 2 };
		ln.optimised(A);
	}

}
