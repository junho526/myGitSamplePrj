package w3_9_annonymusclass;

public class AnnoymClassSample {
    public static void main(String[] args) {
        Duck duck = new Duck() {
            @Override
            public void quack(){
                System.out.println("QQQQQQUUUUAAAACCCKKK!!!!!!!!!!!!!!");
            }
        };
        duck.quack();
    }
}
