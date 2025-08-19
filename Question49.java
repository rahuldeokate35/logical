/*
 * Question 50: 
Split and Resize Array 
Write a program that first splits the array 
{1, 2, 3, 4, 5, 6, 7, 8}  
into two equal parts and then resizes each part to size 5.  
The extra space should be filled with 0s. 
Output: 
First part: {1, 2, 3, 4, 5} 
Second part: {6, 7, 8, 0, 0}
 */
package com.nit_41_50;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question49 {

	public static void main(String[] args) {
		
		int base[]= {1, 2, 3, 4, 5, 6, 7, 8};
		int arr1[] = new int[base.length/2];
		int arr2[] = new int[base.length/2];
		
		int p=0;
		for(int i=0;i<base.length;i++)
		{
			if(i<base.length/2)
			{
				arr1[i]=base[i];
			}
			else
			{
				arr2[p++]=base[i];
			}
		}
		IntStream intStream1 = Arrays.stream(arr1);
		IntStream intStream2 = Arrays.stream(arr2);
		System.out.println("First Array ...");
		intStream1.forEach(System.out::println);
		System.out.println("Second Array ....");
		intStream2.forEach(System.out::println);

	}

}
