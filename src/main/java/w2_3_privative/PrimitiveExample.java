package w2_3_privative;

public class PrimitiveExample {
    public static void main(String[] args) {
        int age = 25;         // 정수형
        double height = 175.5; // 실수형
        char grade = 'A';     // 문자형
        boolean isAdult = true; // 논리형

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Adult: " + isAdult);

        int myOct =02122;
        int myHex= 0x452;
        System.out.println("myOct: " + myOct);
        System.out.println("myHex: " + myHex);

        //_형식은 무시된다
        int myBin = 0b100_0101_0010;
        System.out.println("myBin: " + myBin);

    }
}