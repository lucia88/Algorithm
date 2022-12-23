package ch02;

import java.util.Scanner;

/*
 * ����2) �����̴� �⸻���縦 ���ƴ�. �׷��� ������ ������ ���� ��������� ����ߴ�.
 *          �ϴ� �����̴� �ڱ� ������ �ִ��� �����. �׷� ���� �ִ��� M�̶�� �� �� ��� ������
 *          ����/M*100
 *          ���� ���ƴ�. ���� ��� �������� �ְ����� 70��, ���������� 50���̶�� ���� ������
 *          50/70*100 �̹Ƿ� 71.43���̴�. 
 *          �������� ������ �� ������� ������� �� ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          
 *          �Է� : 1��° �ٿ� ������ �� ������ ���� N�� �־�����. �ش� ���� 1,000���� �۰ų� ����.
 *                   2��° �ٿ� �������� ���� ������ �־�����. �ش� ���� 100���� �۰ų� ����, ���� �ƴ� �����̰�, ��� 1����
 *                   ���� 0���� ũ��.
 *                   
 *          ��� : 1��° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ���� ���� �Ǵ� ��� ������ 10^-2�����̸� �����̴�.		
 * */

public class Ex03 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� ��:");
		int N=sc.nextInt();         // 3
		
		int A[]=new int[N];
		System.out.println("�� ������ ���� ����");
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();      // 40 80 60
		}
		
		long sum=0;
		long max=0;
		for(int i=0;i<N;i++) {
			sum=sum+A[i];
			if(A[i] > max) max=A[i];
		}

		System.out.println(sum * 100.0 / max / N);    // double ��
		
		sc.close();
	}
}

