import java.util.Scanner;

class Member {
    private String id;
    private String password;

    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    // id를 반환 
    public String getId() {
        return id;
    }

    // 입력된 password 와 저장된 password 가 일치하는지 검사
    // true, false 판별에는 boolean 이 좋음
    public boolean matchPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}

public class idpwdshipSystem {
    private Member[] members;
    private int memberCount;

    public idpwdshipSystem(int capacity) {
        members = new Member[capacity];
        memberCount = 0;
    }

    public void signUp(String id, String password) {
        if (memberCount < members.length) {
            members[memberCount] = new Member(id, password);
            memberCount++;
            System.out.println("회원가입이 완료되었습니다.");
        } else {
            System.out.println("더 이상 회원가입할 수 없습니다. 용량을 늘려주세요.");
        }
    }

    public boolean login(String id, String password) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId().equals(id) && members[i].matchPassword(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        idpwdshipSystem idpwdshipSystem = new idpwdshipSystem(10);

        while (true) {
            System.out.println("1. 회원가입  2. 로그인  3. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                idpwdshipSystem.signUp(id, password);
            } else if (choice == 2) {
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();
                if (idpwdshipSystem.login(id, password)) {
                    System.out.println("로그인 성공");
                } else {
                    System.out.println("로그인 실패");
                }
            } else if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }
}
