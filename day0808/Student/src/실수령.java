import java.util.Scanner;

public class 실수령 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월급을 입력하세요: ");
    double salary /* 월급 */ = sc.nextDouble();
    double tax /* 세금 */ = salary * 0.3;

    double finalSalry = salary - tax; /* 실수령 월급 */

    System.out.println("세금" + tax + "원");
    System.out.println("실수령액" + finalSalry + "원");

    sc.close();
  }
}
