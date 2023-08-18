public class Friday8test {
    private int empNo;
    private String name;
    private double salary;
    private int deptno;

    // 기본 생성자
    public Friday8test() {
    }

    public Friday8test(int empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public double getSalaryForYear() {
        return salary * 12;
    }
}
