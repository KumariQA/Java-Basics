package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Array1 {

	public static void main(String[] args) {
//		List<String>value=new ArrayList<>();
//		value.add("Manual Testing");
//		value.add("Selenium");
//		value.add("Automation");
//		System.out.println(value.size());
//		int i;
//		for(i=0;i<value.size();i++)
//		{
//			System.out.println(value.get(i));
		
		
		List<Object> value=new ArrayList<>();
		value.add("Selenium");
		value.add(100);
		value.add('@');
		System.out.println(value.size());
		int i;
		for(i=0;i<value.size();i++) {
		System.out.println(value.get(i));
		}
		
		
	}

}
