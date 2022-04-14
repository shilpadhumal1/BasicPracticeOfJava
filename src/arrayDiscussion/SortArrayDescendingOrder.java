package arrayDiscussion;

public class SortArrayDescendingOrder 
{
	public static void main(String[] args)
	{
		int []a= {0,59,22,24,19,2,5};
		int m=0;
		for(int i=0;i<7;i++)
		{
			for(int j=i+1;j<7;j++)
			{
				if(a[i]<a[j])
				{
					m=a[i];
					a[i]=a[j];
					a[j]=m;
		
				}
				
			}
		
			System.out.println(a[i]);
		}
	}

}
