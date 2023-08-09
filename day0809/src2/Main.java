package day0809.src2;

public class Main {
  public static void main(String[] args) {
    // int a;
    // int b;
    // int c;

    // 겍체 힙에 생성됩니다 (메모리): 주소값으로 표현(래퍼런스)
    // SingleTonTest singleTonTest1 = new SingleTonTest(); // SingleTonTest 클래스에서 singleTonTest1 객체 생성, 객체는 변수
    // SingleTonTest singleTonTest2 = new SingleTonTest();
    // SingleTonTest singleTonTest3 = new SingleTonTest();

    // // System.out.println(singleTonTest1);
    SingleTonTest st = 
      SingleTonTest.getInstance("HAHAHA");
      System.out.println(st);
  }
  
}
