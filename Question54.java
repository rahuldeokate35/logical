/*
 * Question 54: 
Write a java program to shift all the zeros to the end of the  
given array without changing the order of non-zero elements. 
Input as : {1,0,0,4,5,0,0,1}; 
Output as : {1,4,5,1,0,0,0,0}
 */

package com.nit_51_60;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question54 {

	public static void main(String[] args) {
		

		int arr[]= {1,0,0,4,5,0,0,1};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<=0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		IntStream intStream= Arrays.stream(arr);
		intStream.forEach(System.out::println);
	}

}
