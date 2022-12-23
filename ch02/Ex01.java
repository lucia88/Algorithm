package ch02;

import java.util.Scanner;

/*
 * 배열의 특징 : 메모리의 연속 공간에 저장되는 자료구조
 * 					  인덱스를 사용하여 값에 바로 접근 가능
 * 					 새로운 값을 삽입하거나 삭제하기 어렵다
 * 					 배열의 크기를 조절 불가능
 *                   구조가 간단하므로 코딩 테스트에서 많이 사용
 * 					
 * 리스트 특징 : 포인터로 연결한 자료구조
 *                    head 포인터부터 순서대로 접근 (속도 느림)
 *                   새로운 값 삽입, 삭제, 연산 속도가 빠름
 *                   배열의 크기 조절 가능
 *                   포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡함
 *                   자바에서 (ArrayList, LinkedList)
 * 
 * 문제1)  N개의 숫자가 공백없이 써 있다. 이 숫자를 모든 합해 출력하는 프로그램을 선택 (백준 11720)
 *            입력 : 1번째 줄에 숫자의 개수 N(1 <= N <=100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
 *            출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
 * */

public class Ex01 {

	public static void main(String[] args) {
		/*
		 *  슈도 코드
		 *  N값 입력받기
		 *  길이 N의 숫자를 입력받아 String형 변수 sNum 저장
		 *  sNum을 다시 char[]형 변수 cNum에 변환하여 저장
		 *  int형 변수 sum 선언
		 *  for(cNum 길이 만큼 반복){
		 *  	배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기
		 *  }
		 *  sum 출력하기
		 * */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자의 개수:");
		int N=sc.nextInt();      					    // N값 입력 1~100 (백만자리)
		
		System.out.println("공백 없이 주어진 N개의 숫자:");
		String sNum=sc.next();    					 // N의 문자열 맞는 데이터 입력
		
		char[] cNum=sNum.toCharArray();       // char 변환
		
		int sum=0;
		for(int i=0;i<N;i++) {						 // cNum.length
			sum +=cNum[i] - '0';    				 // 48 또는 0(아스키코드), 문자와 숫자의 코드 값 차이는 48임
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
