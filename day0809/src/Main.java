// 클래스 멤버 접근 수식
// 1. private, package, protected, public
  // 기능: 클래스 멤버에 대한 접근 권한 설정
  // 의미
  // 1) private: 선언된 클래스 안에서만 접근가능
  // 2) package: 같은 패키지의 클래스들에서 직접 접근가능
  // 3) protected: 같은 패키지에 있거나 상속하는 클래스에서 직접 접근 가능
  // 4) public: 모두 접근가능
  
  // 2. 클래스 파일 이름: public 클래스 이름과 동일

public class Main {
  static int iMainValue = 0;
  public static void main(String[] args) {
    System.out.print(StaticTest.number1); 
    StaticTest.number1 = 100; // StaticTest 클래스의 정적필드 number 1 에 100 할당
    StaticTest.printInfo(); // StaticTest 클래스의 정적 메서드 printInfo() 를 출력합니다

    StaticTest sTest = new StaticTest();
    sTest.printInfo2();
  }
}
