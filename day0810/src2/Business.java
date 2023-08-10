package day0810.src2;

public class Business extends Person {
  // 필드 영역
  private String company;
  // 생성자 영역
  // 기본 생성자
  public Business() {
    System.out.println("Business()");
  }
  // 인자있는 생성자
  public Business(String company) {
    System.out.println("Business()");
    this.company = company;
  }
  // 메소드 영역
  // Getters/Setters 영역
  public String getCompany() {
    return company;
  }
  pbulic void setCompany(String company) {
    this.company = company;
  }

  pbulic String toString() {
    return String.format("이름: %s", 회사: "%s", this.getName(), this.company);
  }
}
