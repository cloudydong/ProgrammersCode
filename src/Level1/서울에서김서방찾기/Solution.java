package Level1.서울에서김서방찾기;

import Utils.Tools;

public class Solution {
    public String solution(String[] seoul) {
        int cnt = 0;
        for (String s : seoul) {
            if (s.equals("Kim"))
                break;
            cnt++;
        }
        return "김서방은 "+cnt+"에 있다";
    }

    public static void main(String[] args) {
        String first = "테스트 1 〉\t통과 (7.52ms, 51.6MB)\n" +
                "테스트 2 〉\t통과 (11.65ms, 54.2MB)\n" +
                "테스트 3 〉\t통과 (7.52ms, 54.1MB)\n" +
                "테스트 4 〉\t통과 (7.92ms, 52.5MB)\n" +
                "테스트 5 〉\t통과 (8.17ms, 53.3MB)\n" +
                "테스트 6 〉\t통과 (7.40ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (8.55ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (8.03ms, 52.4MB)\n" +
                "테스트 9 〉\t통과 (7.72ms, 54.4MB)\n" +
                "테스트 10 〉\t통과 (8.01ms, 53.4MB)\n" +
                "테스트 11 〉\t통과 (12.60ms, 52.8MB)\n" +
                "테스트 12 〉\t통과 (8.13ms, 53.3MB)\n" +
                "테스트 13 〉\t통과 (8.66ms, 54.5MB)\n" +
                "테스트 14 〉\t통과 (11.66ms, 52.6MB)";
        System.out.println(Tools.avgCalc(first));
    }
}
