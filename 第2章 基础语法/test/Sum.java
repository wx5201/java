package test;
import java.util.Scanner;
public class Sum {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int balance=0;
		while(true){
				System.out.println("请投币：");
				int amount = in.nextInt();
				balance=balance+amount;
				System.out.println("…………………………………………");
				if(balance <= 0){
					System.out.println("Hello");
					System.out.println("请确认是否投入货币？");
				}
				else if(balance<10){
					System.out.println("你投入的货币是"+amount+"元");
					System.out.println("…………………………………………");
					System.out.println("离票价还差"+(10-balance)+"元请补齐");
					balance=+balance;
					if(balance>=10){
						System.out.println("你投入的货币是"+balance+"元");
						System.out.println("…………………………………………");
						System.out.println("请等待出票");
						System.out.println("…………………………………………");
						System.out.println("票价：10元");
						System.out.println("…………………………………………");	
						System.out.println("找零："+(balance-10));
						balance=0;
							
					}
					
				}
				else{
					System.out.println("你投入的货币是"+amount+"元");
					System.out.println("…………………………………………");
					System.out.println("请等待出票");
					System.out.println("…………………………………………");
					System.out.println("票价：10元");
					System.out.println("…………………………………………");	
					System.out.println("找零："+(balance-10));
					balance=0;
				}
				
				}
		
	}
			
		}