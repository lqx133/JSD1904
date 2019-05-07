package RNG4.pm;

public class 家庭作业2 {
	public static void main(String[] args) {
		int i=1;
		int num=0;
		while(i<=100) {
			if(i%7!=0 && i%10!=7 &&i/10!=7) {
				num+=i;
				System.out.println(i);
			}
			i++;
		}System.err.println(num);
		
	}
}
