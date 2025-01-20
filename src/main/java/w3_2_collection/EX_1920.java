package w3_2_collection;

import java.util.Scanner;
import java.util.HashSet;

public class EX_1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N을 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "개의 정수를 입력하세요: ");
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.print("찾고자 하는 정수를 입력하세요: ");
        int m = scanner.nextInt();


        if (numbers.contains(m)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}

