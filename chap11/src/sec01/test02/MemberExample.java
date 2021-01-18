package sec01.test02;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		
		System.out.println(member);
		
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes);
		System.out.println(str);
	}

}
