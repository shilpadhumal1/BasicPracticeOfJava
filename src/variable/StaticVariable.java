package variable;

public class StaticVariable 
{
	static boolean b;
	static int i = 50;
	static int a=5;
	//accessing static variable in static method
	public static void myFirstMethod()
	{
		//static variable accessed directly by variable name in same class
		System.out.println("static variable i value accessed by name in static method is:"+i);
		//static variable accessed classname.variablename in another class
		//System.out.println("static variable t value accessed by classname.variablename in static method is:" +Test.t);
		
	}
	//Accessing static variable in non static method
	public void myNonStaticMethod()
	{
		System.out.println("static variable i value in non static method is:"+i);
	}
	//Accessing static variable in main method
	public static void main(String[] args) 
	{
		System.out.println("its boolean:"+b);
		myFirstMethod();
		StaticVariable k = new StaticVariable();
		k.myNonStaticMethod();
		//System.out.println(a);
		System.out.println(k.a);
		a=10;
		//System.out.println(a);
		
		System.out.println(k.a);
		StaticVariable k1=new StaticVariable();
		//System.out.println(a);
		System.out.println(k1.a);
		a=15;
		System.out.println(k1.a);
		
	}

}
