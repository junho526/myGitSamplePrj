package w3_2_collection;

import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        Map<String,String> myLogInMap= new HashMap<>();
        System.out.println("enter your id");
        Scanner sc = new Scanner(System.in);
        String consoleInput1 = sc.nextLine();

        myLogInMap.put("user1","pass1");
        myLogInMap.put("user2","pass2");
        myLogInMap.put("user3","pass3");
        myLogInMap.put("user4","pass4");
        myLogInMap.put("user5","pass5");
        myLogInMap.put("user6","pass6");

        String userPassword = myLogInMap.get(consoleInput1);
        if(userPassword!=null){

                System.out.println("login success");


        } else {
            System.out.println("have no id");
        }
        System.out.println("enter your password");
        String consoleInput2 = sc.nextLine();
        if(consoleInput2.equals(userPassword)){
            System.out.println("login success");
        }else {
            System.out.println("login failed");
        }

//        myIntMap.put(null, 1);
//        myIntMap.put("", 1);
//        System.out.println(myIntMap);
//
//        //키를 중복해서 할당할수 없다.
//        myIntMap.put("A", 1);
//        myIntMap.put("A", 1);
//        myIntMap.put("A", 1);
//        System.out.println(myIntMap);
//
//        myIntMap.put("A", 1);
//        myIntMap.put("B", 1);
//        myIntMap.put("C", 1);
//        myIntMap.put("D", 1);
//        myIntMap.put("E", 1);
//        System.out.println(myIntMap);
//
//        System.out.println(myIntMap.keySet() instanceof Set);
//        System.out.println(myIntMap.values() instanceof Collection<Integer>);
//        System.out.println(myIntMap.values());
//        System.out.println(myIntMap.entrySet() instanceof Set<Map.Entry<String, Integer>>);
    }
}
