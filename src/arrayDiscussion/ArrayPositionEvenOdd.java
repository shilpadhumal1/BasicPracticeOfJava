package arrayDiscussion;

public class ArrayPositionEvenOdd
{
	public static void main(String[] args) {
		int []a=new int[10];
		a[0]=10;
		a[1]=11;
		a[2]=22;
		a[3]=13;
		a[4]=23;
		a[5]=15;
		a[6]=27;
		a[7]=17;
		a[8]=35;
		a[9]=19;
		int s=a.length;
		for(int i=0;i<s;i++)
		{
			if(i%2==0)
				System.out.println(a[i]);
		}
		
	}

}
