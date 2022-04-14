package arrayDiscussion;

public class ArrayAsArgument 
{
	public void m1(int []a )
	{
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
		for(int b:a)
		{
			System.out.println(b);
		}
	}
	
	public static void main(String[] args)
	{
		ArrayAsArgument o1=new ArrayAsArgument();
		int []arr=new int[5];
		arr[0]=50;
		arr[1]=100;
		arr[2]=200;
		o1.m1(arr);
	}

}
