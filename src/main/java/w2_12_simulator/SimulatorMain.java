package w2_12_simulator;

import java.util.Scanner;


public class SimulatorMain implements RemoconInterface {
    @Override
    public void remoconMethod() {
        System.out.println("리모컨 실행중");
    }

    public static void main(String[] args) {
        // 1. 시뮬레이션에 필요한 객체 명세 생성
        TV myTV = new TV(11,1,50,50);
        TVRemocon myTVRc= new TVRemocon();
        Scanner myScanner = new Scanner(System.in);
        
        // 2. 사용자 input 커맨드 안내 출력
        System.out.println("안내 커맨드");

        // 3. 본격적인 시뮬레이터 동작 시작
        while(true) {
            System.out.println("리모컨 버튼을 누르시오.");
            String consoleInput = myScanner.nextLine();

            if(consoleInput.equals("exit")) {
                System.out.println("종료합니다");
                return;
            }
            myTVRc.btnPress(myTV, consoleInput);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 유저 인풋 수신
            /*
               유저 인풋 해석 => 동작
             */
            // 유저 인풋이 시뮬레이션 종료 커맨드일 때 return
        }

    }


}