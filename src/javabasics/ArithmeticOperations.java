package javabasics;

public class ArithmeticOperations 
{
	int a=28;
	int b=5;
	void operations()
	{
	System.out.println("Sum of two numbers is:" +(a+b));
	System.out.println("substraction of two numbers:" +(a-b));
	System.out.println("Multiplication of two numbers:" +(a*b));
	System.out.println("division of two numbers is:" +(a/b));
	System.out.println("modulus of two numbers is :" +(a%b));
	}

	public static void main(String[] args) 
	{
		ArithmeticOperations aobj=new ArithmeticOperations();
		aobj.operations();
		}
}
