/*
 * Question 52: 
You are given an array of integers and an index number.  
Implement a method to rotate left from the given index. 
arr = [1,2,3,4,5,6] 
int index = 3 
Output : 4 5 6 1 2 3 
arr = [1,2,3,4,5,6,7,8] 
int index = 3 
output: 4 5 6 7 8 1 2 3
*/
package com.nit_51_60;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question52 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num= sc.nextInt();
		int arr[] = {1,2,3,4,5,6};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(i>=num)
				{
					temp=arr[num];
					arr[num]=arr[j];
					arr[j]=temp;
				}
			}
		}
		IntStream intStream = Arrays.stream(arr);
		intStream.forEach(System.out::println);

	}

}

