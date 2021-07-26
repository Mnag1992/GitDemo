package javaPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//String str="Nitin";
		System.out.println("Please Enter a String :");
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		String strlower=str.toLowerCase();
		
		String rev="";
		
		for(int i=l-1;i>=0;i--){
			rev=rev+strlower.charAt(i);
		}
		
		if(strlower.equals(rev))
			System.out.println("String is Palindrom");
		else
			System.out.println("String is not Palindrom");

	}

}
