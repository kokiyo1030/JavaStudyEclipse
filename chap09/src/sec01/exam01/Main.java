package sec01.exam01;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 4;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 8;
		c.method2();
		
		// 로컬 클래스 객체 생성을 위한 메서드 호출
		a.method();
	}
}
