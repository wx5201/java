public class Test5{
	public int x = 360;//���峣��x
	public int y = 720;//���峣��y

	//���巽�����sum
	public void sum(){
		int z = this.x + this.y;
		System.out.println("x+y = " + z);

	}


	public static void main(String[] args){
		//��������
		Test5 p1 = new Test5();
        //���÷���sum
		p1.sum();

	}

}