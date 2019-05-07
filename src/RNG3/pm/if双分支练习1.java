package RNG3.pm;

import java.util.Scanner;

public class if双分支练习1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份");
		int nf=scan.nextInt();
		if(nf%4==0 && nf%100!=0 || nf%400==0 ) {
			System.out.print("是闰年");
		}else {
			System.out.println("是平年");
		}
	}

}
