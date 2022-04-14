package methods;

public class MethodWithArgument 
{	
	int a=2;
	static int b=1;
	//non static method with arguments no return type
	
	public void m1(int a)
	{
		//a=10;
		int b=23;
		System.out.println(a);
		int c= this.a+b;
		System.out.println(c);
		
	}
	//non static method without argumwnts and no return type
	public void m2(boolean b)
	{
		System.out.println(b);
	}
	//static method with arguments and no arguments
	public static void m3(int a,int b)
	{
		MethodWithArgument o10 =new MethodWithArgument();
		System.out.println(o10.a);
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		
		MethodWithArgument t=new MethodWithArgument();
		//Test t1=new Test();
		//t.m1(16);
		t.m2(true);
		m3(10,5);
//		t.m1(5, 4);
//		t.m2();
//		m3(6,3);
//		t1.ar1(1, 1);
		
		
		
		
	}

}
