package practiceset2;

import java.util.Arrays;

public class ArraysEqualOrNot 
{
	public static void main(String[] args) 
	{
		//. Java program to check two arrays are equal or not:
		int[] arr= {10,20,30};
		int[] arr1= {20,30,40};
		int[] arr2= {10,20,30};
		//arrays.equals(arg[0],arg[1]); this method is used to compare two multidimentional arrays
		
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));
		
	}

}
