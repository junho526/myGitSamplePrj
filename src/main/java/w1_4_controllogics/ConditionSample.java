package w1_4_controllogics;
import java.util.Scanner;
public class ConditionSample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("input command");
        String consoleInput = myScanner.nextLine();

        // ########## if ###########
        //조건문과 조건식
        //문(statement) vs 식(expression)
        //문은 동작을 나타내는 코드 =>리턴밸류가 없음
        //식은 결과적으로 값을 도출하는 코드=> 리턴밸류로 수렴함
        //return value가 있는경우 변수에 할당가능해야함
        if(consoleInput.equals("true") ){
            System.out.println("this is true");
        } else if(consoleInput.equals("middle") ){
            System.out.println("this is middle");}
        else {
            System.out.println("this is else");
        }


        // ########## switch ########
        //값의 boolean 변환없이 분기 수행할수 있는 구문
        //break사용
        //아무 분기에도 해당하지 않으면 defalt 정의가능
        int commandInt = Integer.parseInt(consoleInput);
        switch(commandInt){
            case 10:
                System.out.println("low score");
                break;
            case 50:
                System.out.println("middle score");
                break;
            case 90:
                System.out.println("high score");
                break;
            default:
                System.out.println("your score is " + commandInt);
        }
    }
}
