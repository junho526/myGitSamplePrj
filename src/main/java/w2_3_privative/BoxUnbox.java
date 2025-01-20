package w2_3_privative;

public class BoxUnbox {
    public static void main(String[] args) {
        int num = 10;
        Integer boxedNum = Integer.valueOf(num); // 박싱
        //박싱을 하는이유
        //wrapper클래스가 가지고있는
        //다양한 핸들링방법을 utill처럼 활용하기 위해

        int unboxednum = boxedNum.intValue(); // 언박싱
        //언박싱을 하는이유
        //가볍고 다양한 연산에 편리하기 때문

        System.out.println(unboxednum);
        System.out.println(boxedNum);

        Integer autoBoxed = 10;
        Integer boxedAuto = autoBoxed.intValue();
        System.out.println(boxedAuto);
    }

}
