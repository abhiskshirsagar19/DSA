package JavaStrings;

public class CheckImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "String";
		String s2 = new String("String");
		String s3 = "String";

		System.out.print("s1 == s2 : ");
		System.out.println(s1 == s2);
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.print("s1 == s3 : ");
		System.out.println(s1 == s3);

	}

}
