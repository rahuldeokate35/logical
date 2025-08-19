/*
 * Question 47: Delete All Occurrences of an Element 
 Write a program to delete all occurrences of the element  
 2 from the array  
 {1, 2, 3, 2, 4, 2, 5}. 
 Output: {1, 3, 4, 5}
 */

package com.nit_41_50;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question47 {

	public static void main(String[] args) {
		

		int arr[]= {1, 2, 3, 2, 4, 2, 5};
		
		for(int i=0;i<arr.length;i++)
		{
			boolean f=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i != j)
				{
					f=true;
					break;
				}
			}
			if(f)
			{
				
				System.out.println("Count "+"  Array Value"+arr[i]);
				arr[i]=0;
			}
		}
		
		IntStream intStream = Arrays.stream(arr);
		
		intStream.forEach(System.out::println);
	}

}
