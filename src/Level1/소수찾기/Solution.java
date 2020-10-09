package Level1.소수찾기;

import Utils.Tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        int primeCnt = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * 2; j <= n; j += i) {
                isPrime[j - 1] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i - 1]) {
                primeCnt++;
            }
        }
        return primeCnt;
    }


    public static void main(String[] args) {
        String first = "테스트 1 〉\t통과 (0.03ms, 53.3MB)\n" +
                "테스트 2 〉\t통과 (0.06ms, 51.6MB)\n" +
                "테스트 3 〉\t통과 (0.09ms, 52.4MB)\n" +
                "테스트 4 〉\t통과 (0.18ms, 52MB)\n" +
                "테스트 5 〉\t통과 (0.13ms, 53.3MB)\n" +
                "테스트 6 〉\t통과 (5.39ms, 51.9MB)\n" +
                "테스트 7 〉\t통과 (0.41ms, 53.3MB)\n" +
                "테스트 8 〉\t통과 (0.93ms, 53.1MB)\n" +
                "테스트 9 〉\t통과 (1.71ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (26.89ms, 52.9MB)\n" +
                "테스트 11 〉\t통과 (24.26ms, 53.3MB)\n" +
                "테스트 12 〉\t통과 (17.70ms, 52MB)\n" +
                "테스트 1 〉\t통과 (23.48ms, 54MB)\n" +
                "테스트 2 〉\t통과 (31.14ms, 53.8MB)\n" +
                "테스트 3 〉\t통과 (23.54ms, 52.8MB)\n" +
                "테스트 4 〉\t통과 (24.77ms, 55MB)";
        System.out.println(Tools.avgCalc(first));
        String notGood = "테스트 1 〉\t통과 (0.02ms, 53.5MB)\n" +
                "테스트 2 〉\t통과 (0.04ms, 52.8MB)\n" +
                "테스트 3 〉\t통과 (0.07ms, 52.1MB)\n" +
                "테스트 4 〉\t통과 (0.14ms, 52.5MB)\n" +
                "테스트 5 〉\t통과 (0.09ms, 52.8MB)\n" +
                "테스트 6 〉\t통과 (1.11ms, 51.8MB)\n" +
                "테스트 7 〉\t통과 (0.31ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (0.55ms, 52.3MB)\n" +
                "테스트 9 〉\t통과 (1.34ms, 53.3MB)\n" +
                "테스트 10 〉\t통과 (10.46ms, 52.3MB)\n" +
                "테스트 11 〉\t통과 (24.41ms, 53.5MB)\n" +
                "테스트 12 〉\t통과 (21.90ms, 53.2MB)\n" +
                "테스트 1 〉\t통과 (24.27ms, 54MB)\n" +
                "테스트 2 〉\t통과 (21.55ms, 53.1MB)\n" +
                "테스트 3 〉\t통과 (15.48ms, 54.2MB)\n" +
                "테스트 4 〉\t통과 (15.87ms, 53.5MB)";
        System.out.println(Tools.avgCalc(notGood));
    }
}
