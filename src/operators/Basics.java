package operators;

public class Basics 
{
	public static void main(String[] args) 
{
		
	int x=10;
	int y=++x;//x=11
	System.out.println(x+" "+y);
	int t=x++;//t=11   x=12
	System.out.println(t+"  "+x);
	int z=x--;//z=12  x=11
	
	System.out.println(z+" "+x);
	
	int a=10;
	int b=++a;
	int c=--a;
	System.out.println("a value is:"+x+" b value is:"+b);
	System.out.println("a value is:"+x+" c value is:"+c);
	
	char p = 'm';
	char q=++p;
	System.out.println(q);
	
	
	
	
	
	}

}
