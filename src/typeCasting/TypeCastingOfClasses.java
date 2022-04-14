package typeCasting;

public class TypeCastingOfClasses extends Parent
{
	public void m2()
	{
		System.out.println("m1 Method From Child Class");
	}
	public static void main(String[] args)
	{
		
		TypeCastingOfClasses o1=new TypeCastingOfClasses();
		o1.m1();
		//Parent o2=(Parent) o1;
		//o1.m1();
		//o2.m1();
		//TypeCastingOfClasses c1=new Parent();
		Parent o3=new Parent();
		o3.m1();
		TypeCastingOfClasses o4=(TypeCastingOfClasses) o3;//here we are trying to hold parent object by 
														  //child reference hence this gives an exception called ClassCastExceptio
		
		o4.m2();
		
		
	}
	
	

}
