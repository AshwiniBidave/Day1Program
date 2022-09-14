package com.Day1;

import java.util.Scanner;

public class CheckString2 {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1St String ");
		String a=s.nextLine();
		System.out.println("Enter 2nd String ");
        String b=s.nextLine();
        if(a.equals(b))
        {
        	System.out.println("Both String are Equals ");
        }
        else
        {
        System.out.println("Both String are not Equals");	
        }

	}
}
