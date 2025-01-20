package w2_10_enum;

public enum ConstructorEnumDay {
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    // 생성자
    ConstructorEnumDay(String type) {
        this.type = type;
    }

    // Getter 메서드
    public String getType() {
        return type;
    }
}