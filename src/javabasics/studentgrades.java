package javabasics;

public class studentgrades {

	public static void main(String[] args) 
	{
		int marks =101;
		if(marks<35 && marks>=0)
		{
			System.out.println("Failed");
		}
		else if(marks>=35 && marks<45)
		{
			System.out.println("D");
		}
		else if(marks>=45 && marks<55 )
		{
			System.out.println("C");
		}
		else if (marks>=55 && marks<70)
		{
			System.out.println("B");
		}
		else if(marks>=70 && marks<=100)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
