package CarryForward;

/*
 You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 */
public class SpecialSequence {
	public void normal(char A[]) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 'A') {
				for (int j = i + 1; j < A.length; j++) {
					if (i < j && A[j] == 'G') {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		System.out.println("Number of pairs (i, j) A[i] = 'A', A[j] = 'G'  : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialSequence ss = new SpecialSequence();
		char A[] = { 'A', 'G', 'D', 'G', 'A', 'G', 'A', };
		ss.normal(A);
	}

}
