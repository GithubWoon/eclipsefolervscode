import java.time.LocalDate;
import java.util.Scanner;

// 꽃게잡이 클래스
public class CatchCrap {
    private String target;      // 목표물
    private LocalDate date;     // 날짜
    private String ship;        // 어선
    private int catchAmount;    // 포획량

    public CatchCrap(String target, LocalDate date, String ship, int catchAmount) {
      this.target = target;
      this.date = date;
      this.ship = ship;
      this.catchAmount = catchAmount;
    }

    // 메소드? (함수는 맞지만 객체의 일부로 존재하고 클래스 내에서 정의되고 클래스내 객체에서만 호출됨)

    public String getTarget() { 
        return target;
    }

    public LocalDate getDate() { 
        return date;
    }

    public String getShip() {
        return ship;
    }

    public int getCatchAmount() {
      return catchAmount;
    }

    // 문구 출력 메소드
    public void displayInfo() {
      System.out.println("Date: " + date);
      System.out.println("Target: " + target);
      System.out.println("Ship: " + ship);
      System.out.println("Catch Amount: " + catchAmount);
    }

    // 잡는걸 새로 객체만들어야함 
    // 이해 필요함
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target: ");
        String target = scanner.nextLine();

        LocalDate date = LocalDate.now();

        System.out.print("Enter the ship: ");
        String ship = scanner.nextLine();

        System.out.print("Enter the catch amount: ");
        int catchAmount = scanner.nextInt();

        scanner.close();

        CatchCrap catchInfo = new CatchCrap(target, date, ship, catchAmount);
        catchInfo.displayInfo();
    }
}
