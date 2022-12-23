package ch04;

import java.util.Scanner;
import java.util.Stack;

/*
 *  Stack(스택) : Last-in First-out / FILO 후입선출 / 삽입삭제 한방향
 *  
 *  Stack 용어
 *  	top : 삽입과 삭제가 일어나는 위치를 뜻한다.
 *  	pop : top 위치에 있는 현재 있는 데이터를 삭제하고 확인하는 연산이다.
 *  	peek : top 위치에 현재 있는 데이터를 단순 확인하는 연산이다.
 *  
 *  
 *  Stack 사용되는 경우 
 *  	깊이 우선 탐색 DFS(Depth First Search), 백트랭킹
 *  	참고) 재귀 함수 알고리즘 원리와 일맥상통
 *  	원리 잘알아두기
 *  
 * */

public class Exam01 {			
	public static void main(String[] args) {
		
		// 스택으로 수열 만들기
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		Stack<Integer> stack=new Stack<Integer>();
		
		int num=1;
		boolean result=true;
		StringBuffer bf=new StringBuffer();
		
		for(int i=0;i<A.length;i++) {
			int su=A[i];			// 수열
			if(su >= num) {
				while(su >=num) {
					stack.push(num ++);
					bf.append("+ \n");
				}
				stack.pop();
				bf.append("- \n");
			}else {
				int n=stack.pop();
				if(n > su) {
					System.out.println("NO");
					result=false;
					break;
				}else {
					bf.append("- \n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
		
		sc.close();
	}
}
