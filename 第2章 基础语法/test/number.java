package test;

import java.util.Scanner;
/**
 * 
 * 猜数字游戏随机产生一个数
 * @author Administrator
 *
 */

public class number {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int number =(int) (Math.random()*100+1);//随机输出[0,1)让后扩大一百倍之后再加1得到[1,100]之间的一个随机数		}
			int a;
			int acount=0;
			do {
				a=in.nextInt();//读取输入数字
				acount=acount+1;
				if(a>number){//比较大小
					System.out.println("你输入的数字偏大");
				}
				else if(a <number){
					System.out.println("你输入的数字偏小");
				}
			}while(a!=number);
			System.out.println("你一共猜了"+acount+"次，恭喜你，猜对了");
		}
}
