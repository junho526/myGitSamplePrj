package w3_7_travelsystem;

import java.util.*;

public class TravelSystemMain {

    static List<Citizen> createCitizens() {
        Citizen kor1 = new Citizen("한규덕", Nation.getRegisteredNation("Korea"), 1, true, false, false);
        Citizen kor2 = new Citizen("이형준", Nation.getRegisteredNation("Korea"), 1, true, true, false);
        Citizen us1 = new Citizen("Terry", Nation.getRegisteredNation("US"), 1, true, false, false);
        Citizen us2 = new Citizen("Mings", Nation.getRegisteredNation("US"), 1, true, true, true);
        Citizen russ1 = new Citizen("제욱", Nation.getRegisteredNation("Russia"), 1, true, false, false);
        Citizen russ2 = new Citizen("수정", Nation.getRegisteredNation("Russia"), 2, true, false, false);
        Citizen suri1 = new Citizen("김민성", Nation.getRegisteredNation("Suriname"), 1, true, false, false);
        Citizen suri2 = new Citizen("박태림", Nation.getRegisteredNation("Suriname"), 1, true, true, false);
        Citizen noNation1 = new Citizen("putin", null, 1, false, true, true);
        Citizen noNation2 = new Citizen("johan", null, 1, false, false, true);

        return new ArrayList<>(Arrays.asList(
                kor1, kor2, us1, us2, russ1, russ2, suri1, suri2, noNation1, noNation2
        ));
    }

    public static void main(String[] args) {

            // 1. 시민 목록 생성
            List<Citizen> citizens = createCitizens();

            // 2. 단체 여행
            System.out.println("=== 단체 여행 ===");
            TravelAgengy.groupTravel(citizens.toArray(new Citizen[0]), "US");

            // 3. 단체 이민
            System.out.println("\n=== 단체 이민 ===");
            TravelAgengy.groupEmigration(citizens.toArray(new Citizen[0]), "Korea");
        }
    }

