package doIt.chap01;

import java.util.Scanner;

public class Ex01_2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		

		if(n == 1)
			System.out.println("N은 1입니다");
		else if(n==2)
			System.out.println("N은 2입니다.");
		else if(n==3)
			System.out.println("N은 3입니다.");
		else
			;
		
		
		/*
		 * 연산자와 피 연산자
		 * 
		 * 연산자(operator) 
		 * : +,-등의 연산 기호
		 * 
		 * 피연산자(operand)
		 * 연산의 대상이 되는 것
		 * 
		 * 3항 연산자 & 조건 연산자(conditional operator)
		 * 
		 * a ? b : c
		 */
		
		int x = 1;
		int y = 2;
		int a = (x>y) ? x : y;
		
	}
}
