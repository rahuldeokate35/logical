/*
 * Question 56: 
Given a sorted array of integers, remove duplicates such that each element 
appears only once. Print the elements without duplicates. 
Input: 
 nums = [1, 1, 2, 2, 3, 4, 4, 5] 
 Output: 
 [1, 2, 3, 4, 5]
 */

package com.nit_51_60;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Question56 {

	public static void main(String[] args) {
		

		int temp=0;
		int arr[]= {1, 1, 2, 2, 3, 4, 4, 5};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				arr[i]=0;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
//		IntStream intStream = Arrays.stream(arr);
//		intStream.distinct().forEach(System.out::println);
		
	}

}
