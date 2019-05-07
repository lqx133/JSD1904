package RNG4.pm;

public class dowhile循环练习3 {
	public static void main(String[] args) {
		int sum=0;
		int i=101;
		do {
			sum+=i;
			i++;
		}while(i<=999);
		System.out.println(sum);
	}
}
