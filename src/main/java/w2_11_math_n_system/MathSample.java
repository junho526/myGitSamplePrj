package w2_11_math_n_system;
//임포트 순서관리

//기타 언어 유틸 라이브러리
//import java.util.Arrays;
//import java.util.Scanner;

//써드파티 의존성 라이브러리

//사용자정의 프로젝트 내부클래스

public class MathSample {
    public static void main(String[] args) {
        byte myByte= 0b1;
        int myInt= 1;
        long myLong1= 1; //integer 타입을 묵시적 타입 캐스팅
        long myLong2= 1L;


        double absoluteValue = Math.abs(-5.67d);
        System.out.println("Absolute Value: " + absoluteValue);

        float result1 = Math.round(10.5f); // Rounds to 11
        float result2 = Math.round(11.5f); // Rounds to 12
        float result3 = Math.round(10.2f); // Rounds to 10
        float result4 = Math.round(10.8f); // Rounds to 11

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);

    }
}
