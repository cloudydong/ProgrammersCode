package Level1.두정수의합;

import Utils.Tools;

public class Solution {
    public long solution(int a, int b) {
        return (long) (a+b)*(Math.abs(a-b)+1)/2;
    }

    public static void main(String[] args) {
        String ifAndElse = "테스트 1 〉\t통과 (0.02ms, 52.2MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 51.3MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 51.5MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 51.7MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 53.6MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 51.5MB)\n" +
                "테스트 13 〉\t통과 (0.01ms, 52.5MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 51.6MB)\n" +
                "테스트 16 〉\t통과 (0.02ms, 52.7MB)";
        System.out.println(Tools.avgCalc(ifAndElse));
        String ternary = "테스트 1 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 7 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 52.2MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 11 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 53MB)\n" +
                "테스트 13 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 14 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 16 〉\t통과 (0.03ms, 53.6MB)";
        System.out.println(Tools.avgCalc(ternary));
        String ShortCode = "테스트 1 〉\t통과 (0.04ms, 53MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 51.9MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 5 〉\t통과 (0.04ms, 52.8MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 7 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (0.04ms, 52MB)\n" +
                "테스트 9 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 11 〉\t통과 (0.03ms, 53.3MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 13 〉\t통과 (0.04ms, 52.8MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 15 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 16 〉\t통과 (0.04ms, 52.5MB)";
        System.out.println(Tools.avgCalc(ShortCode));
        
    }
}
