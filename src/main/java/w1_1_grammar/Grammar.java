package w1_1_grammar;

/**
 * 협업하는 개발자들을 위해서
 * 작성한 프로그램 요소별로
 * 친절한 doc주석을 작성할수있습니다.
 * => class에 대한 docs생성됨
 */

public class Grammar {
    //한줄주석
    /*
    여러줄 주석
     */
    static {
        int staticnum1=1;
    }
    /**
     * 메서드 docs에 대해서는
     * 작성하는 특별한 포멧이 존재함
     * ->API 문서 작성 및 자동생성에 필요한 기본 포멧이됨
     * @param args
     * ; 외부에서 문자열 입력을 수신하는 파라미터
     */

    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        {
            int localnum1 = 1;
            int localnum2 = localnum1+1;
            System.out.println(localnum2);
        }
        //int localnum2 = localnum1+1;

        // \n:개행, \t:탭, &nbsp; :공백문자
        // \n\r: os 시스템에 따라 개행을 이렇게 표현
        //구분자 종류
        //공백문자,세미콜론,콤마,중괄호,dot(.)

        //식별자 규칙
        int a1_$=1;
        //int 1_$a=1;

    }
}
