public class Test4{
	public String name;//�����Ա����name
	public int age;//�����Ա����age
	
	//���幹�췽��Test4
	public Test4(String name,int age){
		this.name = name;
		this.age = age;
}
	//���巽��say
	public void say(){
		System.out.println("��Һã��ҽ�"+ name +"���ҽ���"+ age +"�꣡");
	}
	
	public static void main(String [] args){
		//��������obj
		Test4 obj = new Test4("����",23);
		obj.say();

	}

}