package w2_8_polymopism;

interface Shape {
    //도형을  작업의 대상 또는 동작의 주제로 보고
    //기능을 구현할때,개발자들까지 합의
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class InterfacePolymorphism {
    public static void drawShape(
            //작업을 위한 input에서 인터페이스를 사용하면 메우 유연한 동작 구현 가능
            Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        drawShape(shape1);
        drawShape(shape2);
    }
}