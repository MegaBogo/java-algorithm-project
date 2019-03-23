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
		
		/*
		 * 사전 판단 반복과 사후 판단 반복 차이
		 * 
		 * 사전 판단 : while,for문
		 * 결과가 0이면 루프 본문은 한 번도 실행되지 않음.
		 * 
		 * 사후 판단 : do문
		 * 루프 본문은 반드시 한 번은 실행.
		 */
		
		/*
		 * a,b 정수를 받고 b-a를 출력하는 프로그램
		 * 단, b는 a보다 큰수
		 */
		System.out.println("A를 입력하세요 : ");
		int a = stdIn.nextInt();		
		int b;
		
		do {
			System.out.println("B를 입력하세요 : ");
			b = stdIn.nextInt(); 
		} while (a>b);
		
		System.out.println("a-b는 ?"+(b-a));
		
		

	}

}
