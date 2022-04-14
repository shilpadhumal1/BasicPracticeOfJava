 package methods;

public class NonStaticMethod 
{
	//syntax for non static method 
	//public static name of method(){}
	public void m3()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) {
		//creation of object for calling non static method
		//classname referance variable name = new classname()
		NonStaticMethod o = new NonStaticMethod();
		o.m3();//calling non static method in same class
		Test k = new Test();
		k.nonStaticFromOtherClass();
		//k.staticFromOtheClass();
		Test.staticFromOtheClass();
		StaticMethod.addition();
	}
	

}
