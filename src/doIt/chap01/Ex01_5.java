package doIt.chap01;

import java.util.Scanner;

public class Ex01_5 {

	public static void main(String[] args) {
		/*
		 * 양수만 더하기 
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("N의 값 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("합 : "+sum);
		

	}

}
