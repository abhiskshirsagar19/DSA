package SubArrays;

public class PrintAllSubarrays {
	public void printSubarray(int A[]) {
		int sum = 0;
		for (int start = 0; start < A.length; start++) {
			for (int end = start; end < A.length; end++) {
				sum = 0;
				for (int p = start; p <= end; p++) {
					// System.out.print(A[p] + " ");
					sum = A[p] + sum;
				}
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 2, 3, 4, 5 };
		PrintAllSubarrays pa = new PrintAllSubarrays();
		pa.printSubarray(A);
	}

}
