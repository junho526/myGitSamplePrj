package w3_8_functioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AdvFuncInterfaceSample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        // Consumer를 이용한 출력
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // 직접 정의한 람다식을 이용한 출력
        names.forEach(name -> System.out.println(name));

        // MathOperation 함수형 인터페이스 정의
        MathOperation multiplication = (a, b) -> Math.multiplyExact(a, b);
        System.out.println("Multiplication result: " + multiplication.operate(2, 3));

        // 예외를 던지는 람다식
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        };

        try {
            System.out.println("Division result: " + division.operate(10, 2));
            System.out.println("Division result: " + division.operate(10, 0));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    // 간단한 계산기 함수형 인터페이스
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    // 인터페이스를 람다 표현식으로 구현
    Calculator addition = (a, b) -> a + b;
    Calculator subtraction = (a, b) -> a - b;

    // 사용 예시
    int result1 = addition.calculate(5, 3);       // 5 + 3 = 8
    int result2 = subtraction.calculate(10, 5);   // 10 - 5 = 5
}
