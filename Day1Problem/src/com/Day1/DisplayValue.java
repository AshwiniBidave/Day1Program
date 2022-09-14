package com.Day1;

public class DisplayValue {
	int a;
	double b;
	char c;
	boolean t;
	long d;
	short s;
	float f;
	byte b1;
	DisplayValue(){
		
	}
	void display() {
		System.out.println(	"int "+a+ ", double "+b+", char "+c+", boolean "+t+", short " +s+ ", float " +f+", byte "+b1+ ", long "+d);

	}
	public static void main(String[] args) {
		DisplayValue d1=new DisplayValue();
		d1.display();
		
		
		

	}

}
