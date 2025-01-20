package w2_17_exeption;

public class ExeptionSample {
    public static void exeptionThrow() throws Throwable{
        Throwable myThrowable = new Throwable();
        throw myThrowable;
    }

    public void exeptionHandle(){
        try{
            exeptionThrow();
        }catch (Throwable e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        //exeptionHandle();

        Error myError = new Error();
        //개발자 관심사에서 벗어난 에러
        Exception myException = new Exception();
        //고려한 범위를 벗어난 에러

    }


}
