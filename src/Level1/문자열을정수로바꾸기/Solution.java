package Level1.문자열을정수로바꾸기;

import Utils.Tools;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Solution {

    public int solution(String s) {
        int answer;
        if(s.charAt(0)== '-')
            answer = -1*method(s.substring(1));
        else if(s.charAt(0)== '+')
            answer = method(s.substring(1));
        else
            answer = method(s);
        return answer;
    }
    public int method(String s) {
        int answer = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            answer = answer*10 + (ch-'0');
        }
        return answer;
    }

    public static void main(String[] args) {
        String best ="테스트 1 〉\t통과 (0.05ms, 52.5MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 55.5MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.7MB)\n" +
                "테스트 7 〉\t통과 (0.04ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (0.04ms, 52.4MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 51.8MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 51.7MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 52.8MB)\n" +
                "테스트 13 〉\t통과 (0.03ms, 52.8MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 55.7MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 52MB)";
        System.out.println(Tools.avgCalc(best));
        String normal = "테스트 1 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 51.9MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 7 〉\t통과 (0.04ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 52.6MB)\n" +
                "테스트 9 〉\t통과 (0.03ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 11 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 12 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 13 〉\t통과 (0.04ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.8MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 52.1MB)";
        System.out.println(Tools.avgCalc(normal));
        String worst ="테스트 1 〉\t통과 (0.04ms, 52.9MB)\n" +
                "테스트 2 〉\t통과 (0.04ms, 53.1MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 53MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 5 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (0.03ms, 53MB)\n" +
                "테스트 7 〉\t통과 (0.03ms, 51.6MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 53.1MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 11 〉\t통과 (0.04ms, 51.9MB)\n" +
                "테스트 12 〉\t통과 (0.04ms, 52.3MB)\n" +
                "테스트 13 〉\t통과 (0.03ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 53MB)\n" +
                "테스트 15 〉\t통과 (0.04ms, 53.2MB)";
        System.out.println(Tools.avgCalc(worst));
    }
}
