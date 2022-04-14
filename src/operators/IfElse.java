package operators;

public class IfElse
{
	public static void main(String[] args) {
		int x=11;
		int y=10;
		if(x==y)
		{
			System.out.println("x and y are equal");
		}
		if(x!=y)
		{
			System.out.println("x and y are not equal");
		}
		if(!(x!=y))
		{
			System.out.println("x and y are equal");
		}
		if((x>y)&&(x!=y))
		{
			System.out.println("x is greater");
		}
		if((x<y)||(x!=y))
		{
			System.out.println("x is greater ");
		}
	}

}
