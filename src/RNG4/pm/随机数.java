package RNG4.pm;

import java.util.Random;

public class 随机数 {
	public static void main(String[] args) {
		Random ran=new Random();
		//产生随机数
		int num=ran.nextInt(19);
		System.out.println(num);
	}
}
