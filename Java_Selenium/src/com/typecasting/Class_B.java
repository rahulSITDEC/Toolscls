package com.typecasting;

public class Class_B implements Class_A {


	@Override
	public void greens() {
		// TODO Auto-generated method stub
		System.out.println("CLass b greens");
	}

	@Override
	public void alvin() {
		// TODO Auto-generated method stub
		System.out.println("Class b alvin");
	}
	
	
	public static void main(String[] args) {
		System.out.println("*******UPCASTING**************");
		Class_A b= new Class_B();        //TYPE CASTING(upcasting)
		b.alvin();
		b.greens();
		System.out.println("**********DOWNCASTIG*************");
		Class_B newb = (Class_B) b;
		newb.alvin();
		newb.greens();
		
		
		
	}

}
