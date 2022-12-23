package ch04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 *   Queue(큐) : FIFO 선입선출 / 삽입삭제 양방향
 *  
 *  Queue 용어:
 *  	rear : 큐에서 가장 끝 데이터를 가리키는 영역
 *  	front : 큐에서 가장 앞의 데이터를 가리키는 영역
 *  	add : rear 부분에 새로운 데이터를 삽입하는 연산
 *  	poll : front 부분에 있는 데이터를 삭제하고 확인하는 연산
 *  	peek: 큐 맨 앞(front)에 있는 데이터를 확인할 때 사용하는 연산
 *  
 *   Queue 사용되는 경우
 *   	너비 우선 탐색 BFS(Breadth First Search) 
 *   
 *   우선순위 큐 알아두기 : heap
 * */

public class Exam02 {

	public static void main(String[] args) {
		
		// 카드 게임
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=1; i<= N; i++) {
			queue.add(i);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			
			int temp=queue.poll();
			queue.add(temp);
		}
		
		System.out.println(queue.poll());
		
		sc.close();
	}
}















