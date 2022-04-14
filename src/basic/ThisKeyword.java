package basic;

public class ThisKeyword 
{
	int a=2;
	static int b=1;
	public void m1(int a,int b)
	{
		ThisKeyword o1=new ThisKeyword();
		System.out.println(o1.a);
		System.out.println(ThisKeyword.b);
	}
	public static void m2(int a,int b)
	{
		ThisKeyword o1=new ThisKeyword();
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		ThisKeyword o1=new ThisKeyword();
		//o1.m1(200, 100);
		m2(200, 100);
		
	}

}
