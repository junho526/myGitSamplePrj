package w2_1_accessmodifier.a;

public class A {
    //private 접근제어자 메소드
    private static void printPrivateStrA() {
        System.out.println("privateStrA");
    }
    //default 접근제어자 메소드
    static void printPackagePrivateStrA() {
        /* package-private */
        System.out.println("packagePrivateStrA");
    }
    //protected 접근제어자 메소드 (패키지 외부로부터,상속관계가 있는 클래스)
    protected static void printProtectedStrA() {
        System.out.println("protectedStrA");
    }
    //protected 접근제어 메소드 (아무데서나)
    public static void printPublicStrA() {
        System.out.println("publicStrA");
    }

    /* 1. private 멤버 접근 가능한 유일한 위치 */
    public static void main(String[] args) {
        A.printPrivateStrA();
        A.printPackagePrivateStrA();
        A.printProtectedStrA();
        A.printPublicStrA();
    }
}
