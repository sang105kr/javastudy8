package solution8;

public class DaoExample {

	public static void main(String[] args) {
		dbwork(new OracleDao());
		dbwork(new MysqlDao());
	}

	private static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
