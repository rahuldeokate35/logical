/*
 * Question 53: 
Write a java program to count and print all the elements which 
contains 2 in it. 
Input as : {1,12,32,44,222,102,34,56,67,125} 
Output as : 12, 32, 222, 102, 125
 */

package com.nit_51_60;

public class Question53 {

	public static void main(String[] args) {
		
		int arr[]={1,12,32,44,222,102,34,56,67,125};
		int rem=0;
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			int num= arr[i];
			while(num!=0)
			{
				rem=num%10;
				num/=10;
				if(rem==2)
				{
					flag=true;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
