package w1_2_class;

public class OverloadingDog {
    String name;
    int age;
    int furLength;
    // overloading
    //이름은 같지만 시그니쳐가 다른 메서드나 생성자를 여러개 선언하는것

    //생성자1
    public OverloadingDog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //생성자2
    public OverloadingDog(String name, int age, int furLength) {
        this.name = name;
        this.age = age;
        this.furLength = furLength;
    }

    //생성자3(bad)
    public OverloadingDog(int furLength,String name, int age) {
        this.name = name;
        this.age = age;
        this.furLength = furLength;
    }

    public void bark() {
        System.out.println("Woof! My name is " + name + " and I'm " + age + " years old.");
    }
    //n회반복
    public void bark(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(
                    "(" + i + ") Woof! My name is " + name
                            + " and I'm " + age + " years old."
            );
        }
    }
    public static void main(String[] args) {
        //바꿀수는 있지만
        //1.너무많이 바꿀수있다
        //2.내가 작성하지 않은 부분을 건들일수 있다
        OverloadingDog mydog1 = new OverloadingDog("Dog", 18);
        OverloadingDog mydog2 = new OverloadingDog("Dodo", 10,5);

        mydog1.bark();
        mydog2.bark();
        //overloading bad case
        //1.용도가 다르지 않고
        //2.기능이 추가되자 않았고
        //3.기존과 일관성을 해침
        OverloadingDog mydog3 = new OverloadingDog(1,"Doge", 7);

        mydog3.bark();
    }
}
