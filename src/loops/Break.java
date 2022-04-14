package loops;

public class Break
{
	public static void main(String[] args) {
		int i =1;
		while(i<=10)
		{
			System.out.println(i);
			
			if(i==1)
			{
				
				break;
				
			}
			
			i++;
			
		}
		//lebelled for loop
		
		outerforloop: for(i=1;i<5;i++)
		{
			innerforloop: for(int j=1;j<=5;j++)
			{
				System.out.println("Inner for loop");
				if(j==2)
				{
					break innerforloop;
				}
			}
			if(i==1)
			{
				break outerforloop;
			}
			
			
		}
	}

}
