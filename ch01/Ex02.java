package ch01;

/*
 * ** 시간 복잡도 유형
 * 		빅-오메가(Ω(n)) : 최선일 때(Best Case)의 연산 횟수를 나타낸 표기법
 * 		빅-세타(Θ(n)) : 보통일 때(Average Case)의 연산 횟수를 나타낸 표기법
 * 		빅-오(O(n)) : 최악일 때(Worst Case)의 연산 횟수를 나타낸 표기법
 * */

public class Ex02 {
	public static void main(String[] args) {
		
		// 1~100 사이 값 랜덤 선택
		int su=(int) (Math.random() * 100);
		
		/* 시간 복잡도
		 * 0(su) 1번 반복, 
		 * 50(su) 50번 반복 == N(100)/2
		 * 99(su) 99번 반복  */
		
		for(int i=0; i<100; i++) {
			if(i==su) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
