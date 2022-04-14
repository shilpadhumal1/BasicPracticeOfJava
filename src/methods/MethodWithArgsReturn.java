package methods;

public class MethodWithArgsReturn 
{
	static int a=1;
	static int b=2;
	int c=5;
	//Method with argument and return type
	public int m1 (int a,boolean z,double b)
	{
		double c;
		System.out.println(a+" \n"+z+"\n "+b);
		System.out.println(c = a+b);
		return a;
		
	}
	public static void main(String[] args) 
	{
		MethodWithArgsReturn o = new MethodWithArgsReturn();
		
		int d=o.m1(20, false, 20.00)+5;
		System.out.println(d);
		
		
//		int c;
//		c=o.c+MethodWithArgsReturn.a;
//		o.c = a+b;
//		MethodWithArgsReturn.a=o.c+MethodWithArgsReturn.b;
//		System.out.println(o.c+" "+c);
//		System.out.println(MethodWithArgsReturn.a);
//		o.c=9;
//		o.a=4;
//		System.out.println(o.a);
		
		
		
	}
	

}
