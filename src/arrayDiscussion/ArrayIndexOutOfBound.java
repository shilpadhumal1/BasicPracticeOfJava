package arrayDiscussion;

public class ArrayIndexOutOfBound 
{
	public static void main(String[] args) {
		int []a=new int[5];
		
		
		try {
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;	
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println("Array is out of size: " +k.getMessage());
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	

}
