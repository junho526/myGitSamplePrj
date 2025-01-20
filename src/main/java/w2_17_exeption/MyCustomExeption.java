package w2_17_exeption;

public class MyCustomExeption extends RuntimeException {
    public static void throwCustomException() {
        throw new MyCustomExeption();
    }

    public static void main(String[] a) {
        throwCustomException();
    }
}
