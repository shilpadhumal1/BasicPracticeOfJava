package typeCasting;

public class DownCasting 
{
	//in this type of type casting higher order data type or variable is converted in lower order data type
	//while doing down casting there can be loss of information
	//ex:int to byte
	public static void main(String[] args) {
		int a=129;
		byte b=(byte) a;
		System.out.println(b);//b value is -127 i e loss of information is there
	}
}
