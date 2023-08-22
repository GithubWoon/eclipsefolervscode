// Shape 인터페이스
// draw 로 호출

interface Shape {
    void draw();
}

// Concrete Shape 클래스들
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a RoundedRectangle");
    }
}

class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a RoundedSquare");
    }
}
/////////////////////////////////////////////////////////////////////////


// AbstractFactory 인터페이스
// getShape 로 호출
interface AbstractFactory {
    Shape getShape();
}

// Concrete AbstractFactory 클래스들
class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();  // ShapeFactory에서 Rectangle 객체를 생성
    }
}

class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape() {
        return new RoundedRectangle();  // RoundedShapeFactory에서 RoundedRectangle 객체를 생성
    }
}

// FactoryProducer 클래스
// 여기서부터 이해필요
class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

// AbstractFactoryPatternDemo 클래스
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape();
        rectangle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        Shape roundedRectangle = roundedShapeFactory.getShape();
        roundedRectangle.draw();
    }
}
