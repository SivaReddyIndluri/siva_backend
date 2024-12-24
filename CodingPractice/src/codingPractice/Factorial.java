package codingPractice;

import java.util.Scanner;

public class Factorial {
	public void m1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int value = 1;
		for(int i =1 ; i<=num;i++) {
			value = value*i;
		}
		System.out.println(value);
		
	}
	
	public static void main(String[] args) {
		Factorial s = new Factorial();
		s.m1();	
	}
}
