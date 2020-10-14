package Level1.연습문제2016년;

import Utils.Tools;

import java.util.Calendar;

public class Solution {
    public String solution(int a, int b) {
        String[] day = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] maxDays = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        int d = b-1;
        for (int i = 0; i < a-1; i++) {
            d += maxDays[i];
        }
        return day[d%7];
    }

    public static void main(String[] args) {
        new Solution().solution(1,6);
        String first = "테스트 1 〉\t통과 (0.03ms, 54.1MB)\n" +
                "테스트 2 〉\t통과 (0.04ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 4 〉\t통과 (0.08ms, 52.9MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 9 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 11 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 51.6MB)\n" +
                "테스트 13 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 14 〉\t통과 (0.02ms, 53MB)";
        System.out.println(Tools.avgCalc(first));
    }
}
