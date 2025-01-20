package w2_5_shallowdeep;

public class CopyTypeSample {
    public static void main(String[] args) {
        //참조자료인 비밀 객체를 생성
        int[] a = {1, 2, 3, 4, 5};
        //1.참조 자료형을 담은 뱐수(배열객체)를 할당 연산자를 이용해 다른 변수에 할당
        int[] b = a;
        //2.deepcopy 를 수행하는 메서드를 명시적으로 사용한후 새 변수에 할당
        int[] c = a.clone();

        a[4] = 99;  // {1, 2, 3, 4, 99};
        System.out.printf("5th int in b is : %d \n" ,b[4]);
        System.out.printf("5th int in c is : %d" ,c[4]);
    }
}