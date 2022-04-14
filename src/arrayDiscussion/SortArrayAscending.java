package arrayDiscussion;

public class SortArrayAscending
{
	public static void main(String[] args) {
		int [] a=new int[5];
		a[0]=34;
		a[1]=21;
		a[2]=22;
		a[3]=13;
		a[4]=20;
		int m=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])//1st cycle of i=0		//j=1 34>21 true
													//j=2	21>22 false
													//j=3 	21>13	true
													//j=4	13>20
				{
					m=a[i];//when j=1  m=34  //when j=3 m=21
					//System.out.println(m);
					
					a[i]=a[j];	//a[0]=21		//when j=3 a[0]=13
					//System.out.println(a[i]);
					
					a[j]=m;//a[1]=34		//when j=3	a[3]=21
					//System.out.println(a[j]);
					
					//System.out.println();
				}
			}
			//break;
			System.out.println(a[i]);		
		}
		
		
		
		
	}

}
