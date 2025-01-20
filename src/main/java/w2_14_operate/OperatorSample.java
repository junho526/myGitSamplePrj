package w2_14_operate;

public class OperatorSample {
    public static void main(String[] args) {
        int volume = 10;
        volume++;  // 문이자 식
        System.out.println(volume);

        boolean powerOn = false;
        // !powerOn;  // 문으로 기능하지 못하고, 식만으로 작용
        System.out.println(!powerOn);
        // 문(Statement), 식(Expression),
        // -> 식은 단일한 데이터 값을 제공함

        int valueLoss = (int) Long.MAX_VALUE;
        System.out.println(valueLoss);
        long valueKeep = (long) Integer.MIN_VALUE;
        System.out.println(valueKeep);

        byte original = 0b0000011;  // 십진수 3
        System.out.println(toBinaryString(original));
        byte flipped = (byte) ~original;
        System.out.println(toBinaryString(flipped));

        short a =10;
        int b=100;
        System.out.println(a+b);
        short c = (short)(a+b);
        //작다 크다의 기준: 특정 데이터 타입으로 표현 가능한 값의 범위

        float d=100.01f;
        int e=(int)(b+d);

        int hotDegree=30;
        int nowTemperature =32;
        boolean isHot = nowTemperature>hotDegree;
        System.out.println(isHot);

        if(false & (nowTemperature>hotDegree)) {
            System.out.println("판단을 수행합니다.");
        }
        // 기존의 조건문 (큰 값을 출력)
        int bbb = 1000;
        int sss = 1;
        if (bbb > sss) {
            System.out.println(bbb);
        } else {
            System.out.println(sss);
        }
// 최대 값과 같은 단순한 조건 판단 시 조건문을 축약
        int max = (bbb > sss) ? bbb : sss;
        System.out.println(max);
    }

    // byte 값을 8비트 2진수 문자열로 변환
    private static String toBinaryString(byte value) {
        return String.format("%8s", Integer.toBinaryString(value & 0xFF)).replace(' ', '0');
    }
}
