package RNG3.pm;

import java.util.Scanner;

public class 取数练习1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入四位数字");
		int caunt=scan.nextInt();
		int gw=caunt%10,sw=caunt%100/10,bw=caunt%1000/100,qw=caunt/1000;
		System.out.println(gw+sw+bw+qw);  
		
		
	}
}
