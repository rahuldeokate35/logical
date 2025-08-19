/*
 * Question 48: 
Split Array into N Equal Parts 
Write a program to split an array {1, 2, 3, 4, 5, 6, 7, 8, 9} into 3 equal parts. 
Output: 
Part 1: {1, 2, 3} 
Part 2: {4, 5, 6} 
Part 3: {7, 8, 9}
 */

package com.nit_41_50;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question50a {

	public static void main(String[] args) 
	{
		int base[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arr1[]= new int[3];
		int arr2[]= new int[3];
		int arr3[]= new int[3];
		int a=0;
		int b=0;
		for(int i=0;i<base.length;i++)
		{
			if(i<3)
			{
				arr1[i]=base[i];
			}
			else if(i>=3  && i<6)
			{
				arr2[a++]=base[i];
			}
			else
			{
				arr3[b++]=base[i];
			}
		}
		IntStream intStream1 = Arrays.stream(arr1);
		IntStream intStream2 = Arrays.stream(arr2);
		IntStream intStream3 = Arrays.stream(arr3);
		
		System.out.println("Array 1");
		intStream1.forEach(System.out::println);
		System.out.println("Array 2");
		intStream2.forEach(System.out::println);
		System.out.println("Array 3");
		intStream3.forEach(System.out::println);

	}

}
