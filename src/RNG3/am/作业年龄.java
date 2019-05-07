package RNG3.am;

import java.util.Scanner;

public class 作业年龄 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("请输入你的年龄");
		 int nl=scan.nextInt();
		 int xh=24;
		 boolean a=nl==xh;
		 System.out.println("我和小红同岁"+a);
	}

}
