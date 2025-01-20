package w3_7_travelsystem;

public class Citizen implements IControlTravel {
    private String personName;        // 이름
    private Nation nationality;       // 국적
    private int gender;               // 1, 3 - 남성, 2, 4 - 여성 (%2 연산으로 처리 예정)
    private boolean hasPassport;      // 여권
    private boolean hasDoneMilitary;  // 병역
    private boolean hasCrimeRecord;   // 범죄

    public Citizen(
            String personName, Nation nationality, int gender,
            boolean hasPassport, boolean hasDoneMilitary, boolean hasCrimeRecord
    ) {
        this.personName = personName;
        this.nationality = nationality;
        this.gender = gender;
        this.hasPassport = hasPassport;
        this.hasDoneMilitary = hasDoneMilitary;
        this.hasCrimeRecord = hasCrimeRecord;
    }

    public String getPersonName() {
        return personName;
    }

    public Nation getNationality() {
        return nationality;
    }

    public int getGender() {
        return gender;
    }

    public boolean hasPassport() {
        return hasPassport;
    }

    public boolean hasDoneMilitary() {
        return hasDoneMilitary;
    }

    public boolean hasCrimeRecord() {
        return hasCrimeRecord;
    }

    @Override
    public void travel(Nation tgNation) {
        boolean result = tgNation.screenImmigration(this, "travel");
        if (result) {
            System.out.println("[여행 성공] " + personName + " 님이 " + tgNation.getNationName() + "에 여행 입국에 성공했습니다.");
        } else {
            System.err.println("[여행 실패] " + personName + " 님이 " + tgNation.getNationName() + "에 여행 입국에 실패했습니다.");
        }
    }

    @Override
    public void emigration(Nation tgNation) {
        boolean result = tgNation.screenImmigration(this, "immigration");
        if (result) {
            System.out.println("[이민 성공] " + personName + " 님이 " + tgNation.getNationName() + "에 이민 입국에 성공했습니다.");
        } else {
            System.err.println("[이민 실패] " + personName + " 님이 " + tgNation.getNationName() + "에 이민 입국에 실패했습니다.");
        }
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "personName='" + personName + '\'' +
                ", nationality=" + ((nationality != null) ? nationality.getNationName() : "무국적") +
                ", gender=" + gender +
                ", hasPassport=" + hasPassport +
                ", hasDoneMilitary=" + hasDoneMilitary +
                ", hasCrimeRecord=" + hasCrimeRecord +
                '}';
    }
}
