package RNG4.am;

import java.util.Scanner;

public class switch练习2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入周几(1~5)");
		String z=scan.next();
		switch(z) {
		case "头等舱":
		System.out.println("红烧鱼");
			break; 
		case "经济舱":
			System.out.println("辣椒炒肉");
			break;
		/*case 3:
			System.out.println("泥鳅");
			break;
		case 4:
			System.out.println("大闸蟹");
			break;
		case 5:
			System.out.println("清道夫");
			break;*/
			default:
			System.out.println("饿死你");
			
		}
	}
}
