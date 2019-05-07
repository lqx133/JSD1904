package RNG3.pm;

import java.util.Scanner;

public class 作业5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入会员号");
		int zh=scan.nextInt();
		if(zh>=1000 && zh<=9999) {
			System.out.print("恭喜您登入成功,");
		}else {
			System.out.print("您的会员号输入有误请重新输入,");
		}
		  System.out.println("祝您生活愉快");
	}
}
 