package practice;

public class NonStaticVariable {
	int i=10;
	int j=2;
	int k;
	public void div()
	{
		k=i/j;
	}
	public static void main(String[] args) {
		int i=20;
		NonStaticVariable o1=new NonStaticVariable();
		System.out.println(+i);
		System.out.println(o1.k);
	}

}
