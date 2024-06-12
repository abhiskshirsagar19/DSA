package SubArrays;

/*
 You are given an integer array A.
 Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
 Return "YES" if it is possible; otherwise, return "NO" (without quotes). 
 */
public class EvenSubarrys {
	public String checkSubarrays(int A[]) {
		if (A.length % 2 != 0 || A[0] % 2 != 0 || A[A.length - 1] % 2 != 0) {
			return "NO";
		}
		return "Yes";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 2, 2, 3, 4, 5, 5 };
		EvenSubarrys es = new EvenSubarrys();
		System.out.println(es.checkSubarrays(A));
	}

}
