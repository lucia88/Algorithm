package ch04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 *   Queue(ť) : FIFO ���Լ��� / ���Ի��� �����
 *  
 *  Queue ���:
 *  	rear : ť���� ���� �� �����͸� ����Ű�� ����
 *  	front : ť���� ���� ���� �����͸� ����Ű�� ����
 *  	add : rear �κп� ���ο� �����͸� �����ϴ� ����
 *  	poll : front �κп� �ִ� �����͸� �����ϰ� Ȯ���ϴ� ����
 *  	peek: ť �� ��(front)�� �ִ� �����͸� Ȯ���� �� ����ϴ� ����
 *  
 *   Queue ���Ǵ� ���
 *   	�ʺ� �켱 Ž�� BFS(Breadth First Search) 
 *   
 *   �켱���� ť �˾Ƶα� : heap
 * */

public class Exam02 {

	public static void main(String[] args) {
		
		// ī�� ����
		
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















