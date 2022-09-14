package com.Day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int leapyear=s.nextInt();
		if(((leapyear%4==0)&&(leapyear%100!=0))||(leapyear%400==0)){
			System.out.println(leapyear+ "  this is LeapYear");
		}
		else {
			System.out.println(leapyear+ "  this is not LeapYear");
		}

	}

}
