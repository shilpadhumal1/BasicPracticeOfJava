package typeCasting;

public class RulesForTypeCasting 
{
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		int c=0;//byte+byte=int
		c=a+b;
		System.out.println(c);
		short d=14;
		short e=16;
		c=d+e;//short+short=int
		System.out.println(c);
		c=a+d;//short+byte=int
		int f=17;
		int g=c+d;//int+int=int
		long k=123;
		long m=a+k;//int/byte/short  + long=long
		double n=123.23;
		double p=n+k;//long+double=double
		
	}

}
