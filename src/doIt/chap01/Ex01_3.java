package doIt.chap01;

import java.util.Scanner;

public class Ex01_3 {
	
	public static void main(String[] args) {
		
		/*
		 * 반복
		 * 
		 * 1부터 n까지의 정수 구하기.
		 */
		
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 값을 구합니다.");
		System.out.println("n의 값을 입력 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 N까지 더한 값은? %d\n", sum);
		
		
		i = 1;
		sum = 0;
		for (i = 1; i <=n ; i++) {
			sum += i;
		}
		System.out.printf("1부터 N까지 더한 값은? %d", sum);
		
	}

}
