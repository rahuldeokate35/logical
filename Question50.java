/*
 * Question 50: 
You are given a sorted array containing n-1 unique integers in  
the range from 1 to n. There is exactly one integer missing. 
Write a method to find and return the missing integer. 
Input: 
nums = [1, 2, 4, 5, 6] 
Output: 3 
 */

package com.nit_41_50;

public class Question50 {

	public static void main(String[] args) {
		

		int arr[]= {1, 2, 4, 5, 6,10};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]-arr[i]==1 || arr[i]-arr[i+1]==1)
			{
				
			}
			else
			{
				System.out.println(arr[i]+1);
			}
		}
	}

}
