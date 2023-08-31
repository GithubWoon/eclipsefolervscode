public interface DatabaseMoudule {
	int DB_VERSION = 1;

	int insert(String s);

	String select();
}

// DatabaseModule 인터페이스는 데이터베이스 모듈의 기본 동작을 정의합니다 
// 이 인터페이스에는 'insert' 메서드와 'select' 메서드가 선언되어 있습니다
