package w3_7_travelsystem;

public class TravelControlDepartmentA {

    public boolean screenImmigration(Citizen citizen, String purpose) {
        if ("travel".equalsIgnoreCase(purpose)) {
            System.out.println("[입국 허용] " + citizen.getPersonName() + " 님의 여행 목적 입국이 허가되었습니다.");
            return true;
        } else if ("immigration".equalsIgnoreCase(purpose)) {
            if (citizen.hasCrimeRecord()) {
                System.out.println("[입국 거부] " + citizen.getPersonName() + " 님은 범죄 기록이 있어 이민이 허가되지 않았습니다.");
                return false;
            }
            System.out.println("[입국 허용] " + citizen.getPersonName() + " 님의 이민 목적 입국이 허가되었습니다.");
            return true;
        }

        System.out.println("[입국 거부] " + citizen.getPersonName() + " 님은 알 수 없는 목적입니다.");
        return false;
    }
}
