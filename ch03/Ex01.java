package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ������ ��
 * 
 * ������ �� :  �迭�� �̿��Ͽ� �ð� ���⵵�� �� ���̰� ���� ����ϴ� Ư���� ������ �˰���
 * ������ �� �ٽ� �̷� : ���� �� �˰����� Ȱ���Ϸ��� ���� �� �迭�� ���Ѵ�. (�迭 A�� ���� �� �� �迭 S�� ������ ����)
 *                               �չ迭 ���� : S[i]=S[i-1]+A[i]
 *                               ������ ���� : S[j]-S[i-1]
 *                               
 *  ���� 3) �� N���� �־����� �� i��° ������ j��° �������� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *             �Է� : 1��° �ٿ� ���� ���� N(1 �� N �� 100,000), ���� ���ؾ� �ϴ� Ƚ�� M(1 �� M �� 100,000)
 *                      2��° �ٿ� N���� ���� �־�����. �� ���� 1,000���� �۰ų� ���� �ڿ����̴�. 3��°�� ���ʹ� M���� �ٿ� 
 *                      ���� ���ؾ��ϴ� ���� i�� j�� �־�����.
 *                      
 *             ��� : �� M�� �ٿ� �Է����� �־��� i��° ������ j��° �������� ���� ����Ѵ�.
 * */

public class Ex01 {

	public static void main(String[] args) throws IOException {
		System.out.println("(���� ���� / ���� ���� �Է�:)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int suNo=Integer.parseInt(st.nextToken());
		int quizNo=Integer.parseInt(st.nextToken());
		// System.out.println(suNo + " " + quizNo);
		
		long[] s=new long[suNo+1];
		
		// ��ü ��
		System.out.println("(������ �Է�:)");
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=suNo;i++) {
			s[i]=s[i-1]+Integer.parseInt(st.nextToken());
			System.out.print(s[i] + "\t");
		}
		System.out.println();

		// ���� ��
		System.out.println("���� �Է�(i~j)");
		for(int q=0; q<quizNo;q++) {
			System.out.println("(������ �Է�:)");
			st=new StringTokenizer(br.readLine());
			
			int i=Integer.parseInt(st.nextToken());
			int j=Integer.parseInt(st.nextToken());
			System.out.print(s[j]-s[i-1]);
		}
	}
}
