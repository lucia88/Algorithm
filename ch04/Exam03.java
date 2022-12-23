package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Exam03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 절대 값 힙 구현 - 우선순위 큐의 정렬(절댓값 정렬 modify)
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>((su, value) -> {
			int su_abs=Math.abs(su);				// su, value 절대값
			int value_abs=Math.abs(value);
			
			if(su_abs == value_abs) {   			// 절대값이 같은 경우 음수 우선
				return su > value ? 1:-1;
			}
			
			return su_abs - value_abs;   			 // 절대값 작은 데이터 우선  ?? 
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
