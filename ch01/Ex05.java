package ch01;

public class Ex05 {

	public static void main(String[] args) {
		
		// 연산 횟수가 n^2인 경우
		int N=100000;
		int cnt=0;
		for(int i=0;i<N;i++) {                     // n
			for(int j=0;j<N;j++) {                //  n, 즉 n^2  30만
				System.out.println("연산 횟수:" + ++cnt);
			}
		}
	}
}
