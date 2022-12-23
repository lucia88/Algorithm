package ch02;

import java.util.Scanner;

/*
 * 문제2) 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
 *          일단 세준이는 자기 점수중 최댓값을 골랐다. 그런 다음 최댓값을 M이라고 할 때 모든 점수를
 *          점수/M*100
 *          으로 고쳤다. 예를 들어 세준이의 최고점이 70점, 수학점수가 50점이라면 수학 점수는
 *          50/70*100 이므로 71.43점이다. 
 *          세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을 작성하시오.
 *          
 *          입력 : 1번째 줄에 시험을 본 과목의 개수 N이 주어진다. 해당 값은 1,000보자 작거나 같다.
 *                   2번째 줄에 세준이의 현재 성적이 주어진다. 해당 값은 100보다 작거나 같은, 음의 아닌 정수이고, 적어도 1개의
 *                   값은 0보다 크다.
 *                   
 *          출력 : 1번째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대 오차 또는 상대 오차가 10^-2이하이면 정답이다.		
 * */

public class Ex03 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("과목 수:");
		int N=sc.nextInt();         // 3
		
		int A[]=new int[N];
		System.out.println("각 과목의 시험 점수");
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();      // 40 80 60
		}
		
		long sum=0;
		long max=0;
		for(int i=0;i<N;i++) {
			sum=sum+A[i];
			if(A[i] > max) max=A[i];
		}

		System.out.println(sum * 100.0 / max / N);    // double 형
		
		sc.close();
	}
}


