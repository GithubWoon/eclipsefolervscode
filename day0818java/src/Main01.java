public class Main01 {

	public static void main(String[] args) {
		DatabaseMoudule db = 
				new OracleDatabaseMoudule();
		int iRet = db.insert("test");
		System.out.println(iRet);

	}

}

// 여기서는 DatabaseModule 인터페이스를 사용하여 OracleDatabaseModule 인스턴스를 생성합니다