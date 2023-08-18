public class Rectange {
    // 기본 도형 클래스
}

public class Rectange extends Shape {
    private double width;
    private double height;
    
    // 생성자
    public Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // 면적 계산 메서드
    public double calculateArea() {
        return width * height;
    }
    
    // 둘레 계산 메서드
    public double calculatePerimeter() {
        return (width + height) * 2;
    }
    
    // width Getter
    public double getWidth() {
        return width;
    }
    
    // height Getter
    public double getHeight() {
        return height;
    }
    
    // width Setter
    public void setWidth(double width) {
        this.width = width;
    }
    
    // height Setter
    public void setHeight(double height) {
        this.height = height;
    }
}
