package javabasics;

public class Switch {

	public static void main(String[] args) {
		int weekday=4;
		switch (weekday) {
		case 1:
			System.out.println("this is monday");
			break;
		case 2:
			System.out.println("this is tuesday");
			break;
		case 3:
			System.out.println("this is wednesday");
			break;
		case 4:
			System.out.println("this is thursday");
			break;
		case 5:
			System.out.println("this is friday");
			break;
		case 6:
			System.out.println("this is saturday");
			break;
		case 7:
			System.out.println("this is sunday");
		default:
		System.out.println("invalid weekday.please enter the value between 1-7");	
		}
		}
	}

		
		

	


