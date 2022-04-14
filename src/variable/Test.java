package variable;

public class Test 
{
	static int a= 100;
	int b=200;
	public void m1() 
	{
		a=1000;
		b=2000;
		System.out.println(a);
		
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1();
		
				
	}
	
	

}
