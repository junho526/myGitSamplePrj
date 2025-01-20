package w3_7_lsp;

public class LspSampleMain {
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        makeBirdFly(ostrich); // 예외 발생!
    }

    static void makeBirdFly(Bird bird) {
        bird.fly(); // throws 감지 불가능
    }
}

class Bird {
    void fly() {
        // 새가 날아감
    }
}

class Ostrich extends Bird {
    //상위 객체에서 정상작동하는 extends 키워드 위반
    void fly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("타조는 날지 못합니다.");
    }
}