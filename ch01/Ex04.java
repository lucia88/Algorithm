package ch01;

/*
 * ** �ð� ���⵵ ���
 * 		���� Ƚ�� = �˰��� �ð� ���⵵ * �������� ũ��
 * 		����� �ð� ���⵵ ��꿡�� �����Ѵ�.
 * 		���� ���� ��ø�� �ݺ����� ���� Ƚ���� �ð� ���⵵�� ������ �ȴ�.
 * 
 * */

public class Ex04 {
	
	public static void main(String[] args) {
		
			// ���� Ƚ���� 3n�� ���
			int N=100000;
			int cnt=0;
			for(int i=0;i<N;i++) {
				System.out.println("���� Ƚ��:" + ++cnt);               // 10��
			}
			
			for(int i=0;i<N;i++) {
				System.out.println("���� Ƚ��:" + ++cnt);				  // 10��
			}
			
			for(int i=0;i<N;i++) {
				System.out.println("���� Ƚ��:" + ++cnt);				 // 10��  = �� 30�� 3n �Ϲ������� ����� �����ϹǷ� ��-�� O(n) 
			}
			
			System.out.println("\n");
	}

}
