package w3_7_lsp;

import java.util.*;

public class EX_2456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit1Sum = 0;
        int digit2Sum = 0;
        int digit3Sum = 0;

        for (int i = 0; i < n; i++) {

            List<Integer> numbers = Arrays.asList(1, 2, 3);

            Collections.shuffle(numbers);

            StringBuilder line = new StringBuilder();
            for (int num : numbers) {
                line.append(num);
            }
            System.out.println("next: " + line);

            digit1Sum += Character.getNumericValue(line.charAt(0));
            digit2Sum += Character.getNumericValue(line.charAt(1));
            digit3Sum += Character.getNumericValue(line.charAt(2));

            System.out.println("a: " + digit1Sum);
            System.out.println("b: " + digit2Sum);
            System.out.println("c: " + digit3Sum);
        }

        int maxSum = Math.max(Math.max(digit1Sum, digit2Sum), digit3Sum);

        if (maxSum == digit1Sum && maxSum != digit2Sum && maxSum != digit3Sum) {
            System.out.println("a: " + digit1Sum);
        } else if (maxSum == digit2Sum && maxSum != digit1Sum && maxSum != digit3Sum) {
            System.out.println("b: " + digit2Sum);
        } else if (maxSum == digit3Sum && maxSum != digit1Sum && maxSum != digit2Sum) {
            System.out.println("c: " + digit3Sum);
        } else {
            System.out.println("revote");
        }


        sc.close();
    }
}
