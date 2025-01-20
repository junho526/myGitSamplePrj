package w3_2_collection;

import java.util.*;

public class LottoSimpleList {
    public static void main(String[] args) {
        Random rand = new Random();

        // 당첨 번호 생성
        List<Integer> winNumbers = new ArrayList<>();
        while (winNumbers.size() < 6) {
            int number = rand.nextInt(45) + 1;
            if (!winNumbers.contains(number)) {
                winNumbers.add(number);
            }
        }
        Collections.sort(winNumbers);
        System.out.println("당첨 번호: " + winNumbers);

        // 당첨될 때까지 복권 번호 생성 및 비교
        int tryCount = 0;
        List<Integer> tryNumbers;
        do {
            tryNumbers = new ArrayList<>();
            while (tryNumbers.size() < 6) {
                int number = rand.nextInt(45) + 1;
                if (!tryNumbers.contains(number)) {
                    tryNumbers.add(number);
                }
            }
            Collections.sort(tryNumbers);
            tryCount++;

            if (tryCount % 100_000 == 0) {
                System.out.println(tryCount + "회 시도 중...");
            }
        } while (!winNumbers.equals(tryNumbers));

        System.out.println("\n축하합니다! " + tryCount + "회 시도 후 당첨되었습니다!");
        System.out.println("당첨 번호: " + winNumbers);
        System.out.println("복권 번호: " + tryNumbers);
    }
}
