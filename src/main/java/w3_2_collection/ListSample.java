package w3_2_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Objects;

public class ListSample {
    public static void main(String[] args) {
        //array list
        //linked list
        //list

        //광범위한 타입 선언문 권장하지않음
        List<Objects> myList1 = new ArrayList<>();
        List<Objects> myList2 = new ArrayList<>();


        //변수에 제네릭 차입선언후, 할당되는 객체 생성되는경우 그때맞는 타입이 들어가는것이 상식
        //자동으로 타입 추론되므로 생략 권장 ->연역 추론
        List<String> myStrArrList = new ArrayList<String>(10);
        //arrtlist 생성시 메모리 합류크기 바꿔가며 테스트
        List<String> myStrLinkList = new LinkedList<>();

        myStrArrList.add("1");
        myStrArrList.add("2");
        myStrArrList.add("3");
        myStrArrList.add(2,"2.5");
        myStrArrList.add(2,"2.7");

        System.out.println(myStrArrList);

        if (myStrArrList.contains("1")){
            System.out.println("1 is a list");
        }

        System.out.println(myStrArrList.get(4));
        System.out.println(myStrArrList.isEmpty());
        System.out.println(myStrArrList.size());
        myStrArrList.clear();
        System.out.println(myStrArrList);
    }
}
