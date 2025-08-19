/*
 * Question 58: 
Fill from Index to End with given Value 
 Write a program to fill an array from index 2 to the end with the 
 given value 10 in the array {1, 2, 3, 4, 5, 6}. 
 Output: {1, 2, 10, 10, 10, 10}
 */

package com.nit_51_60;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Question58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int arr [] ={1, 2, 3, 4, 5, 6};
		
		for(int i=0;i<arr.length;i++)
		{
			if(i>=num)
			{
				arr[i]=10;
			}
		}
		IntStream is = Arrays.stream(arr);
		is.forEach(System.out::println);

	}

}
