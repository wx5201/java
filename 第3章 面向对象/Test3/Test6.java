public class Test6{
	//�������
	public String name;
	public int age;
	//���幹�췽��
	public Test6(){

		this("����",26);
	}

	//���幹�췽��
	public Test6(String name,int age){
		this.name = name;
		this.age = age;
	}
	//���巽��
	public void say(){
		System.out.println("��Һã��ҽ�"+ name +"��������"+ age +"��");
	}
	public static void main(String[] args){
	//ʵ��������p1
	Test6 p1 = new Test6();
	//���÷���
	p1.say();
	}

}