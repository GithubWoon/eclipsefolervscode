package day0810.src2;

// 상속: 상위 클래스 멤버들을 확장해서 하위 클래스들을 설계하는방법
// 상위 클래스, 부모 클래스, 기본 클래스
// 하위 클래스, 자식 클래스, 유도 클래스
// IS - A 관계가 성립할때 상속을 사용해서 클래스 설계
// 회사원은 사람이다
// 학생은 사람이다
// 다중 상속이 안된다
// 상속관계에서의 생성자 호출순서
// 자바의 모든 클래스 Object 클래스를 상속합니다
  // ex) A(상위), B(하위) extends A(상위)

public class Main {
    public static void main(String[] args) {
      // 객체는 빵봉투 개념(?)

      // Person 클래스에 p1 객체 생성
      Person p1 = new Person(); 
      System.out.println(p1);

      // Person 클래스에 p2 객체 생성
      Person p2 = new Person("직원1");
      System.out.println(p2);

      Business p3 = new.Business();
      System.out.println(p3);
    }
}
