/*
 * Question 51: 
You are given a sorted array containing n-1 unique integers in the range 
from 1 to n. There may be one or more integers missing from the array. 
Write a method to find and print all missing integers. 
Example: 
Input: 
nums = [1, 2, 4, 7, 19] 
Output: 
[3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
 */

package com.nit_51_60;

public class Question51 {

	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 7, 19};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr[i] ; j<arr[i+1];j++)
			{
				if(j!=arr[i])
				System.out.print(j+" ");
			}
		}

	}

}
