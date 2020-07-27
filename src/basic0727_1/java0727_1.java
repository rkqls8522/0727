package basic0727_1;

import java.util.Scanner;

public class java0727_1 {

	public static void main(String[] args) {

		Cal calcul = new Cal();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 점수를 입력하세요.");
		int mathScore = sc.nextInt();
		
		System.out.println("국어 점수를 입력하세요.");
		int koreaScore = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");
		int englishScore = sc.nextInt();
		
		Score scoreCal = new Score();
		
		System.out.println("당신의 점수의 합계는 " + scoreCal.sum(mathScore,koreaScore,englishScore));
		System.out.println("당신의 평균은 " + scoreCal.avg());
		
		scoreCal.sum_avg(mathScore,koreaScore,englishScore);
		
		
		
		
	}

}
