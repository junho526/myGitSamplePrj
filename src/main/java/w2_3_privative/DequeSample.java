package w2_3_privative;
// java는 객체지향이지만 유틸클래스는 객체화를 염두에 두지않고 주로 동작만 정의하거나 ,main메서드만 사용
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSample {
    public static void main(String[] args) {
        Deque<Integer> intDeque1 = new ArrayDeque<>(10);
        for (int i=0; i<10; i++) {
            // intDeque1.add(i);
            intDeque1.addLast(i);
        }
        System.out.println("remove first <- " + intDeque1 + " <- add last");

        for (int i=0; i<10; i++) {
            System.out.println(intDeque1.removeFirst());
        }

        Deque<Integer> intDeque2 = new ArrayDeque<>(10);
        for (int i=0; i<10; i++) {
            intDeque2.addFirst(i);
        }
        System.out.println("add first -> " + intDeque2 + " -> remove last");

        for (int i=0; i<10; i++) {
            System.out.println(intDeque2.removeLast());
        }
    }
}