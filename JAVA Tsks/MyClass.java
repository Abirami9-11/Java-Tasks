import java.lang.*;

class MyClass
{
static int y;	
int z=99;
public static void main (String[] args)
{
	int x=9;
	System.out.println("Welcome "+x);
	System.out.println("Y ="+y);
	MyClass mc = new MyClass();
	System.out.println("z =" +mc.z);
}
}