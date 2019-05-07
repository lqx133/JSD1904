package RNG4.am;

import java.util.Scanner;

public class if多分支练习1 {

	public static void main(String[] args) {
	           Scanner scan=new Scanner(System.in);
	           System.out.println("请输入成绩");
	           int score=scan.nextInt();
	           if(score>=90) {
	        	   System.out.println("优秀");
	           }else if(score>=80){
	        	   System.out.println("良好");
	           }else if(score>=60) {
	        	   System.out.println("及格");
	           }else {
	        	   System.out.println("不及格");
	           }
	            

	}

}
