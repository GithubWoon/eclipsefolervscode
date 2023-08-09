package day0809.src2;

public class SingleTonTest {
  private static SingleTonTest instance = null;

  private String name;
  private SingleTonTest(){
  }
  private SingleTonTest(String Name) {
    this.name = name;
  }
  
  public static SingleTonTest getInstance(String Name) {
    if(instance == null) {
      instance = new SingleTonTest(name);
      System.out.prinln("생성한 " + name + "객체를 리턴합니다");
    }
    System.out.println("이미 생성된 " + name + "객체를 리턴합니다");
    return instance;
  }
}
