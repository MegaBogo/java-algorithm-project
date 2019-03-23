package doIt.chap01;

import java.util.Scanner;

public class Ex01_1 {
	
	//실제 소스에서 static을 사용한다는 의미는 모든 객체가 '공유'한다는 의미
	static int getMaxNum(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if(c > max)
			max = c;	
		
		return max;
	}

	static int getMaxNum(int a, int b, int c, int d) {
		
		//여러 프로세스가 순차적으로 실행되는 구조를 순차적 구조라고 한다.
		int max = a;
		if (b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;		
		
		return max;
	}
	static int getMinNum(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
			
	}
	static int getMinNum(int a, int b, int c, int d) {
		
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		if(d < min)
			min = d;
		
		return min;
		
	}	
	
	public static void main(String[] args) {
		
		System.out.println(getMaxNum(3, 5, 1));
		System.out.println(getMinNum(8,1,5));
				
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("A의 값 : ");
		int a = stdIn.nextInt();
		
		System.out.println("B의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("C의 값 : ");
		int c = stdIn.nextInt();
		
		//여러 프로세스가 순차적으로 실행되는 구조를 순차적 구조라고 한다.
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.printf("제일 큰 값은 ? %d\n", max);
		
		
	}
}
