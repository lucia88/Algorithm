package ch03;

import java.util.Scanner;

/*
 * 	�� ����Ʈ 
 * 
 *  �� ����Ʈ : 2���� �����ͷ� �˰����� �ð� ���⵵�� ����ȭ�մϴ�.
 *  
 *  ���� 4) ��� �ڿ��� N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �ִ�. ����� � �ڿ��� N(1 �� N �� 10,000,000)�� 
 *  			�� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� �˰� �ʹ�. �̶� ����ϴ� �ڿ����� N�̾���Ѵ�. ���� ���
 *  			15�� ��Ÿ���� ����� 15, 7+8, 4+5, 5+6, 1+2+3+4+5�̴�.  �ݸ� 10�� ��Ÿ���� ����� 10, 1+2+3+4 �̴�.
 *  			N�� �Է¹޾� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("N �Է�:");
		int N=sc.nextInt();
		
		int count=1;
		int start_index=1;
		int end_index=1;
		int sum=1;
		
		while(end_index !=N) {				// ���� ���� ���� N���� �� ū ���
			if(sum==N) {
				count++;
				end_index++;
				sum=sum+end_index;
			}else if(sum > N) {
				sum=sum-start_index;
				start_index++;
			}else {
				end_index++;
				sum=sum+end_index;
			}
		}
	
		System.out.println(count);
		
		if(sc !=null) sc.close();
	}
}
