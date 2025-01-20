package w1_3_simplehearit;

// 상속을 나타내는 키워드 extends
//확장이 아니라 상속하기때문
public class Child extends Parent {
    @Override
    public void hello(String target) {
        /*
        if (target==null || target.isEmpty()) {
            super.hello(target);
        } else {
            System.out.println("hello "+target+" from child!");
        }
        */
        super.hello(target);
        System.out.println("from parent!");
    }

}
