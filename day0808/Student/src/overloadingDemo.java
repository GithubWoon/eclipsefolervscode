class overloading {
    int[] oprands;

    public void setOprands(int[] oprands) {
        this.oprands = oprands;
    }

    public void sum() {
        int total = 0;
        for (int value : this.oprands) {
            total += value;
        }
        System.out.println(total);
    }

    public void avg() {
        int total = 0;
        for (int value : this.oprands) {
            total += value;
        }
        System.out.println(total / this.oprands.length);
    }
}

public class overloadingDemo {
    public static void main(String[] args) {
        overloading c1 = new overloading();
        c1.setOprands(new int[]{10,20});
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   
    }