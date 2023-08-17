public class Audio {
  private boolean power;
  private int volumn;

  // 기본생성자
  public Audio() {
    this.power = false;
    this.volumn = 0;
  }

  public boolean getPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  public int getVolumn() {
    return volumn;
  }

  public void setVolumn(int power) {
    this.volumn = power;
  }

  public void tune() {
    System.out.println("손흥민 선수 해트트릭!!!");
    
  }
}
