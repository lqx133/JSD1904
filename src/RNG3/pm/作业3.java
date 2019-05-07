package RNG3.pm;

import java.util.Scanner;

public class 作业3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额");
		double money=scan.nextDouble();
		
		if(money*0.8>1000) {
			System.out.print("恭喜您获得一张200元代金券");
		}
		System.out.println("祝您购物愉快");
	}

}
 