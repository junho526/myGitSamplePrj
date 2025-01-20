package w2_10_enum;

public class CarEnumExample {
    public static void main(String[] args) {
        CarEnum MadeIn = CarEnum.TOYOTA;

        System.out.println(MadeIn+" is a "+MadeIn.getType());

        for (CarEnum car: CarEnum.values()) {
            System.out.println(car + " is maid in " + car.getType());

        }
    }
}
