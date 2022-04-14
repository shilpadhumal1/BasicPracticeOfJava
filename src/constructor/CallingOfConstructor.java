package constructor;

public class CallingOfConstructor
{
	int m;
	int s;
	int e;
	public CallingOfConstructor(int m)
	{
		this(12, 13);
		System.out.println("One Argument Constructor");
	}
	public CallingOfConstructor(int m,int s)
	{
		
		this(11,12,false);
		
		System.out.println("Two Argument Constructor1");
	}
	public CallingOfConstructor(int m,char a)
	{
		this(11,12,false);
		
		
		System.out.println("Two Argument Constructor2");
		
	}
	public CallingOfConstructor(int m,int s,boolean b)
	{
		//this(12);
		
		System.out.println("Three Argument Constructor");
	}
	
	
	public static void main(String[] args)
	{
		CallingOfConstructor cb=new CallingOfConstructor(12);
		
	}
	

}
