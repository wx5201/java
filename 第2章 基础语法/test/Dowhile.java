package test;

import java.util.Scanner;
/**
 * ��ƽ����
 * ���û�����һϵ�����������������-1��ʾ�������ú����������Щ���ƽ����
 * ����������ֵĸ�����ƽ����
 * 
 * @author Administrator
 *
 */

public class Dowhile {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int number;//����number
		int sum = 0;//�������
		int count = 0;//�������
		do {
			number = in.nextInt();//�������ֶ�ȡ
			if(number != -1){//�ж��û��Ƿ�����-1
				sum=sum+number;//�����ܺ�
				count=count+1;
			}
		}while( number!= -1);
		if(count >0){
			System.out.println("��������ָ�����"+count);
			System.out.println("ƽ����="+(double)sum/count);//����ƽ����
			
		}
			
		}

}
