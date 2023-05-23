package com.dedalus;

  class MyClass {

	static int a;
	int c=99999;
	public void display()
	{
	
		
		System.out.println("A="+a);
		int b=9;
		System.out.println("B="+b);
		
		MyClass z = new MyClass();
		System.out.println("C="+z.c);
	
	}
	
 public class Child
{
	static String str="Abi";
	public static void main(String[] args)
	{
		
		MyClass mc = new MyClass();
		mc.display();
		
		System.out.println(str);
		
		int d=90;
		System.out.println("D="+d);
	}

}
  }

 
