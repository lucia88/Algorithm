package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Exam03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ���� �� �� ���� - �켱���� ť�� ����(���� ���� modify)
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>((su, value) -> {
			int su_abs=Math.abs(su);				// su, value ���밪
			int value_abs=Math.abs(value);
			
			if(su_abs == value_abs) {   			// ���밪�� ���� ��� ���� �켱
				return su > value ? 1:-1;
			}
			
			return su_abs - value_abs;   			 // ���밪 ���� ������ �켱  ?? 
		});
		
		for(int i=0;i<N;i++) {
			int request=Integer.parseInt(br.readLine());
			if(request==0) {
				if(queue.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(queue.poll());
				}
			}else {
				queue.add(request);
			}
		}
	}
}
