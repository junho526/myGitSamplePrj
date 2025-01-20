package w3_10_nastedclass;

class Button {
    interface OnClickListener {  // 함수형 인터페이스
        void onClick();
    }

    private OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(() -> System.out.println("Button clicked!"));
        button.click(); // 출력: Button clicked!
    }
}