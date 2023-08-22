import java.util.Scanner;

// Snack 클래스
public class Snack {
  private String kind;
  private String name;
  private String flavor;
  private int numOf;
  private int price;

  public Snack() {
  }

  public Snack(String kind, String name, String flavor, int numOf, int price) {
    this.kind = kind;
    this.name = name;
    this.flavor = flavor;
    this.numOf = numOf;
    this.price = price;
  }
  // \n 으로 줄바꿈
  public String information() {
    return "종류: " + kind + "\n이름: " + name + "\n맛: " + flavor +
        "\n개수: " + numOf + "\n가격: " + price;
  }

}

//////////////////////////////////////
// SnackController 클래스
class SnackController {
  private Snack s;

  public SnackController() {
  }

  public void saveData(String kind, String name, String flavor, int numOf, int price) {
    s = new Snack(kind, name, flavor, numOf, price);
  }

  public String confirmData() {
    return s.information();
  }
}

// SnackMenu 클래스
class SnackMenu {
    private Scanner sc = new Scanner(System.in);
    private SnackController scr;

    public SnackMenu() {
        scr = new SnackController();
    }

    public void run() {
      System.out.println("종류:");
      String kind = sc.nextLine();
      System.out.println("이름:");
      String name = sc.nextLine();
      System.out.println("맛:");
      String flavor = sc.nextLine();
      System.out.println("개수:");
      int numOf = sc.nextInt();
      System.out.println("가격:");
      int price = sc.nextInt();

      scr.saveData(kind, name, flavor, numOf, price);
      String snackInfo = scr.confirmData();
      System.out.println("Snack information:\n" + snackInfo);

      System.out.println("구매할 수량을 입력해주세요:");
      int purchaseQuantity = sc.nextInt();

      int finalPrice = price * purchaseQuantity;
      System.out.println("최종가격: " + finalPrice + "원");
    }

    public static void main(String[] args) {
        SnackMenu snackMenu = new SnackMenu();
        snackMenu.run();
    }
}
