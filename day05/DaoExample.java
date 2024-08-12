package day05;


interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}





class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 검색");
		
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삽입");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 수정");
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
		
	}
}






class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에서 검색");
		
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에서 삽입");
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에서 수정");
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySQL DB에서 삭제");
		
	}
}





public class DaoExample {
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		System.out.println();
		dbWork(new MySqlDao());
	}

}
