package RNG3.pm;

import java.util.Scanner;

public class 逻辑运算符练习1 {
	public static void main(String[] args) {
		         Scanner scan=new Scanner(System.in);
		         System.out.println("请输入小明的英文成绩");
		         int a=scan.nextInt();
		         System.out.println("请输入小明的音乐成绩");
		         int b=scan.nextInt();
		         boolean A=a>85 && b>60;
		         System.out.println("小明能获得奖励"+A);
	}

}
