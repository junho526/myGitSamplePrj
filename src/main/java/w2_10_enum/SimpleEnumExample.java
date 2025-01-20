package w2_10_enum;

// 사용 예시
public class SimpleEnumExample {
    public static void main(String[] args) {
        SimpleEnumDay today = SimpleEnumDay.FRIDAY;

        // Enum 값과 필드 출력
        System.out.println("Today is: " + today);
        System.out.println("Day type: " + today.getType());

        // 모든 Enum 값과 필드 순회
        for (SimpleEnumDay day : SimpleEnumDay.values()) {
            System.out.println(day + " is a " + day.getType());
        }

    }
}
