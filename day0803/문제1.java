import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 중간점수 입력값
		int B = sc.nextInt(); // 기말점수 입력값
		int C = sc.nextInt(); // 과제점수 입력값
		int D = sc.nextInt(); // 출석횟수 입력값
		

		// 환산점수, 타입을 숫자로 나타내줘야 하니까 앞에 int 를 붙였음
		int E = (int)(A * 0.2); // 중간환산
		int F = (int)(B * 0.3); // 기말환산
		int G = (int)(C * 0.3); // 과제환산
		int H = (int)(D); // 출석환산 // 환산되는 최대 출석점수 20점 // 총 수업일 20일, 수업 1회당 1점받음 // 출석 6회 이하면 결석
		int total = E + F + G + H; // 총점
		
		if(total >= 70) // 총점 70점 이상일때 Pass 지만
			if(D <= 6) { // 출석이 6회 이하라면 Fail 을 줌 
				System.out.println("Fail");
			}
			else {
				System.out.println("Pass");
			}
			
		else
			System.out.println("Fail");
		
		sc.close();

	}

}
