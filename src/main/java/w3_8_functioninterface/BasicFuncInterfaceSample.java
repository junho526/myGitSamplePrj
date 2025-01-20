package w3_8_functioninterface;
// 람다 표현식을 사용하여 두 수를 더하기
import java.util.function.BinaryOperator;

public class BasicFuncInterfaceSample {

    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(3, 4); // 7
    }

    // 정적 메서드를 참조하는 람다 표현식
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }


}
