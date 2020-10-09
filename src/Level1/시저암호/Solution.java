package Level1.시저암호;

import Utils.Tools;

public class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // A-Z 65-90
            if (chars[i] > 64 && chars[i] < 91) {
                if ((char) (chars[i] + n) > 90)
                    chars[i] = (char) (chars[i] + n -26);
                else
                    chars[i] = (char) (chars[i] + n);
            // a-z 97-122
            } else if (chars[i] > 96 && chars[i] < 123) {
                if ((char) (chars[i] + n) > 122)
                    chars[i] = (char) (chars[i] + n -26);
                else
                    chars[i] = (char) (chars[i] + n);
            }
            // ' ' 32 nothing
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String first = "테스트 1 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 2 〉\t통과 (0.04ms, 52.5MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 51.8MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 7 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 54MB)\n" +
                "테스트 9 〉\t통과 (0.04ms, 52.5MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 11 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 13 〉\t통과 (0.89ms, 53MB)";
        System.out.println(Tools.avgCalc(first));
        String two = "테스트 1 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 51.6MB)\n" +
                "테스트 3 〉\t통과 (0.04ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 5 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 9 〉\t통과 (0.04ms, 52.2MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 53.3MB)\n" +
                "테스트 11 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 51.9MB)\n" +
                "테스트 13 〉\t통과 (0.82ms, 52.5MB)";
        System.out.println(Tools.avgCalc(two));

        String other = "테스트 1 〉\t통과 (13.54ms, 53.3MB)\n" +
                "테스트 2 〉\t통과 (24.02ms, 53.5MB)\n" +
                "테스트 3 〉\t통과 (13.63ms, 53.3MB)\n" +
                "테스트 4 〉\t통과 (17.59ms, 54.2MB)\n" +
                "테스트 5 〉\t통과 (22.63ms, 53.3MB)\n" +
                "테스트 6 〉\t통과 (13.55ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (18.02ms, 52.8MB)\n" +
                "테스트 8 〉\t통과 (14.42ms, 53.4MB)\n" +
                "테스트 9 〉\t통과 (15.27ms, 52.8MB)\n" +
                "테스트 10 〉\t통과 (14.05ms, 53.4MB)\n" +
                "테스트 11 〉\t통과 (13.12ms, 53.2MB)\n" +
                "테스트 12 〉\t통과 (14.28ms, 53.4MB)\n" +
                "테스트 13 〉\t통과 (43.63ms, 71.1MB)";
        System.out.println(Tools.avgCalc(other));
    }
}
