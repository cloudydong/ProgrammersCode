package Level1.약수의합;

import Utils.Tools;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }

    public static void main(String[] args) {
        String normal = "테스트 1 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 3 〉\t통과 (0.04ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (0.07ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (0.04ms, 52.8MB)\n" +
                "테스트 7 〉\t통과 (0.08ms, 52.9MB)\n" +
                "테스트 8 〉\t통과 (0.04ms, 52.6MB)\n" +
                "테스트 9 〉\t통과 (0.07ms, 53.1MB)\n" +
                "테스트 10 〉\t통과 (0.09ms, 51.9MB)\n" +
                "테스트 11 〉\t통과 (0.07ms, 52.3MB)\n" +
                "테스트 12 〉\t통과 (0.07ms, 51.9MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 52MB)\n" +
                "테스트 14 〉\t통과 (0.08ms, 52.8MB)\n" +
                "테스트 15 〉\t통과 (0.07ms, 51.8MB)\n" +
                "테스트 16 〉\t통과 (0.02ms, 52.2MB)\n" +
                "테스트 17 〉\t통과 (0.10ms, 53.2MB)";
        System.out.println(Tools.avgCalc(normal));
        String best = "테스트 1 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 53.1MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 5 〉\t통과 (0.05ms, 52.4MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 7 〉\t통과 (0.06ms, 53.7MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 9 〉\t통과 (0.05ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.06ms, 52.4MB)\n" +
                "테스트 11 〉\t통과 (0.04ms, 52.9MB)\n" +
                "테스트 12 〉\t통과 (0.06ms, 52.3MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 52.2MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 15 〉\t통과 (0.05ms, 53.6MB)\n" +
                "테스트 16 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 17 〉\t통과 (0.06ms, 52.2MB)";
        System.out.println(Tools.avgCalc(best));
    }
}
