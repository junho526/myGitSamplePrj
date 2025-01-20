package w3_7_travelsystem;

public class TravelAgengy {

    public static void groupTravel(Citizen[] travelers, String destinationName) {
        Nation destination = Nation.getRegisteredNation(destinationName);
        System.out.println("=== 그룹 여행: " + destinationName + " ===");

        for (Citizen ctzn : travelers) {
            ctzn.travel(destination);
        }
        System.out.println();
    }

    public static void groupEmigration(Citizen[] migrators, String destinationName) {
        Nation destination = Nation.getRegisteredNation(destinationName);
        System.out.println("=== 그룹 이민: " + destinationName + " ===");

        for (Citizen ctzn : migrators) {
            ctzn.emigration(destination);
        }
        System.out.println();
    }
}
