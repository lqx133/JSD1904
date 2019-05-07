package RNG4.am;

import java.util.Scanner;

public class 作业2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("请选择一个形状，1.长方形2.正方形.3.三角形.4.圆形");
	int xz=scan.nextInt();
	switch (xz){
	case 1:
		System.out.println("请输入长和宽");
		double h=scan.nextDouble();
		double w=scan.nextDouble();
		System.out.println("长方形的面积为："+h*w);
		break;
	case 2:
		System.out.println("请输入边长");
		double h1=scan.nextDouble();
		System.out.println("正方形的面积为："+h1*h1);
		break;
	case 3:
		System.out.println("请输入底和高");
		double d=scan.nextDouble();
		double g=scan.nextDouble();
		System.out.println("三角形的面积为："+d*g/2);
		break;
	case 4:
		System.out.println("请输入半径");
		double j=scan.nextDouble();
		System.out.println("圆形的面积为："+3.14*j*j);
		break;
		default:
			System.out.println("谢谢咨询");
			
	}

	}

}
