public class car {

    public void switchOn() {bRunning = true;}
    public void swtichOff() {bRunning = false;}

    public float accerlate() {
        if (!bRunning) return 0.f;

        if (fSpped >= 300) {fSpeed += 300;}
        else {}
    }
}
