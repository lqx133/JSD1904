package RNG5;

public class 作业3 {
	public static void main(String[] args) {
		int m=50;
		int sum=0;
		int qs=10000/400;
		for(int i=1;i<=qs;i++) {
			sum+=m;
			m=m+1;
		}
		System.out.println(sum);
	}
}
