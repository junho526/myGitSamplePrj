package w2_12_simulator;

public enum RemoconEnum {
    Chanel("채널"),
    Contrast("대비"),
    Light("밝기"),
    On("전원"),
    Volume("볼륨");

    private final String command;

    RemoconEnum(String command) {
        this.command = command;
    }
    public String getCommand() {
        return command;
    }

    public static RemoconEnum fromCommand(String command) {
        for (RemoconEnum remocon : values()) {
            if (remocon.getCommand().equals(command)) {
                return remocon;
            }
        }
        throw new IllegalArgumentException("다시입력해 주세요: " + command);
    }
}
