package RNG3.pm;

import java.util.Scanner;

public class 作业4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份");
	  int year=scan.nextInt();
	  if(year%4==0 && year%100!=0 || year%400==0) {
		  System.out.print("是闰年,");
	  }
	  System.out.println("祝您生活愉快");
	}

}
 