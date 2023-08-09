public class AcessTest {
    // 필드(속성) 영역
    private int a;
    int b;
    public int c;
    protected int d;
  

  // 기본 생성자
  public AcessTest() {
  }

  // Getters / Setters 메소드 영역
  public int getA() {
    return a;
  }

  public void setA(int a) { // void = 변환하는 값 없다? int = 상수형 변환 double = 실수형 변환
    this.a = a;
  }
}

