package arrayDiscussion;

public class StringImmutable
{
	public static void main(String[] args) {
		int a=10;
		a++;
		System.out.println(a);//Here value of a gets changed because of post increment operation
								//hence we called int a as mutable
		String s1="abc";
		String s2=s1.concat("xyz");
		System.out.println(s1);//here value of string s1 remains as it is
								//so we called it as string is immutable as value doesn't change because of operation
		
	}
}
