package w2_10_enum;

public class ConstructorEnumExample {
    public static void main(String[] args) {
        ConstructorEnumDay today = ConstructorEnumDay.FRIDAY;

        // Enum 값과 필드 출력
        System.out.println("Today is: " + today);
        System.out.println("ConstructorEnumDay type: " + today.getType());

        // 모든 Enum 값과 필드 순회
        for (ConstructorEnumDay day : ConstructorEnumDay.values()) {
            System.out.println(day + " is a " + day.getType());
        }
    }
}