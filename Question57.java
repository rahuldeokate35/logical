/*
 * Question 57: 
Compare Two Arrays for Equality 
 Write a program to compare whether the arrays {1, 2, 3, 4, 5} and {1, 2, 3, 4, 5} are equal. 
 Output: True if the arrays are equal, otherwise False. 
 */

package com.nit_51_60;

public class Question57 {

	public static void main(String[] args) {
		
		int arr1 []={1, 2, 3, 4, 5};
		int arr2 []={1, 2, 3, 6, 5};
		if(arr1.length ==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
				{
					
				}
				else
				{
					System.out.println("Not Equal Arrays ");
					System.exit(0);
				}
			}
			System.out.println("It is Equal Arrays ");
		}
		else
		{
			System.out.println("Not Equal");
		}

		
	}

}
