package w3_7_travelsystem;

import java.util.Map;

public class Nation {
    private static final Map<String, Nation> registeredNations;

    static {
        registeredNations = Map.of(
                "Korea", new Nation("Korea", "Democracy", new TravelControlDepartmentA()),
                "US", new Nation("US", "Democracy", new TravelControlDepartmentA()),
                "Russia", new Nation("Russia", "Tyranny", new TravelControlDepartmentB()),
                "Suriname", new Nation("Suriname", "Tyranny", new TravelControlDepartmentB())
        );
    }

    private String nationName;
    private String nationalSystem;
    private Object travelControlDepartment; // 인터페이스 대신 Object 사용

    public Nation(String nationName, String nationalSystem, Object travelControlDepartment) {
        this.nationName = nationName;
        this.nationalSystem = nationalSystem;
        this.travelControlDepartment = travelControlDepartment;
    }

    public static Nation getRegisteredNation(String nationName) {
        return registeredNations.get(nationName); // 없으면 null 리턴
    }

    public static Map<String, Nation> getRegisteredNations() {
        return registeredNations;
    }

    public String getNationName() {
        return nationName;
    }

    public String getNationalSystem() {
        return nationalSystem;
    }

    public boolean screenImmigration(Citizen screenTgPerson, String incomingPurpose) {
        if (!screenTgPerson.hasPassport()) {
            System.out.println("[입국 거부] " + screenTgPerson.getPersonName() + " 님은 여권이 없습니다.");
            return false;
        }
        if (screenTgPerson.getGender() % 2 == 1 && !screenTgPerson.hasDoneMilitary()) {
            System.out.println("[입국 거부] " + screenTgPerson.getPersonName() + " 님은 병역 의무를 이행하지 않았습니다.");
            return false;
        }

        if (travelControlDepartment instanceof TravelControlDepartmentA) {
            return ((TravelControlDepartmentA) travelControlDepartment).screenImmigration(screenTgPerson, incomingPurpose);
        } else if (travelControlDepartment instanceof TravelControlDepartmentB) {
            return ((TravelControlDepartmentB) travelControlDepartment).screenImmigration(screenTgPerson, incomingPurpose);
        }

        System.out.println("[입국 거부] 알 수 없는 국가 정책.");
        return false;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "nationName='" + nationName + '\'' +
                ", nationalSystem='" + nationalSystem + '\'' +
                ", travelControlDepartment=" + travelControlDepartment.getClass().getSimpleName() +
                '}';
    }
}
