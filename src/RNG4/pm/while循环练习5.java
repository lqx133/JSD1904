package RNG4.pm;

public class while循环练习5 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i>=1 && i<=100) {
			if(i%5==0 || i%7==0) {
				sum=sum+i;
			}
			i++;
		}System.out.println(sum);
	}
}
