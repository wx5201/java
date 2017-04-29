package test;
/**
 * 用户输入一个数n
 * 求n的阶乘
 */
import java.util.Scanner;

public class Forfactor {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//读取用户输入
		int factor = 1;//定义变量
		for(int i = 1;i<=n;i=i+1){
			factor = factor*i;
		}
		System.out.println(n+"的阶乘是:"+factor);
	}

}
