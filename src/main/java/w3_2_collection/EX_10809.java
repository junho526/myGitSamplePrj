package w3_2_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단어를 입력하세요: ");
        String s = scanner.nextLine();

        Map<Character, Integer> alphabetPosition = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!alphabetPosition.containsKey(ch)) {
                alphabetPosition.put(ch, i);
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(alphabetPosition.getOrDefault(ch, -1) + " ");
        }
    }
}

