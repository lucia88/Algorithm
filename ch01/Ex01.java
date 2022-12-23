package ch01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 세 값의 최대값 구하기

		Scanner sc=new Scanner(System.in);
		
		System.out.println("a value:");
		int a=sc.nextInt();			// 10
		
		System.out.println("b value:");
		int b=sc.nextInt();		// 25
		
		System.out.println("b value:");
		int c=sc.nextInt();			// 5
		
		int max=a;					// max=10
		
		if(b > max) {				// 25 > 10
			max=b;					// 25
		}
		
		if(c > max) {				 // 5 > max
			max=c;
		}
		
		System.out.println("최대값:" + max);
		
		sc.close();
	}
}

