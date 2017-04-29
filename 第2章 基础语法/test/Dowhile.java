package test;

import java.util.Scanner;
/**
 * 算平均数
 * 让用户输入一系列正整数，最后输入-1表示结束，让后程序计算出这些书的平均数
 * 输出输入数字的个数和平均数
 * 
 * @author Administrator
 *
 */

public class Dowhile {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int number;//定义number
		int sum = 0;//定义求和
		int count = 0;//定义计数
		do {
			number = in.nextInt();//输入数字读取
			if(number != -1){//判断用户是否输入-1
				sum=sum+number;//计算总和
				count=count+1;
			}
		}while( number!= -1);
		if(count >0){
			System.out.println("输入的数字个数是"+count);
			System.out.println("平均数="+(double)sum/count);//计算平均数
			
		}
			
		}

}
