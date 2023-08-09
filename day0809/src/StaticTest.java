public class StaticTest {
    // 필드 영역
    static int number1; // 정적 필드인 number 1 을 선언합니다 static : 정적
    int number2;


  // 생성자

  public StaticTest() {
  }

  // 메소드
  // 정적 메소드
  public static void printInfo() {
    System.out.println("number1 = " + number1);
    
  }

  // 동적 메소드
  public void printInfo2() {
    System.out.println("number1 = " + number1);
    System.out.println("number 2 = " + number2);
  }
}