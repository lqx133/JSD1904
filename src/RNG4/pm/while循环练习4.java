package RNG4.pm;

public class while循环练习4 {
	public static void main(String[] args) {
		int mun=0;
		int i=1;
		while(i>=0 && i<=100) {
			if(i%2==0) {
				mun=mun+i;
			}
			i++;	
		}
		System.out.println(mun);
	}
}
