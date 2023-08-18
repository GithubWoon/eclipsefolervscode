public class Rectange extends Shape {
    private double width;
    private double height;
    
    // 생성자
    public Rectange() {}
    public Rectange(double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    
    public double area() {
        double dArea = width * height;
        return dArea;
    }
    
    public double perimeter() {
        double dPerimeter = (w*h)*2;
        return dPerimeter;
    }

  }

