/*
 * Question 59: 
Fill from Index to End with given Value based on user 
 Write a program to fill an array from index 2 to the endIndex 4 with the 
 constant value 10 in the array 
 {1, 2, 3, 4, 5, 6}. 
 Output: {1, 2, 10, 10, 10, 6}
 */

package com.nit_51_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question59 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from Index Number ");
		int i1 = sc.nextInt();
		System.out.println("Enter to Index number ");
		int i2=sc.nextInt();
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		for(int i=0;i<arr.length;i++)
		{
			if(i>=i1 && i <=i2)
			{
				arr[i]=10;
			}
		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);

	}

}
