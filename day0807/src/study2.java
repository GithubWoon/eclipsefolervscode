import java.util.Scanner;

public class study2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("한 개의 숫자를 입력하세요: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
        } else {
            System.out.println("입력한 숫자는 " + number + "입니다.");
        }

        sc.close();
    }
}