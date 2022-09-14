package com.Day1;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count=0;
		int n;
	
		for(int i=0;i<args.length;i++){
			try {
			n=Integer.parseInt(args[i]);
			sum = sum + n;
		}catch(NumberFormatException e){
	
		count++;
		}}
			System.out.println("Total no.of arguments: "+args.length);
			System.out.println("Sum of only valid integers is= "+sum) ;

			System.out.println("Invalid integers are: "+count) ;
 
	}

}
