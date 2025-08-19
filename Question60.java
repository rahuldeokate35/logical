/*
 * Question 60: 
Check the given array is sorted(it can be Ascending order or 
descending order) or not if sorted then return true if not sorted 
then return false.  
 
     int[] a = {13, 4, 23,  2, 2, 4} 
     Output : Is sorted : false 
 
     int[] a = {3,5,6,7,8} 
     Output : Is sorted : true
 */

package com.nit_51_60;

public class Question60 {

	public static void main(String[] args) {
		

		int arr[]= {13, 4, 23,  2, 2, 4};
		int c1 =0;
		int c2=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				c1++;
				System.out.println("c1 "+c1);
			}
			if(arr[i]<arr[i+1])
			{
				c2++;
				System.out.println("c2 "+c2);
			}
				
			
		}
		System.out.println(arr.length);
		if(arr.length-1==c1 || arr.length-1==c2)
		{
			System.out.println("It is Sorted Array ");
		}
		else
		{
			System.out.println("It is not sorted");
		}
	}

}
