package Level1.문자열다루기기본;

import Utils.Tools;

public class Solution {
    public boolean solution(String s) {
        if(s.length()!=4 && s.length()!=6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<48 || s.charAt(i)>57) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "테스트 1 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 51.7MB)\n" +
                "테스트 5 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 9 〉\t통과 (0.01ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 53.8MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 15 〉\t통과 (0.03ms, 52.8MB)\n" +
                "테스트 16 〉\t통과 (0.02ms, 52.7MB)";
        System.out.println(Tools.avgCalc(first));

        String test = "테스트 1 〉\t통과 (0.11ms, 51.9MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 3 〉\t통과 (0.11ms, 51.7MB)\n" +
                "테스트 4 〉\t통과 (0.12ms, 52.3MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 8 〉\t통과 (0.11ms, 52.4MB)\n" +
                "테스트 9 〉\t통과 (0.12ms, 52MB)\n" +
                "테스트 10 〉\t통과 (0.10ms, 53.1MB)\n" +
                "테스트 11 〉\t통과 (0.09ms, 52.5MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 53.1MB)\n" +
                "테스트 14 〉\t통과 (0.09ms, 52.3MB)\n" +
                "테스트 15 〉\t통과 (0.11ms, 53.4MB)\n" +
                "테스트 16 〉\t통과 (0.10ms, 53.1MB)";
        System.out.println(Tools.avgCalc(test));

        String a = "테스트 1 〉\t통과 (0.14ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (0.14ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (0.14ms, 51.8MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52MB)\n" +
                "테스트 8 〉\t통과 (0.15ms, 52.9MB)\n" +
                "테스트 9 〉\t통과 (0.17ms, 51.9MB)\n" +
                "테스트 10 〉\t통과 (0.16ms, 54.2MB)\n" +
                "테스트 11 〉\t통과 (0.17ms, 51.9MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (0.17ms, 53.1MB)\n" +
                "테스트 15 〉\t통과 (0.17ms, 52.9MB)\n" +
                "테스트 16 〉\t통과 (0.17ms, 52.6MB)";
        System.out.println(Tools.avgCalc(a));
    }
}
