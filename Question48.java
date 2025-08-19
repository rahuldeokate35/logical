/*
 * Question 49: Resize Array by Decreasing the Size 
Write a program to resize an array {1, 2, 3, 4, 5} to a  
smaller size and remove the last element. 
Output: 
Resized array: {1, 2, 3, 4}
 */

package com.nit_41_50;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question48 {

	public static void main(String[] args) 
	{
		int arr[]={1, 2, 3, 4, 5};
		int reSize[]= new int[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++)
		{
			reSize[i]=arr[i];
		}
		
		IntStream intStream = Arrays.stream(reSize);
		intStream.forEach(System.out::println);

	}

}
