package constructor;

public class Basics 
{
	int m;
	int s;
	int e;
	public  Basics(int mm,int ss,int ee)
	{
		m=mm;
	    s=ss;
		e=ee;
		//System.out.println("hi");
		
		
	}
	public static void main(String[] args) 
	{
		Basics cb = new Basics(25,17,28);
		Basics cb1 = new Basics(45,12,90);
		Basics cb2 = new Basics(65,33,67);
		Basics cb3 = new Basics(26,33,12);
		Basics cb4 = new Basics(85,34,90);
		Basics cb5 = new Basics(28,56,78);
		Basics cb6 = new Basics(24,67,67);
		Basics cb7 = new Basics(20,23,34);
		Basics cb8 = new Basics(22,78,12);
		System.out.println(cb6.s);
	}

}
