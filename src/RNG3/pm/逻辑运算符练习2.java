package RNG3.pm;

import java.util.Scanner;

public class 逻辑运算符练习2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("小明百米成绩是多少秒？");
		double bm=scan.nextDouble();
		System.out.println("小明跳高成绩是多少米？");
		double tg=scan.nextDouble(); 
		boolean a=bm<13 || tg>2.2;
		System.out.println("小明能进决赛"+a);
		
	}

}
