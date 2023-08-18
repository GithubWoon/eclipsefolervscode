// 상수: 초기화 한번만 가능
// 상수: final 데이터타입 상수명 = 초기값
// 상수명: 대문자로 만듬.
public class Main02 {

	public static void main(String[] args) {
		Child child = new Child(2); // Child 클래스의 객체 생성
		System.out.println(child.getChild01()); // getChild01 메서드 호출결과 출력
		System.out.println(child.getParent01()); // getParent01 메서드 호출결과 출력
		System.out.println(child.getParent02());
	}

}

// 기본 생성자에 아무런 인자가 없을경우 0이 출력됨