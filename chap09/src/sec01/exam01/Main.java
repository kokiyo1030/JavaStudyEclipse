package sec01.exam01;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 4;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 8;
		c.method2();
		
		// ���� Ŭ���� ��ü ������ ���� �޼��� ȣ��
		a.method();
	}
}