package w2_11_math_n_system;

public class SystemCallSample {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        System.out.println("현재 시간(밀리초): " + currentTime);

        long nanoTime = System.nanoTime();
        System.out.println("현재 시간(나노초): " + nanoTime);

        String userName = System.getenv("USER");
        System.out.println("사용자 이름: " + userName);
    }
}
