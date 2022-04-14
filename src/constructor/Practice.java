package constructor;

public class Practice 
{
	int l=1;
	int m=2;
	public Practice()
	{
		l=5;
		
		m=10;
		System.out.println(+l+" "+m);
		Practice.m1();
		
		
	}
	public static void m1()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Practice o1=new Practice();
		
	}

}
