package w2_13_advancedsimulator;

import java.util.Scanner;

public class MainSimulator {
    public static void main(String[] args) {
        TV mySatelTV = new SatelTV(12, 20, 55, 55);
        TV myInterTV = new InterTV(11, 10, 50, 50);
        Aircon myAircon = new Aircondition(10, 21, 10);

        MultiRemocon myMultiRc = new MultiRemocon();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("=== 기기 명령어 ===");
        System.out.println("위성 TV: stv");
        System.out.println("인터넷 TV: itv");
        System.out.println("에어컨: ac");
        System.out.println("=================");
        System.out.print("기기를 선택하세요: ");
        String deviceInput = myScanner.nextLine();

        Object selectedDevice = null;

        switch (deviceInput) {
            case "stv" -> {
                selectedDevice = mySatelTV;
                System.out.println("위성 TV를 선택하셨습니다.");
            }
            case "itv" -> {
                selectedDevice = myInterTV;
                System.out.println("인터넷 TV를 선택하셨습니다.");
            }
            case "ac" -> {
                selectedDevice = myAircon;
                System.out.println("에어컨을 선택하셨습니다.");
            }
            default -> {
                System.out.println("잘못된 입력입니다1. 프로그램을 종료합니다.");
                return;
            }
        }

        while (true) {
            System.out.println("=== 리모컨 버튼 명세 ===");
            if (selectedDevice instanceof TV) {
                System.out.println("CH_UP = \"ch_up\"");
                System.out.println("CH_DOWN = \"ch_down\"");
                System.out.println("VOLUME_UP = \"vol_up\"");
                System.out.println("VOLUME_DOWN = \"vol_down\"");
                System.out.println("CONTRAST_UP = \"con_up\"");
                System.out.println("CONTRAST_DOWN = \"con_down\"");
                System.out.println("LIGHT_UP = \"li_up\"");
                System.out.println("LIGHT_DOWN = \"li_down\"");
            } else if (selectedDevice instanceof Aircon) {
                System.out.println("SPEED_UP = \"spd_up\"");
                System.out.println("SPEED_DOWN = \"spd_down\"");
                System.out.println("DEGREE_UP = \"deg_up\"");
                System.out.println("DEGREE_DOWN = \"deg_down\"");
                System.out.println("VECTOR_UP = \"vec_up\"");
                System.out.println("VECTOR_DOWN = \"vec_down\"");
            }
            System.out.println("POWER = \"pow\"");
            System.out.println("EXIT = \"exit\"");
            System.out.println("======================");

            System.out.print("명령어를 입력하세요: ");
            String btnInput = myScanner.nextLine();

            if (btnInput.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            myMultiRc.btnPress(selectedDevice, btnInput);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("실행 중 오류 발생: " + e.getMessage());
            }
        }

        myScanner.close();
    }
}
