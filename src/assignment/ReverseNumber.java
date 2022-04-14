package assignment;

public class ReverseNumber 
{
	
		public static void main(String[] args) 
		{

	        int num =1417,r = 0;
	        //int temp=num;
	        while(num != 0) //loop1: condition is true
	        	//loop2:condition is true//num=141
	        	//loop3:condition is true//num=14
	        	////loop4:condition is true//num=1
	        	//loop5:num=0//condition false
	        {
	            int digit = num % 10;//loop1: remainder: last digit 7
	            					//loop2: remainder: last digit: 1
	            					//loop3:remainder:last digit:4
	            					//loop4:remainder:last digit:1
	            
	            
	            r = r * 10 + digit;   //loop1:r=7   
	            					//loop2: r=7*10+1=71
	            					//loop3:r=71*10+4=714
	            					//loop4:r=714*10+1=7141          
	            
	            num=num / 10;//loop1:num=141
	            			//loop2:num=14
	            			//loop3:num=1
	            			//loop4:num=1/10=0
	        }
	        System.out.println(r);
	        System.out.println(num);
	        if(num==r)
	        System.out.println("palindrome");
	    
	}
}
