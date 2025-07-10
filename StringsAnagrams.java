package com.java.assignments;
import java.util.Scanner;

public class StringsAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sc.next();
		System.out.println("Enter second String");
		String str2 = sc.next();
		
		int[] arr = new int[128]; //created an array to check the freq
		if((str1.length())!=(str2.length())) { //if len is not equal strings are not anagrams
			System.out.println("Not Anagram");
			return;
		}
		
		for(int i=0; i<str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			arr[ch1]++;
			arr[ch2]--;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) { //if there is no match result should not be 0
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}

}
// STRING