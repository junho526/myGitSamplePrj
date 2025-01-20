package w2_8_polymopism;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class PolymorphismCollection {
    public static void main(String[] args) {
        //개념적으로 계층화된 여러 기능을 한군데에서 통합적으로 제어하기에 매우 편리함
        List<Animal> animals = new ArrayList<>();//단일 타입만을 핸들링 할 수있는 Collection
        animals.add(new Dog());//dog is an Animals
        animals.add(new Cat());//cat is an Animals

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
