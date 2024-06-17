package SubArrays;

import java.util.Arrays;

public class PrefixSumOfSubarray {
	public void printSum(int A[]) {
		int Sum[] = new int[(A.length) * (A.length + 1) / 2];
		int index = 0;
		for (int start = 0; start < A.length; start++) {
			for (int end = start; end < A.length; end++) {
				int sum = 0;
				for (int p = start; p <= end; p++) {
					sum = A[p] + sum;
				}

				Sum[index] = sum;
				index++;
			}
		}
		System.out.println(Arrays.toString(Sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrefixSumOfSubarray pf = new PrefixSumOfSubarray();
		int A[] = { 1, 2, 3, 4, 5 };
		pf.printSum(A);
	}

}
