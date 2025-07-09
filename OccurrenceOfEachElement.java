package com.java.assignments;
import java.util.Scanner;
public class OccurrenceOfEachElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter array Elements");
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] count = new int[size]; // take one count extra array to store count of each element
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>1) {
				System.out.println(i+":"+count[i]);
			}
		}
	}
}