package arrayDiscussion;

public class ArrayEvenOdd 
{
	
	public static void main(String[] args) {
		int []a=new int[10];
		a[0]=1;
		a[1]=11;
		a[2]=11;
		a[3]=13;
		a[4]=14;
		a[5]=15;
		a[6]=16;
		a[7]=17;
		a[8]=18;
		a[9]=19;
		for(int b:a)
		{
			if(b%2==0)
			System.out.println("Even No:\n"+b);
			
			
		}
		for(int b:a)
		{
			if(b%2!=0)
				System.out.println("odd no:\n"+b);
		}
	}
	

}
