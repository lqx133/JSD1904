package RNG3.pm;

import java.util.Scanner;

public class if双分支练习2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入金额");
		double money=scan.nextDouble();
		if(money>=1000) {
			System.out.println("给您八折，您需要支付"+money*0.8+"元");
		}else {
			System.out.println("给您九折，您需要支付"+money*0.9+"元");
		}
	}
}
