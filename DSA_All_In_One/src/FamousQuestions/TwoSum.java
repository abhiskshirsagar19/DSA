package FamousQuestions;

import java.util.Arrays;

public class TwoSum {
	public int[] findPair(int A[], int B) {
		for (int i = 0; i < A.length; i++) {
			int C = B - A[i];
			if (i < A.length && A[i] == C) {
				continue;
			} else if (A[i] > C && i < A[C]) {
				return new int[] { C, i };
			}
			A[i] = C;
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 4, 2, 3, 5 };
		int B = 6;
		TwoSum ts = new TwoSum();

		int ans[] = ts.findPair(A, B);
		System.out.println(Arrays.toString(ans));
	}

}
