package basic0727_1;

import java.util.Scanner;

public class java0727_1 {

	public static void main(String[] args) {

		Cal calcul = new Cal();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int mathScore = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");
		int koreaScore = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");
		int englishScore = sc.nextInt();
		
		Score scoreCal = new Score();
		
		System.out.println("����� ������ �հ�� " + scoreCal.sum(mathScore,koreaScore,englishScore));
		System.out.println("����� ����� " + scoreCal.avg());
		
		scoreCal.sum_avg(mathScore,koreaScore,englishScore);
		
		
		
		
	}

}
