import java.util.Scanner;

public class Warehouse2 {
    public static void main(String[] args) {
        int maxStock = 10; // 최대재고수량 10개 선언

        Scanner scanner = new Scanner(System.in);

        System.out.println("각 구역별 현재 재고 수량을 입력하세요");

        // 현재 재고수량
        int stockA = checkCount(scanner, "1번 구역"); // text는 내가 지정해준 매개변수
        int stockB = checkCount(scanner, "2번 구역");
        int stockC = checkCount(scanner, "3번 구역");
        int stockD = checkCount(scanner, "4번 구역");

        // 필요 재고수량
        int neededA = maxStock - stockA;
        int neededB = maxStock - stockB;
        int neededC = maxStock - stockC;
        int neededD = maxStock - stockD;

        System.out.println("1번 구역: " + neededA + "개 필요");
        System.out.println("2번 구역: " + neededB + "개 필요");
        System.out.println("3번 구역: " + neededC + "개 필요");
        System.out.println("4번 구역: " + neededD + "개 필요");

        scanner.close();
    }

    // 현재 재고수량: 재고 개수는 10개를 넘을수 없고, 0보다 작을수 없음
    public static int checkCount(Scanner scanner, String text) { // scanner 에 작성한 입력값과,  text 이라는 문자열을 매개변수로 가져오자
        int maxStock = 10;
        int stock = 0; // 재고수량을 저장할 것을 0으로 초기화

        while (true) {
            System.out.print(text + "의 현재 재고 수량을 입력하세요: ");
            stock = scanner.nextInt();

            if (stock <= 0 || stock > maxStock) {
                System.out.println("다시 입력해주세요.");
            } else {
                break;
            }
        }

        return stock; // 총 결과물을 반환(전달)해줌
    }
}
