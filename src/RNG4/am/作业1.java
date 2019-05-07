package RNG4.am;

import java.util.Scanner;

public class 作业1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入机票原价");
		int monry=scan.nextInt();
		System.out.println("请输入月份");
		int yf=scan.nextInt();
		System.out.println("请问您乘坐的是1.头等舱还是2.经济舱");
		int a=scan.nextInt();
	if(yf>=5 &&yf<=10) {
		if(a==1) {
			System.out.println("您的票价为"+monry*0.9+"元");
		}
		if(a==2){
			System.out.println("您的票价为"+monry*0.85+"元");
		}
	}else {
		if(a==1) {
			System.out.println("您的票价为"+monry*0.7+"元");
		}
		if(a==2) {
			System.out.println("您的票价为"+monry*0.65+"元");
		}
	}
			
			
		}
	
		
		
		
		
		
		}
	
		
		
		
		
		
	

