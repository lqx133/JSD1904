package RNG4.am;

import java.util.Scanner;

public class 作业3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年份");
		int nf=scan.nextInt();
		System.out.println("请输入月份");
		int yf=scan.nextInt();
		switch (yf) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("这个月有31天");
			break;
		case 2:
			if(nf%4==0 && nf%100!=0 || nf%400==0) {
				System.out.println("这个月有29天");
			}else {
				System.out.println("这个月有28天");
			}
			break;
		case 4:
		case 6:
		case 11:
		case 9:
			System.out.println("这个月有30天");
			break;
			default:
			System.out.println("您输入有误");
		}
		}
	}

