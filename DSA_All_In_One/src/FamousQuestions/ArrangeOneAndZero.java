package FamousQuestions;

import java.util.Arrays;

public class ArrangeOneAndZero {
	public void arrangeArray(int A[]) {
		int countOne = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 1) {
				A[i] = 0;
				countOne++;
			}
		}
		// System.out.println(countOne);
		int j = 0;
		while (j < countOne) {
			A[j] = 1;
			j++;
		}
		System.out.println(Arrays.toString(A));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeOneAndZero aa = new ArrangeOneAndZero();
		int A[] = { 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0 };
		aa.arrangeArray(A);
	}

}
