package RNG4.pm;

public class while循环练习6 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while (sum<1000) {
		 sum+=i;
		 i++;
		}
		System.out.println(sum);
		System.out.println(i-1);
	}
}
