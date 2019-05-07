package RNG3.pm;

import java.util.Scanner;

public class if单分支练习2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入消费金额:");
		double je=scan.nextDouble();
		if(je>=1000) {
			System.out.print("获得200元代金券一张，");
		}
		System.out.println("欢迎下次光临！");
		
	}

}
