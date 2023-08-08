public class Employee {
    // 필드 추가, 필드는 변수
    private int empNo; // private 는 외부의 접근을 막음, 보안유지
    private String sEmpName;
    private double dSalary;

    // 기본 생성자
    public Employee() {
    }

    // 인자있는 생성자 -> 초기화를 하기 위해서 인자를 받아왔다 -> class 의 field를 초기화해줌
    // 1. 상태설정 2. 일관성 유지 3. 오류 방지 4. 편의성 제공 5. 객체지향 프로그래밍 원칙 (캡슐화)
    
    public Employee(int empNo, String sEmpName, double dSalary) {
        this.empNo = empNo;
        this.sEmpName = sEmpName;
        this.dSalary = dSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "홍길동", 1000.0);
        System.out.println(employee);
        System.out.println(employee.empNo);
        System.out.println(employee.sEmpName);
        System.out.println(employee.dSalary);
    }

    // 메서드 만들어보기, 실수령 계산해보기
    public double getMoney(double ratio) {
        // getMoney 는 메서드, 메서드의 반환 타입은 double, ratio는 변수 
        return dSalary * ratio;
    }

  }

  // // Getter, Setter
  // public int getiEmpNo() {
  //   return iEmpNo;
  // }
  
  // public void setiEmpNo() {
  //   (int iEmpNo) {
  //   this.iEmpNo = iEmpNo;
  //   }
  // }

  // public String getsEmpName() {
  // return sEmpName;
  // }
  // public void setsEmpName(String sEmpName) {
  // this.sEmpName = sEmpName;
  // }

  // public double getdSalary() {
  // return dSalary;
  // }

  // public void setdSalary(double dSalary) {
  // this.dSalary = dSalary;}