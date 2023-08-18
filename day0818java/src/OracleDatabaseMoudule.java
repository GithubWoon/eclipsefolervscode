public class OracleDatabaseMoudule 
	implements DatabaseMoudule {

	@Override
	public int insert(String s) {
		System.out.println("Oracle Insert " + s);
		return 1;
	}

	@Override
	public String select() {
		String sRet = "Oracle select result";
		return sRet;
	}

}

// OracleDatabaseModule' 클래스는 'DatabaseModule' 인터페이스를 구현합니다
// 이 클래스에는 실제 Oracle 데이터베이스와 관련된 기능을 구현하고 있습니다
// insert 메서드는 문자열을 인자로 받아 Oracle 데이터베이스에 데이터를 삽입합니다, 작업을 수행하고 결과를 반환합니다
// select 메서드는 Oracle 데이터베이스에서 데이터를 선택하고 해당 데이터를 문자열 형태로 반환합니다