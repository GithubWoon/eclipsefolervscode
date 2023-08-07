import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String password = sc.nextLine(); // password 입력값
		
		// 비밀번호 자리파악
		char First = (password.charAt(0)); // password 의 첫번째 문자
		char Second = (password.charAt(1));
		char Third = (password.charAt(2));
		char Fourth = (password.charAt(3));
		
		// 4자리 초과 입력했을때
		
		if(password.length()>4) { 
		System.out.println("비밀번호 생성불가 길이를 4자로 맞춰주세요");
		}
		
		// 4자리 미만 입력했을때
		else if(password.length()<4) {
			System.out.println("비밀번호 생성불가 길이를 4자로 맞춰주세요");
		}
		
		// 첫번째 자리에 0이 올경우
		else if(First == '0') {
			System.out.println("비밀번호 생성불가 첫번째 자리는 0을 제외한 수를 입력해주세요");
		}
		
		// 중복되는 숫자확인
		else if(First == Second || First == Third || First == Fourth || 
				Second == Third || Second == Fourth || 
				Third == Fourth) {
			System.out.println("비밀번호 생성불가 중복된 숫자가 존재합니다");
		}
		
		// 생성완료
		else{
			System.out.println("비밀번호 생성완료");
		}

	}
}