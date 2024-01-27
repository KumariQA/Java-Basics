package javabasics;

public class Arrays {

	public static void main(String[] args) {
//		int value[][]= {{1,2,3},{4,5,6},{7,8,0}};
//		int i,n;
//		for(n=0;n<value.length;n++) {
//			for(i=0;i<value[n].length;i++) {
//				System.out.print(value[n][i]+" ");
//			}
//			System.out.println();
		
		
		String value [][]= {{"CSE","ECE","EEE"},{"BBA","BCA","BSC"},{"MBA","MCA","MSC"}};
		System.out.println(value.length);
		int i,j;
		for(i=0;i<value.length;i++) {
			for(j=0;j<value[i].length;j++) {
				System.out.print(value[i][j]+" ");
			}
			System.out.println();
			
		}
		}
	}
