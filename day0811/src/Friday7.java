import java.util.Scanner;

public class Friday7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();

        System.out.print("할당할 숫자를 입력하세요: ");
        int number = scanner.nextInt();

        int[] iArr = new int[size]; // 배열의 크기가 size 인 iArr 배열
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                iArr[i] = number;
            } else {
                iArr[i] = 0;
            }
        }

        System.out.println("결과 배열:");
        for (int num : iArr) { // iArr 에 int num를 할당
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

// 예시
// 배열크기 5
// 할당숫자 3
// 출력되는 배열 3 0 3 0 3
// 3은 0번째 인덱스, 0은 1번째 인덱스, 3은 2번째 인덱스, 0은 3번째 인덱스
// 왜 이렇게 나오느냐 iArr[0] = number; 은 0번째 인덱스에 우리가 number 로 할당한 숫자를 넣어줫으니 배열 첫번쨰는 3으로 시작한다

