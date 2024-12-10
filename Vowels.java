package com;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		countVowels(str);
	}
	public static void countVowels(String n) {
		n =n.toLowerCase();
		int vc=0;
		for(int i=0;i<n.length();i++) {
			char ch=n.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vc++;
			}
		}
		if(vc>4)
			System.out.println("true");
		else
			System.out.println("false");
	}

}






