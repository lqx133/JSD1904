package RNG2;

import java.util.Scanner;

public class Niiii2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("用户输入草料总数");
		double zs=scan.nextDouble();
		
		System.out.println("请输入一头牛一条吃的数量");
		double y=scan.nextDouble();
		
		System.out.println("足够多少头牛吃");
		System.out.println((int)(zs/y));
		
		
	}

}
