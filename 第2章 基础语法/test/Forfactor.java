package test;
/**
 * �û�����һ����n
 * ��n�Ľ׳�
 */
import java.util.Scanner;

public class Forfactor {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//��ȡ�û�����
		int factor = 1;//�������
		for(int i = 1;i<=n;i=i+1){
			factor = factor*i;
		}
		System.out.println(n+"�Ľ׳���:"+factor);
	}

}
