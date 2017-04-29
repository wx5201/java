package test;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		/**
		 * 定义变量count
		 */
		int count = 100;
		while(count >0){
			System.out.println(count);
			System.out.println("这是第"+count+"轮");
			count = count-1;
			
			
		}
		System.out.println(count);
	}

}
