package basic0727_1;

public class Score {

	int sumScore = 0;
	public int sum(int a, int b, int c) {
		sumScore = a + b + c;
		return sumScore;
	}
	
	public float avg() {
		return (float)(sumScore/3);
	}
	
	void sum_avg(int a, int b, int c) {
		sum(a,b,c);
		System.out.println(avg());
	}
	
	
}
