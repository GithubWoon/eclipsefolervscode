import java.util.Scanner;

public class Friday6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 크기 입력 받기
        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        
        // 정수형 배열 생성
        int[] iArr = new int[size]; // siz는 배열의 크기
        
        // 가운데 위치 계산
        int middleIndex = size / 2;
        
        // 가운데 위치에 값 입력 받기
        System.out.print("가운데 위치에 넣을 정수 값을 입력하세요: ");
        int middleValue = scanner.nextInt();
        iArr[middleIndex] = middleValue;
        
        // 배열의 값을 출력하는 대신 배열 자체를 출력
        System.out.print("배열의 값: [");
        for (int i = 0; i < size; i++) {
            System.out.print(iArr[i]); // iArr 이라는 배열에 i+1번쨰요소
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}
