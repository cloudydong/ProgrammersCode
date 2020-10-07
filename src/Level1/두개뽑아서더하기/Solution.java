package Level1.두개뽑아서더하기;

import Utils.Tools;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i : s.solution(new int[]{2, 1, 3, 4, 1})) {
            System.out.println(i);
        }
        System.out.println(Arrays.equals(s.solution(new int[]{2, 1, 3, 4, 1}), new int[]{2, 3, 4, 5, 6, 7}));;
        String first = "테스트 1 〉\t통과 (11.61ms, 53.7MB)\n" +
                "테스트 2 〉\t통과 (8.81ms, 53.1MB)\n" +
                "테스트 3 〉\t통과 (6.90ms, 53.2MB)\n" +
                "테스트 4 〉\t통과 (7.34ms, 52MB)\n" +
                "테스트 5 〉\t통과 (8.01ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (15.41ms, 52.7MB)\n" +
                "테스트 7 〉\t통과 (20.60ms, 53MB)\n" +
                "테스트 8 〉\t통과 (13.16ms, 53.2MB)\n" +
                "테스트 9 〉\t통과 (10.76ms, 53MB)";
        System.out.println(Tools.avgCalc(first));
        String setTwo = "테스트 1 〉\t통과 (12.49ms, 53.2MB)\n" +
                "테스트 2 〉\t통과 (5.99ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (4.46ms, 52.8MB)\n" +
                "테스트 4 〉\t통과 (4.97ms, 52.3MB)\n" +
                "테스트 5 〉\t통과 (3.28ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (11.76ms, 55.6MB)\n" +
                "테스트 7 〉\t통과 (9.36ms, 53MB)\n" +
                "테스트 8 〉\t통과 (11.88ms, 52.3MB)\n" +
                "테스트 9 〉\t통과 (7.83ms, 52MB)";
        System.out.println(Tools.avgCalc(setTwo));
        String sec = "테스트 1 〉\t통과 (11.14ms, 53.2MB)\n" +
                "테스트 2 〉\t통과 (4.17ms, 51.9MB)\n" +
                "테스트 3 〉\t통과 (13.15ms, 53.1MB)\n" +
                "테스트 4 〉\t통과 (13.07ms, 52.7MB)\n" +
                "테스트 5 〉\t통과 (4.59ms, 52.8MB)\n" +
                "테스트 6 〉\t통과 (9.55ms, 53MB)\n" +
                "테스트 7 〉\t통과 (9.48ms, 52.5MB)\n" +
                "테스트 8 〉\t통과 (5.49ms, 53.5MB)\n" +
                "테스트 9 〉\t통과 (18.92ms, 52.7MB)";
        System.out.println(Tools.avgCalc(sec));
        String third = "테스트 1 〉\t통과 (3.85ms, 52.6MB)\n" +
                "테스트 2 〉\t통과 (4.80ms, 53MB)\n" +
                "테스트 3 〉\t통과 (4.66ms, 52.4MB)\n" +
                "테스트 4 〉\t통과 (5.85ms, 52.7MB)\n" +
                "테스트 5 〉\t통과 (3.94ms, 52.6MB)\n" +
                "테스트 6 〉\t통과 (3.54ms, 52.8MB)\n" +
                "테스트 7 〉\t통과 (18.23ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (4.41ms, 52.6MB)\n" +
                "테스트 9 〉\t통과 (8.57ms, 52.9MB)";
        System.out.println(Tools.avgCalc(third));
        String best = "테스트 1 〉\t통과 (5.84ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (6.89ms, 51.9MB)\n" +
                "테스트 3 〉\t통과 (5.51ms, 53MB)\n" +
                "테스트 4 〉\t통과 (4.01ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (2.54ms, 53.2MB)\n" +
                "테스트 6 〉\t통과 (9.05ms, 52.5MB)\n" +
                "테스트 7 〉\t통과 (15.40ms, 53.3MB)\n" +
                "테스트 8 〉\t통과 (3.87ms, 52.8MB)\n" +
                "테스트 9 〉\t통과 (6.83ms, 52.9MB)";
        System.out.println(Tools.avgCalc(best));
    }
}
