package arrayDiscussion;

public class Basic 
{
	public static void main(String[] args)
	{
		//collection of homogeneous data type is called as array
		int []intarray=new int[5];// defination of array
		// initialization of array
		intarray[0]=10;
		intarray[1]=20;
		intarray[2]=30;
		intarray[3]=40;
		intarray[4]=50;
		int [] add=new int[intarray.length];
//		System.out.println(intarray[3]); // to get a particular value
//		// using for loop to print all the values of array
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(intarray[i]);
//		}
//		int size=intarray.length;
//		System.out.println("Array lenth: "+size);
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(intarray[i]);
//		}
		int []a= {100,200,300,400,500};
		int s=a.length;
		for(int i=0;i<s;i++)
		{
			add[i]=a[i]+intarray[i];
			System.out.println(add[i]);
		}
		
	}

}
