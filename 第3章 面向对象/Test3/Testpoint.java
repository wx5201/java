class Point{
	double x,y,z;//�����Ա����x��y��z

	//	���췽�����ɾ�����������ĵ����

	Point(double _x,double _y,double _z){
		x = _x;//��x��ֵ
		y = _y;
		z = _z;
}
	//�ṩ����������������ķ���
	void setX(double _x){
	x = _x;
}

	void setY(double _y){
	y = _y;
}

	void setZ(double _z){
	z = _z;
}
	//����õ��ԭ������ƽ���ķ���
	double getDistance(Point p){
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
}
}
public class Testpoint{
	public static void main(String[] args){
			Point p = new Point(1.0,2.0,3.0);
			Point p1 = new Point(7.0,8.0,9.0);
			System.out.println("�õ��ԭ������ƽ���ǣ�" + p.getDistance(p1));

		p.setX(5.0);
		System.out.println("�õ��ԭ������ƽ���ǣ�" + p.getDistance(new Point(1.0,1.0,1.0)));
}
}