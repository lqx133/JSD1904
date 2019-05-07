package RNG3.pm;

import java.util.Scanner;

public class 物价练习 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("请输入篮球鞋价格");
		double lqx=scan.nextDouble();
		System.out.println("请输入数量");
		int sl=scan.nextInt();
		if(lqx*sl>500) {
			System.out.println("满五百打八折，您需要支付"+lqx*sl*0.8+"元");
		}
	 
	
	}
	
}
