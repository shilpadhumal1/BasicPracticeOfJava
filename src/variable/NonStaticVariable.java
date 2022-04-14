package variable;

public class NonStaticVariable 
{
	static int a=20;
	boolean b;
	int i =20;
	int k = 1;
	public void nonStaticMethod()
	{
		int i=10;
		int k=i+this.i+NonStaticVariable.a;
		System.out.println("PRactice:"+k);
	}
	
	public static void main(String[] args) 
	{
		
		NonStaticVariable t = new NonStaticVariable();
		System.out.println("Before changing value of value of i from referance variable t: " +t.i);
		//System.out.println(t.k);
		//t.i=50;
		System.out.println("Before changing value of value of i from referance variable t: "+t.i);
		NonStaticVariable j = new NonStaticVariable();
		System.out.println("i value from New referance variable j is: "+j.i );
		t.nonStaticMethod();
		System.out.println("boolean:"+t.b);
		NonStaticVariable o=new NonStaticVariable();
		System.out.println(o.k);
		o.k=5;
		
		System.out.println(o.k);
		NonStaticVariable o1=new NonStaticVariable();
		System.out.println(o1.k);
		o1.k=10;
		System.out.println(o1.k);
		int i=20;
		System.out.println(+o1.i);
		
	}

}
