package w2_13_advancedsimulator;

public class MultiRemocon {

    public void btnPress(Object device, String btnInput) {
        if (device instanceof TV) {
            handleTVInput((TV) device, btnInput);
        } else if (device instanceof Aircon) {
            handleAirconInput((Aircon) device, btnInput);
        } else {
            System.out.println("지원되지 않는 기기입니다.");
        }
    }

    private void handleTVInput(TV tv, String btnInput) {
        try {
            TVButton button = TVButton.fromCommand(btnInput);
            switch (button) {
                case POWER -> tv.powerToggle();
                case CH_UP -> tv.channelUp();
                case CH_DOWN -> tv.channelDown();
                case VOLUME_UP -> tv.volumeUp();
                case VOLUME_DOWN -> tv.volumeDown();
                case CONTRAST_UP -> tv.contrastUp();
                case CONTRAST_DOWN -> tv.contrastDown();
                case LIGHT_UP -> tv.lightUp();
                case LIGHT_DOWN -> tv.lightDown();
                default -> System.out.println("지원되지 않는 TV 버튼입니다.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 TV 버튼 입력: " + btnInput);
        }
    }

    private void handleAirconInput(Aircon aircon, String btnInput) {
        try {
            ACButton button = ACButton.fromCommand(btnInput);
            switch (button) {
                case POWER -> aircon.powerToggle();
                case SPEED_UP -> aircon.speedUp();
                case SPEED_DOWN -> aircon.speedDown();
                case DEGREE_UP -> aircon.degreeUp();
                case DEGREE_DOWN -> aircon.degreeDown();
                case VECTOR_UP -> aircon.vectorUp();
                case VECTOR_DOWN -> aircon.vectorDown();
                default -> System.out.println("지원되지 않는 에어컨 버튼입니다.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 에어컨 버튼 입력: " + btnInput);
        }
    }
}
