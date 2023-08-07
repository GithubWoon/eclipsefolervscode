import java.util.Scanner;

public class 문제3정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성하고자하는 비밀번호 입력");
		String password = sc.nextLine();
		if( ((password.charAt(0)) < 48) || ((password.charAt(0)) >57) )
		{
			System.out.println("비밀번호 첫자리는 0을 제외한 수를 입력하세요");
		}
		else
		{
			if(password.length() == 4)
				for(int i = 0; i<password.length(); i++)
				{
					
				}
		}

	}

}
