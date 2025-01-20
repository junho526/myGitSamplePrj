package w2_15_overflow_n_underflow;

import java.math.BigDecimal;

public class OverUnderFlowSample {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE; // 2147483647
        int result = maxValue + 1; // 오버플로우 발생

        System.out.println("Max Value: " + maxValue); // 2147483647
        System.out.println("Result after Overflow: " + result); // -2147483648

        float smallValue = 1.4e-45f; // float의 최소 양수 값
        float resultFloat = smallValue / 10; // 언더플로우 발생
        System.out.println("Float result (Underflow): " + resultFloat); // 출력: 0.0

        // BigDecimal 사용
        BigDecimal smallValueBD = new BigDecimal("1.4e-45");
        BigDecimal resultBigDecimal = smallValueBD.divide(new BigDecimal("10"));
        System.out.println("BigDecimal result: " + resultBigDecimal.toPlainString()); // 정확한 결과 출력
    }
}
