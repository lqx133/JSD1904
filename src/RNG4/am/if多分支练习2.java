package RNG4.am;

import java.util.Scanner;

public class if多分支练习2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入您的消费金额");
		double money=scan.nextDouble();
		if(money>=5000) {
			System.out.println("您是钻石VIP");
		}else if(money>=1000) {
			System.out.println("您是铂金vip");
		}else if(money>=500) {
			System.out.println("您是黄金vip");
		}else {
			System.out.println("您不是vip");
		}
	}
}
