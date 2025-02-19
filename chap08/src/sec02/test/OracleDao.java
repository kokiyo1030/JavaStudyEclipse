package sec02.test;

public class OracleDao implements DataAccessObject {
	private String name = "Oracle DB";
	
	@Override
	public void select() {
		System.out.println(name + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(name + "에서 삽입");
	}

	@Override
	public void update() {
		System.out.println(name + "에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(name + "에서 삭제");
	}

}
