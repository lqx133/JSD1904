package RNG3.pm;

import java.util.Scanner;

public class 作业6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入a的数值");
		int a=scan.nextInt();
		System.out.println("请输入b的数值");
		int b=scan.nextInt();
		System.out.println("请输入c的数值");
		int c=scan.nextInt();
		/*int max=a>b?a:b;
		int max1=max>c?max:c;
		int mind=a<b?a:b;
		int mind1=mind<c?mind:c;
		int mind2=(a+b+c)-(max1+mind1);
	  System.out.println(mind1+"<"+mind2+"<"+max);*/
		if(a>b) {
			int t=a;
			    a=b;
			    b=t;
		}
		if(a>c) {
			int t=a;
					a=c;
					c=t;
		}
		if(b>c) {
			int t=b;
					b=c;
					c=t;
		}
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
	  
		}
		
	} 

