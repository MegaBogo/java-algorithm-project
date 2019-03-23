package doIt.chap01;

import java.util.Scanner;

public class Ex01_4 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		if(n == 7) {
			int sum = 0;
			for (int i = 1; i <=n; i++) {
				sum += i;
			}
			System.out.println(sum);
			
		}
		
		/*
		(1+10)*5
		(2+9)*5
		*/
		
		int x = 1;
		System.out.println("1부터 n까지의 정수의 합");
		n = stdIn.nextInt();
		System.out.println(n * (2 * x + (n - 1) * 1) / 2);
		
		
		
		
	}
}
