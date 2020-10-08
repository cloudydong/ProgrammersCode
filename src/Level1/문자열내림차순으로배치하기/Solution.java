package Level1.문자열내림차순으로배치하기;

import Utils.Tools;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public String solution(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String worst = "테스트 1 〉\t통과 (7.10ms, 54.2MB)\n" +
                "테스트 2 〉\t통과 (9.23ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (5.83ms, 51.9MB)\n" +
                "테스트 4 〉\t통과 (4.96ms, 53.7MB)\n" +
                "테스트 5 〉\t통과 (8.03ms, 53.1MB)\n" +
                "테스트 6 〉\t통과 (8.72ms, 53.1MB)\n" +
                "테스트 7 〉\t통과 (6.99ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (5.98ms, 54.1MB)\n" +
                "테스트 9 〉\t통과 (5.17ms, 52.7MB)\n" +
                "테스트 10 〉\t통과 (5.69ms, 52.9MB)\n" +
                "테스트 11 〉\t통과 (10.33ms, 53.6MB)\n" +
                "테스트 12 〉\t통과 (13.23ms, 52.4MB)\n" +
                "테스트 13 〉\t통과 (4.81ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (4.57ms, 52.3MB)\n" +
                "테스트 15 〉\t통과 (2.69ms, 53.2MB)\n" +
                "테스트 16 〉\t통과 (2.75ms, 52.2MB)";
        System.out.println(Tools.avgCalc(worst));
        String test = "테스트 1 〉\t통과 (0.51ms, 51.8MB)\n" +
                "테스트 2 〉\t통과 (0.49ms, 52.8MB)\n" +
                "테스트 3 〉\t통과 (0.49ms, 52.3MB)\n" +
                "테스트 4 〉\t통과 (0.49ms, 52.3MB)\n" +
                "테스트 5 〉\t통과 (0.64ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (0.58ms, 53MB)\n" +
                "테스트 7 〉\t통과 (0.48ms, 53.6MB)\n" +
                "테스트 8 〉\t통과 (0.54ms, 52.3MB)\n" +
                "테스트 9 〉\t통과 (0.54ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (0.54ms, 52.5MB)\n" +
                "테스트 11 〉\t통과 (0.49ms, 53.1MB)\n" +
                "테스트 12 〉\t통과 (0.57ms, 52.2MB)\n" +
                "테스트 13 〉\t통과 (0.74ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (1.84ms, 52.4MB)\n" +
                "테스트 15 〉\t통과 (1.11ms, 52.1MB)\n" +
                "테스트 16 〉\t통과 (1.85ms, 52MB)";
        System.out.println(Tools.avgCalc(test));
        String test2 = "테스트 1 〉\t통과 (2.38ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (4.49ms, 52.4MB)\n" +
                "테스트 3 〉\t통과 (6.18ms, 52.6MB)\n" +
                "테스트 4 〉\t통과 (3.57ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (6.09ms, 53.4MB)\n" +
                "테스트 6 〉\t통과 (4.53ms, 52.5MB)\n" +
                "테스트 7 〉\t통과 (4.11ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (3.06ms, 52.1MB)\n" +
                "테스트 9 〉\t통과 (3.01ms, 51.9MB)\n" +
                "테스트 10 〉\t통과 (2.90ms, 52MB)\n" +
                "테스트 11 〉\t통과 (6.74ms, 52.8MB)\n" +
                "테스트 12 〉\t통과 (2.54ms, 52.2MB)\n" +
                "테스트 13 〉\t통과 (2.77ms, 52.2MB)\n" +
                "테스트 14 〉\t통과 (5.95ms, 53.4MB)\n" +
                "테스트 15 〉\t통과 (2.59ms, 52.9MB)\n" +
                "테스트 16 〉\t통과 (2.17ms, 52.1MB)";
        System.out.println(Tools.avgCalc(test2));
    }
}
