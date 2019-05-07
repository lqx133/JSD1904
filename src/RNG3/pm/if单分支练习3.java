package RNG3.pm;

import java.util.Scanner;

public class if单分支练习3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入数字");
		int sz=scan.nextInt();
		if(sz>=1000 && sz<10000){
			System.out.print("会员登入成功，");
		}
		System.out.println("欢迎您的使用!");
	}


}
