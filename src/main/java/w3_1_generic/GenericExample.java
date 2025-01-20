package w3_1_generic;

// (Non)Generic DTO 사용 예제
public class GenericExample {
    public static void main(String[] args) {
        // =======================================
        // 논제네릭 DTO 사용
        // =======================================
        NonGenericDTO nonGenericDTO = new NonGenericDTO();

        // Object로 데이터를 저장 (문자열)
        nonGenericDTO.setObject("I'm NonGeneric!");
        
        // 데이터를 꺼낼 때 항상 형변환이 필요
        String data = (String) nonGenericDTO.getObject();
        System.out.println(data); // 출력: Hello, NonGeneric!

        // 실수로 잘못된 형변환을 할 경우 런타임 에러 발생
        try {
            Integer wrongData = (Integer) nonGenericDTO.getObject(); // 런타임 오류 발생
        } catch (ClassCastException e) {
            System.out.println("ClassCastException 발생: " + e.getMessage());
        }

        // =======================================
        // 제네릭 DTO 사용
        // =======================================
        GenericDTO<String> stringDTO = new GenericDTO<>();

        // 컴파일 타임에 타입이 안전하게 결정됨 (문자열만 저장 가능)
        stringDTO.setObject("I'm Generic!");

        // 데이터를 꺼낼 때 형변환 불필요
        String strData = stringDTO.getObject();
        System.out.println(strData); // 출력: Hello, Generic!

        // 컴파일 타임에 잘못된 타입의 데이터 저장을 방지
        // stringDTO.setObject(12345); // 컴파일 에러 발생
        
        GenericDTO<Integer> intDTO = new GenericDTO<>();

        // 컴파일 타임에 타입이 안전하게 결정됨 (문자열만 저장 가능)
        intDTO.setObject(12345);

        // 데이터를 꺼낼 때 형변환 불필요
        String intData = String.valueOf(intDTO.getObject());
        System.out.println(intData); // 출력: 12345
    }
}