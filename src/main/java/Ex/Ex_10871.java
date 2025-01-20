package Ex;

import java.util.Scanner;

public class Ex_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for (int num : A) {
            if (num < X) {
                result.append(num).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
