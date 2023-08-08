public class Main {
  public static void main(String[] args) { 
  Student student = new Student(); // Stduent 클래스를 가져옴
  System.out.println(student);
  
  String name = student.getsName(); //gets(Name) 은 가져오는 메서드
  System.out.println(name);

  student.setsName("홍길동"); //sets(Name) 은 설정하는 메서드
  name = student.getsName();
  System.out.println(name);
  }
}