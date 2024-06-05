package CarryForward;

/*
 You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
  */
public class SubstringCountVowel {
	public void getSubstringCount(String s) {
		s = s.toLowerCase();
		char A[] = s.toCharArray();
		int count = 0;
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 'a' || A[i] == 'e' || A[i] == 'i' || A[i] == 'o' || A[i] == 'u') {
				count++;
				ans = count + ans;
			} else {
				ans = count + ans;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstringCountVowel ssc = new SubstringCountVowel();
		String s = "asdfhasdfjjkasd";
		String a = "aHbAMCDOE";
		ssc.getSubstringCount(a);
	}

}
