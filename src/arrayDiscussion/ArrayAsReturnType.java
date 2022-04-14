package arrayDiscussion;

public class ArrayAsReturnType
{
	public int[] m1()
	{
		int []a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		return a;
	}
	public static void main(String[] args)
	{
		ArrayAsReturnType o1=new ArrayAsReturnType();
		//int []arr=new int[5];
		for(int b:o1.m1())
		{
			System.out.println(b);
		}
	}

}
