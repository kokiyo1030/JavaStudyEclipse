package sec01.exam01;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i=0; i<=1000000000; i++) {
			sum += i;
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("1 ~ 1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2 - time1) + "�и��� �ҿ�");
	}

}
