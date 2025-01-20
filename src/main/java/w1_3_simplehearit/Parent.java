package w1_3_simplehearit;

public class Parent {
    public void hello (String target) {
        if (target==null || target.isEmpty()) {
            System.out.println("hello nobody!");
        } else {
            System.out.println("hello "+ target + "!");
        }
    }
}
