package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 구간의 합
 * 
 * 구간의 합 :  배열을 이용하여 시간 복잡도를 더 줄이고 위해 사용하는 특수한 목적의 알고리즘
 * 구간의 합 핵심 이론 : 구간 합 알고리즘을 활용하려면 먼저 합 배열을 구한다. (배열 A가 있을 때 합 배열 S는 다음과 같다)
 *                               합배열 공식 : S[i]=S[i-1]+A[i]
 *                               구간합 공식 : S[j]-S[i-1]
 *                               
 *  문제 3) 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그래밍 작성하시오.
 *             입력 : 1번째 줄에 수의 개수 N(1 ≤ N ≤ 100,000), 합을 구해야 하는 횟수 M(1 ≤ M ≤ 100,000)
 *                      2번째 줄에 N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수이다. 3번째줄 부터는 M개의 줄에 
 *                      합을 구해야하는 구간 i와 j가 주어진다.
 *                      
 *             출력 : 총 M의 줄에 입력으로 주어진 i번째 수에서 j번째 수까지의 합을 출력한다.
 * */

public class Ex01 {

	public static void main(String[] args) throws IOException {
		System.out.println("(숫자 개수 / 질의 개수 입력:)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int suNo=Integer.parseInt(st.nextToken());
		int quizNo=Integer.parseInt(st.nextToken());
		// System.out.println(suNo + " " + quizNo);
		
		long[] s=new long[suNo+1];
		
		// 전체 합
		System.out.println("(데이터 입력:)");
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=suNo;i++) {
			s[i]=s[i-1]+Integer.parseInt(st.nextToken());
			System.out.print(s[i] + "\t");
		}
		System.out.println();

		// 구간 합
		System.out.println("구간 입력(i~j)");
		for(int q=0; q<quizNo;q++) {
			System.out.println("(데이터 입력:)");
			st=new StringTokenizer(br.readLine());
			
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			System.out.print(s[j]-s[i-1]);
		}
	}
}
