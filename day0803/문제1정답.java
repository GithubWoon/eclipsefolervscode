import java.util.Scanner;

public class 문제1정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int middleTerm = sc.nextInt();
		int finalTerm = sc.nextInt();
		int report = sc.nextInt();
		int attendCnt = sc.nextInt();
		
		int conMiddleTerm = (int)(middleTerm * 0.2);
		int conFinalTerm = (int)(finalTerm * 0.3);
		int conReport = (int)(report * 0.3);
		int conAttendCnt = (int)((attendCnt/20) * 0.2);
		
		int totalScore = conMiddleTerm + conFinalTerm + conReport + conAttendCnt;
		
		if( (totalScore >= 70) && (conAttendCnt > 30) ) System.out.println("Pass");
		else System.out.println("Fail");
		
		sc.close();

	}

}

// 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass, Fail 을 출력하시오
// 평가비율은 출석20%, 중간 20%, 기말 30%, 과제 30% 입니다
// 출석비율은 총 출석일 20회중에서 참여한 비율로 따집니다
// 총점 70점 이상일경우 

// &&: and
// and: and
// ||: or
// or: or
// !: not