package RNG4.pm;

import java.util.Random;
import java.util.Scanner;

public class 家庭作业1 {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner scan=new Scanner(System.in);
		int res=ran.nextInt(100)+1;
		int num;
		int i=0;
		do {
			System.out.println("请输入数字");
			 num=scan.nextInt();
			 if(num>res) {
				 System.out.println("您输入的数字较大");
			 }else if(num<res){
				 System.out.println("您输入的数字较小");
			 }else {
				 System.out.println("输入正确");
			 }
			
		}while(num!=res);
		
	}
}
