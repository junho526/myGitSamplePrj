package w2_10_enum;

public enum CarEnum {
    TOYOTA("Japan"),
    FORD("USA"),
    BMW("UK"),
    TESLA("EU");

    private final String type;

    CarEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
