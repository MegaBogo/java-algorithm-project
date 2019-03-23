package doIt.chap01;

import java.util.Scanner;

public class Ex01_6 {
	public static void main(String[] args) {
		/*
		 * 구조적 프로그래밍
		 * 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법.
		 * 구조적 프로그래밍은 순차, 선택, 반복이라는 3종류의 제어 흐름을 사용
		 */
		
		/*
		 * 논리 연산과 드모르간 법칙
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력 : ");
			no = stdIn.nextInt();
		} while (no < 10 || no >99);
		
		System.out.println(no);
		
		/*
		 * 논리곱 
		 * &&
		 * 
		 * 논리합
		 * ||
		 * 
		 * 논리 연산자의 단축 평가
		 * no에 입력한 값이 5인 경우 식 no < 10의 평갓값은 true이므로 오른쪽 피연산자 no > 99를 평가하지 않아도 
		 * 제어식 no < 10 || no > 99의 값은 true.
		 * 
		 *  이처럼 논리 연산자의 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 정해지는 경우 오른쪽 피 연산자의 평가를 수행하지 않는데, 이를 단축 평가라고 함.
		 */
		
		/*
		 * 드모르간 법칙이란?
		 * 드 모르간의 법칙 (De Morgan's laws)은 수리 논리학이나 집합론에서 논리곱(집합의 공통 부분),
		 * 논리합(집합의 모든 부분), 부정(여집합) 연산간의 관계(드 모르간의 상대성이라고 부름)를 기술하여 정리한 것으로,
		 * 수학자 오거스터스 드 모르간의 이름을 따서 드 모르간의 법칙이라고 한다.
		 * 
		 * 전기, 전자 공학적으로는 논리 회로에서 응용되기도 하는데, AND 연산과 OR 연산을 이용한다.
		 * 
		 * '각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다
		 * 
		 * x && y와 !(x || !y)는 같다.
		 * x || y와 (!x && y!)는 같다.
		 */

		do {
			System.out.println("입력 : ");
			no = stdIn.nextInt();
		} while (!(no >= 10 && no <= 99));
		
		System.out.println(no);
		
		
		
	}
}
