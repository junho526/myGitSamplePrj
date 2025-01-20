package w2_17_exeption;

import java.util.Scanner;

public class SimpleTryCatchSample {

    public static void throwPartiallyHandledException() throws RuntimeException {
        boolean divisionDone = false;
        int tryCount = 1;
        Scanner userInputScanner = new Scanner(System.in);
        while(!divisionDone) {
            try {
                System.out.print("10을 나눌 분모 값을 입력하세요:");
                int devideBy = Integer.parseInt(userInputScanner.nextLine());
                division(10, devideBy);
                divisionDone = true;
                throw new Exception();
            } catch (NumberFormatException e) {
                System.err.println("숫자 형태 입력값만 받을 수 있습니다.");
            } catch (ArithmeticException e) {
//                throw e;
                System.err.println("0 으로 나눌 수 없습니다.");
            } catch (Exception e) {
                System.err.println("알려지지 않은 예외가 발생했습니다. 다시 시도해주세요");
                throw new RuntimeException("예외를 직접 처리할 수는 없지만 추가 정보를 기입하여 thow");
            } finally {
                System.out.println("시도 횟수: " + tryCount);
                tryCount++;
                if (tryCount > 9) {
                    divisionDone = true;
                }
            }
        }
    }

//    public static void main(String[] args) throws ArithmeticException {
    public static void main(String[] args) {
        //main메서드처럼 특정 영역의 메서드 호출 단계를 넘어서서 throws를 수행하면 안되는 경우가 많다.
        //ex-안정적인 하나의 기능을 제공해야 할경우(예외 상황에서 추가적인 정보를 제공하지 않고서는 상위 호출부가 해결할수 없는경우
        //반드시 catch구문에서 예외상황에 대한 내용코드를 작성해 주어야 함
//        try {
//            division(10, 0);
//        }catch(){//구체적인 정보를 가진 예외타입부터 catch수행
//            System.err.println("")
//        }catch (Exception e) {
//
//        }

        try {
            throwPartiallyHandledException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static float division(int a, int b) throws ArithmeticException, Exception
    //런타임exeption을 명시적으로
    {
        return a / b;
    }
}