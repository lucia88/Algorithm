package ch01;

public class Ex05 {

	public static void main(String[] args) {
		
		// ���� Ƚ���� n^2�� ���
		int N=100000;
		int cnt=0;
		for(int i=0;i<N;i++) {                     // n
			for(int j=0;j<N;j++) {                //  n, �� n^2  30��
				System.out.println("���� Ƚ��:" + ++cnt);
			}
		}
	}
}
