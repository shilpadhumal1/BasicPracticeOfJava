package variable;

public class LocalVariable 
{
	int i=10;//non static variable
	static int  k =9;//static variabale
	//non static method
	public void myNonStaticMethod()
	{
		int i=100;//local variable having name same as non static variable i
		int k=200;//local variable having same name as static varible k
		System.out.println("printing value of local variable i  in non static method:"+i);//take thnearest variable value if name of variable is same
		System.out.println("printing value of local variable k  in non static method:"+k);//take thnearest variable value if name of variable is same
		System.out.println("printing value of non static class level variable i :" +this.i);//we can use this keyword only for non static method
		System.out.println("printing value of static class level variable k :"+LocalVariable.k);
		
	}
	//static method
	public static void staticMethod()
	{
		int i = 300;
		int k=400;
		System.out.println("local variable i in static method is:"+i);//take thnearest variable value if name of variable is same
		LocalVariable a = new LocalVariable();
		System.out.println("non Static variable i value:"+a.i);
		System.out.println("local variable k is:"+k);
		System.out.println("static variable k is:"+LocalVariable.k);
		
	}
	public static void main(String[] args)
	{
		LocalVariable r = new LocalVariable();
		r.myNonStaticMethod();
		staticMethod();
		
	}

}
