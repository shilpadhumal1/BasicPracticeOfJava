package datatypes;

public class DataTypes {
	public static void main(String[] args) {
		
		//Primitive data types		
		//numeric types without decimal
		//byte= 1 byte or 8 bits maximum value= +127 to -128
		byte bz = 127;
		byte c = -128;
		System.out.println("numeric primitive data type byte is: " +bz);
		System.out.println("numeric primitive data type byte is: " +c);
		
		//Primitive data types		
		//numeric types without decimal
		//short = 2 bytes or 16 bits maximum value= +32767 to -32768
		short sh = 32767;
		short shh = -32768;
		System.out.println("numeric primitive data type short is: " +sh);
		System.out.println("numeric primitive data type short is: " +shh);
		
		//Primitive data types		
		//numeric types without decimal
		//integer = 4 bytes or 32 bits maximum value= +2147483647 to -2147483648
		int i = 2147483647;
		System.out.println("numeric primitive data type integer is" +i);
		
		//Primitive data types		
		//numeric types without decimal
		//long = 8 bytes or 64 bits maximum value= 2^(63)-1 to -2^(63)
		long l = 1257678;
		System.out.println("numeric primitive data type long is: " +l);
		
		//Primitive data types		
		//numeric types with decimal
		//float 4 bytes range -3.4*10^38 to 3.4*10^38
		float f = 5.23112f;
		float xy = 5.23112f;
		float xyz=f+xy;
		System.out.println("numeric primitive data type float is: " +xyz);
		
		//Primitive data types		
		//numeric types with decimal
		//double 8 bytes range -3.4*10^308 to 3.4*10^308
		double d = 23253663.262553;
		System.out.println("numeric primitive data type double is: " +d);
		
		//Primitive data types
		//non numeric  type
		//Boolean data type has only 2 options true or false
		boolean b=true;
		boolean bb = false;
		System.out.println("non numeric primitive data type boolean is: " +b);
		System.out.println("non numeric primitive data type boolean is: " +bb);
		
		//Primitive data types
		//Non numeric
		//char = 2 bytes
		char ch = 's';
		char cc = '#';
		System.out.println("non numeric primitive data type char is: " +cc);
		System.out.println("non numeric primitive data type char is: " +ch);
		String s = "gjjaxssdd";
		System.out.println(s);
		
				
	}
}