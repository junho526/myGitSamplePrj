package w2_13_advancedsimulator;

public enum TVButton {
    POWER("pow"),
    CH_UP("ch_up"),
    CH_DOWN("ch_down"),
    VOLUME_UP("vol_up"),
    VOLUME_DOWN("vol_down"),
    CONTRAST_UP("con_up"),
    CONTRAST_DOWN("con_down"),
    LIGHT_UP("li_up"),
    LIGHT_DOWN("li_down");

    private final String userCmd;

    TVButton(String userCmd) {
        this.userCmd = userCmd;
    }

    public String getUserCmd() {
        return userCmd;
    }

    public static TVButton fromCommand(String command) {
        for (TVButton button : TVButton.values()) {
            if (button.getUserCmd().equals(command)) {
                return button;
            }
        }
        throw new IllegalArgumentException("알 수 없는 TV 버튼 입력입니다: " + command);
    }
}
