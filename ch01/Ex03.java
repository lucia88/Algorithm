package ch01;

/*
 * ** 시간 복잡도 계산
 * 		연산 횟수 = 알고리즘 시간 복잡도 * 데이터의 크기
 * 		상수는 시간 복잡도 계산에서 제외한다.
 * 		가장 많이 중첩된 반복문의 수행 횟수가 시간 복잡도의 기준이 된다.
 * 
 * */

public class Ex03 {
	public static void main(String[] args) {
		
		// 연산 횟수가 n인 경우
		int N=100000;          // 10만 - 일반적으로 1억 번의 연산을 1초의 시간으로 간주
		int cnt=0;
		for(int i=1;i<N;i++) {
			System.out.println("연산 횟수:" + ++cnt);             // 빅-오 O(n) 
		}
		
		System.out.println("\n");
	}
}
