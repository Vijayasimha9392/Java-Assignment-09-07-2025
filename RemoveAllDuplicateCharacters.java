package com.java.assignments;
import java.util.Scanner;
public class RemoveAllDuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		int[] ch = new int[256]; // taken extra ch array to store the each character
		for(int i=0; i<str.length(); i++) {
			ch[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length();i++) {
			if(ch[str.charAt(i)]==1) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
}