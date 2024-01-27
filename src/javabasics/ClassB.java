package javabasics;

public class ClassB 
{
	void meth(int a,int b)
	{
		System.out.println("sum of two numbers is:"+(a+b));
	}
	public static void main(String[] args) 
	{
		ClassB bobj =new ClassB();
		bobj.meth(37, 49);
		}
}
