package RNG3.pm;

import java.util.Scanner;

public class 作业2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入四位号数字");
		int sz=scan.nextInt();
		int gw=sz%10,sw=sz%100/10,bw=sz%1000/100,qw=sz/1000;
		System.out.println("各位数字的总和是:"+(gw+sw+bw+qw));
	}
}
 