package constructor;

public class MultipleConstructor 
{
	int m;
	int s;
	int e;
	public MultipleConstructor(int m,int s,int e) {
		System.out.println("Three argument Constructor");
	}
	public MultipleConstructor(int m)
	{
		System.out.println("One argument Constructor");
	}
	public MultipleConstructor(int m,boolean b)
	{
		System.out.println("Two argument Constructor");
	}
	public static void main(String[] args) {
		new MultipleConstructor(14);
		MultipleConstructor cb1=new MultipleConstructor(14,true);
		MultipleConstructor cb2=new MultipleConstructor(14,12,13);
		
	}

}
