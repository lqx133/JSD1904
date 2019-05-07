package RNG4.am;

import java.util.Scanner;

public class if多分支练习3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入金额");
		double money=scan.nextDouble();
		System.out.println("请输入积分");
		int jf=scan.nextInt();
		if(jf>=2000) {
			System.out.println("您的积分高于2000给您七折，您需要支付的金额是："+money*0.7+"元");
		}else if(jf>=1000) {
			System.out.println("您的积分高于1000给您八折，您需要支付的金额是："+money*0.8+"元");
		}else if(jf>=600) {
			System.out.println("您的积分高于600给您九折，您需要支付的金额是："+money*0.9+"元");
		}else {
			System.out.println("您需要支付"+money+"元");
		}
	}
}
