package test;

import java.util.Scanner;
/**
 * 
 * ��������Ϸ�������һ����
 * @author Administrator
 *
 */

public class number {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int number =(int) (Math.random()*100+1);//������[0,1)�ú�����һ�ٱ�֮���ټ�1�õ�[1,100]֮���һ�������		}
			int a;
			int acount=0;
			do {
				a=in.nextInt();//��ȡ��������
				acount=acount+1;
				if(a>number){//�Ƚϴ�С
					System.out.println("�����������ƫ��");
				}
				else if(a <number){
					System.out.println("�����������ƫС");
				}
			}while(a!=number);
			System.out.println("��һ������"+acount+"�Σ���ϲ�㣬�¶���");
		}
}
