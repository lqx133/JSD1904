package RNG5;

public class 作业2 {
	public static void main(String[] args) {
		double sum=1;
		double money=1;
		for(int i=1;i<30;i++) {
		 money*=1.5;
		 sum+=money;
		}
		System.out.println(sum);
	}
	}