package test;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		/**
		 * �������count
		 */
		int count = 100;
		while(count >0){
			System.out.println(count);
			System.out.println("���ǵ�"+count+"��");
			count = count-1;
			
			
		}
		System.out.println(count);
	}

}
