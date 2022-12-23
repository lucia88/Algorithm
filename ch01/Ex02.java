package ch01;

/*
 * ** �ð� ���⵵ ����
 * 		��-���ް�(��(n)) : �ּ��� ��(Best Case)�� ���� Ƚ���� ��Ÿ�� ǥ���
 * 		��-��Ÿ(��(n)) : ������ ��(Average Case)�� ���� Ƚ���� ��Ÿ�� ǥ���
 * 		��-��(O(n)) : �־��� ��(Worst Case)�� ���� Ƚ���� ��Ÿ�� ǥ���
 * */

public class Ex02 {
	public static void main(String[] args) {
		
		// 1~100 ���� �� ���� ����
		int su=(int) (Math.random() * 100);
		
		/* �ð� ���⵵
		 * 0(su) 1�� �ݺ�, 
		 * 50(su) 50�� �ݺ� == N(100)/2
		 * 99(su) 99�� �ݺ�  */
		
		for(int i=0; i<100; i++) {
			if(i==su) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
