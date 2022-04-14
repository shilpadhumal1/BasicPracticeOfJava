package methods;

public class MethodWithReturnType 
{
	//static int s;
	int a=10;
	static boolean b;
	
	//non static method with return type 
	public int m1()
	{
		int a =1;
		int s=2;
		int c=a+s;
//		System.out.println(c);
//		System.out.println(this.a);
		System.out.println(c);
		return c;
		
		
	}
	
	//static method with return type
	public static int m2()
	{
		int a=5;
		return a;
	}
	
	public static void main(String[] args) 
	{
		MethodWithReturnType t=new MethodWithReturnType();
		t.m1();
		//System.out.println(t.m1());
		//int d=t.m1()+3;
		//System.out.println(d);
		//System.out.println(t.m1());
		//System.out.println(m2());
//		int b=1000+t.m1();
//		System.out.println(b);
	
	}

}
