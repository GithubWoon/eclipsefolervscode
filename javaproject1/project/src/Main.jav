public class Student {
  private int studentId; // 학번 // private 는 외부에서 접근 불가능하게 한것 즉, 여기서는 없어도 무방함
  private String studentName; // 이름
  private Subeject majorSubject; // 중점과목

  // 학생의 성적 리스트
  private ArrayList<Score> scoreList = new ArrayList<Score>(); // 점수 리스트로 추가됨

  public Student(int studentId, String studentName, Subejcet majorSubject) {
    this.studentId = student
  }
}