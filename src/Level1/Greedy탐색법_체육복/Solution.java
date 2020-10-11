package Level1.Greedy탐색법_체육복;

import Utils.Tools;

import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < reserve.length; i++) {
            map.put(reserve[i], true);
        }
        for (int i = 0; i < lost.length; i++) {
            if (map.getOrDefault(lost[i], false)) {
                map.remove(lost[i]);
                lost[i] = -99;
                answer++;
            }
        }
        for (int i = 0; i < lost.length; i++) {
            if (map.getOrDefault(lost[i] - 1, false)) {
                map.remove(lost[i] -1);
                answer++;
            } else if (map.getOrDefault(lost[i] + 1, false)) {
                map.remove(lost[i] + 1);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(5 , new int[]{2,4}, new int[]{1,3,5});
        String first = "테스트 1 〉\t통과 (0.07ms, 52.8MB)\n" +
                "테스트 2 〉\t통과 (0.09ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (0.08ms, 53.8MB)\n" +
                "테스트 4 〉\t통과 (0.05ms, 51.9MB)\n" +
                "테스트 5 〉\t통과 (0.08ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (0.06ms, 52.2MB)\n" +
                "테스트 7 〉\t통과 (0.10ms, 52.8MB)\n" +
                "테스트 8 〉\t통과 (0.05ms, 52.9MB)\n" +
                "테스트 9 〉\t통과 (0.05ms, 51.9MB)\n" +
                "테스트 10 〉\t통과 (0.38ms, 53.3MB)\n" +
                "테스트 11 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 12 〉\t통과 (0.04ms, 51.9MB)";
        System.out.println(Tools.avgCalc(first));
        String useHashSet = "테스트 1 〉\t통과 (0.09ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (0.09ms, 52.4MB)\n" +
                "테스트 3 〉\t통과 (0.11ms, 53.1MB)\n" +
                "테스트 4 〉\t통과 (0.05ms, 52.7MB)\n" +
                "테스트 5 〉\t통과 (0.07ms, 51.8MB)\n" +
                "테스트 6 〉\t통과 (0.05ms, 52.2MB)\n" +
                "테스트 7 〉\t통과 (0.08ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (0.07ms, 51.8MB)\n" +
                "테스트 9 〉\t통과 (0.05ms, 53MB)\n" +
                "테스트 10 〉\t통과 (0.07ms, 52.4MB)\n" +
                "테스트 11 〉\t통과 (0.06ms, 51.8MB)\n" +
                "테스트 12 〉\t통과 (0.07ms, 52.4MB)";
        System.out.println(Tools.avgCalc(useHashSet));
        String best = "테스트 1 〉\t통과 (0.07ms, 53MB)\n" +
                "테스트 2 〉\t통과 (0.08ms, 51.9MB)\n" +
                "테스트 3 〉\t통과 (0.07ms, 53.4MB)\n" +
                "테스트 4 〉\t통과 (0.05ms, 53.1MB)\n" +
                "테스트 5 〉\t통과 (0.09ms, 52.9MB)\n" +
                "테스트 6 〉\t통과 (0.05ms, 52.7MB)\n" +
                "테스트 7 〉\t통과 (0.09ms, 52.6MB)\n" +
                "테스트 8 〉\t통과 (0.07ms, 52.8MB)\n" +
                "테스트 9 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 10 〉\t통과 (0.08ms, 52.1MB)\n" +
                "테스트 11 〉\t통과 (0.04ms, 52.1MB)\n" +
                "테스트 12 〉\t통과 (0.06ms, 52.5MB)";
        System.out.println(Tools.avgCalc(best));
    }
}
