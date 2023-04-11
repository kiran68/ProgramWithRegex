package com.bridgelabz.ragex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RagexDemo {

	public static void main(String[] args) {
		System.out.println("Enter The First Name : ");
		Scanner sc = new Scanner(System.in);
		String data =sc.nextLine();
		
		String regex = ( "^[A-Z][a-zA-Z]{2,}$");
		Pattern pattern = Pattern.compile(regex);
		
		
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();
		
		if (result) {
			System.out.println("First Name : " + data);
		}
		else{
	System.out.println("Pattern not matches");
		}
		
			
		
	}
}
