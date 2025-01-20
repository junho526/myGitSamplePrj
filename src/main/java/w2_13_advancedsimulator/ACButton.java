package w2_13_advancedsimulator;

public enum ACButton {
    POWER("pow"),
    SPEED_UP("spd_up"),
    SPEED_DOWN("spd_down"),
    DEGREE_UP("deg_up"),
    DEGREE_DOWN("deg_down"),
    VECTOR_UP("vec_up"),
    VECTOR_DOWN("vec_down");

    private final String userCmd;

    ACButton(String userCmd) {
        this.userCmd = userCmd;
    }

    public String getUserCmd() {
        return userCmd;
    }

    public static ACButton fromCommand(String command) {
        for (ACButton button : values()) {
            if (button.getUserCmd().equals(command)) {
                return button;
            }
        }
        throw new IllegalArgumentException("알 수 없는 에어컨 버튼 입력입니다: " + command);
    }
}
