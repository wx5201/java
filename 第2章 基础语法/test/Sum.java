package test;
import java.util.Scanner;
public class Sum {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int balance=0;
		while(true){
				System.out.println("��Ͷ�ң�");
				int amount = in.nextInt();
				balance=balance+amount;
				System.out.println("��������������������������������");
				if(balance <= 0){
					System.out.println("Hello");
					System.out.println("��ȷ���Ƿ�Ͷ����ң�");
				}
				else if(balance<10){
					System.out.println("��Ͷ��Ļ�����"+amount+"Ԫ");
					System.out.println("��������������������������������");
					System.out.println("��Ʊ�ۻ���"+(10-balance)+"Ԫ�벹��");
					balance=+balance;
					if(balance>=10){
						System.out.println("��Ͷ��Ļ�����"+balance+"Ԫ");
						System.out.println("��������������������������������");
						System.out.println("��ȴ���Ʊ");
						System.out.println("��������������������������������");
						System.out.println("Ʊ�ۣ�10Ԫ");
						System.out.println("��������������������������������");	
						System.out.println("���㣺"+(balance-10));
						balance=0;
							
					}
					
				}
				else{
					System.out.println("��Ͷ��Ļ�����"+amount+"Ԫ");
					System.out.println("��������������������������������");
					System.out.println("��ȴ���Ʊ");
					System.out.println("��������������������������������");
					System.out.println("Ʊ�ۣ�10Ԫ");
					System.out.println("��������������������������������");	
					System.out.println("���㣺"+(balance-10));
					balance=0;
				}
				
				}
		
	}
			
		}