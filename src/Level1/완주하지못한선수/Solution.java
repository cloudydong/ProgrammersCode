package Level1.완주하지못한선수;

import Utils.Tools;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<Integer, String> map = new HashMap<>();
        int INDEX_LIMIT = participant.length-1;
        int sum = 0;
        for (int i = 0; i < INDEX_LIMIT; i++) {
            int hash = participant[i].hashCode();
            sum += hash;
            sum -= completion[i].hashCode();
            map.put(hash, participant[i]);
        }
        int hash = participant[INDEX_LIMIT].hashCode();
        sum += hash;
        map.put(hash, participant[INDEX_LIMIT]);
        return map.get(sum);
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        char[] chars = s1.toCharArray();
        Long a = 0L;
        for (int i = 0; i < chars.length; i++) {
            long c = (long) (chars[i] * Math.pow(1000, i));
            a += c;
            System.out.println(a);
            System.out.println(c);
        }
        System.out.println((int) 'a');
        System.out.println((int) 'b');
        System.out.println((int) 'c');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');

        String hashf = "테스트 1 〉\t통과 (0.05ms, 52.9MB)\n" +
                "테스트 2 〉\t통과 (0.06ms, 53.4MB)\n" +
                "테스트 3 〉\t통과 (0.46ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (0.89ms, 54.2MB)\n" +
                "테스트 5 〉\t통과 (0.83ms, 53.3MB)\n" +
                "테스트 1 〉\t통과 (24.31ms, 85.2MB)\n" +
                "테스트 2 〉\t통과 (33.37ms, 88.6MB)\n" +
                "테스트 3 〉\t통과 (65.35ms, 94.8MB)\n" +
                "테스트 4 〉\t통과 (50.62ms, 95.5MB)\n" +
                "테스트 5 〉\t통과 (59.08ms, 96.1MB)";
        System.out.println(Tools.avgCalc(hashf));
        String hasht = "테스트 1 〉\t통과 (0.69ms, 52.6MB)\n" +
                "테스트 2 〉\t통과 (0.62ms, 52MB)\n" +
                "테스트 3 〉\t통과 (1.89ms, 53.5MB)\n" +
                "테스트 4 〉\t통과 (3.02ms, 52.5MB)\n" +
                "테스트 5 〉\t통과 (2.95ms, 53.3MB)\n" +
                "테스트 1 〉\t통과 (36.78ms, 81.4MB)\n" +
                "테스트 2 〉\t통과 (60.27ms, 89.1MB)\n" +
                "테스트 3 〉\t통과 (67.02ms, 95.3MB)\n" +
                "테스트 4 〉\t통과 (67.86ms, 95MB)\n" +
                "테스트 5 〉\t통과 (78.65ms, 95.6MB)";
        System.out.println(Tools.avgCalc(hasht));
        String other = "테스트 1 〉\t통과 (0.05ms, 52.9MB)\n" +
                "테스트 2 〉\t통과 (0.06ms, 52.3MB)\n" +
                "테스트 3 〉\t통과 (0.77ms, 52.9MB)\n" +
                "테스트 4 〉\t통과 (4.90ms, 53.8MB)\n" +
                "테스트 5 〉\t통과 (1.19ms, 53.4MB)\n" +
                "테스트 1 〉\t통과 (49.72ms, 81.4MB)\n" +
                "테스트 2 〉\t통과 (67.87ms, 89.4MB)\n" +
                "테스트 3 〉\t통과 (78.17ms, 94MB)\n" +
                "테스트 4 〉\t통과 (97.86ms, 95.7MB)\n" +
                "테스트 5 〉\t통과 (83.65ms, 95.5MB)";
        System.out.println(Tools.avgCalc(other));
        String other2 = "테스트 1 〉\t통과 (0.25ms, 52.3MB)\n" +
                "테스트 2 〉\t통과 (0.31ms, 52.1MB)\n" +
                "테스트 3 〉\t통과 (2.66ms, 53.6MB)\n" +
                "테스트 4 〉\t통과 (4.97ms, 54.4MB)\n" +
                "테스트 5 〉\t통과 (8.32ms, 53.2MB)\n" +
                "테스트 1 〉\t통과 (139.67ms, 83.5MB)\n" +
                "테스트 2 〉\t통과 (237.79ms, 90.5MB)\n" +
                "테스트 3 〉\t통과 (291.10ms, 95.1MB)\n" +
                "테스트 4 〉\t통과 (308.38ms, 94.5MB)\n" +
                "테스트 5 〉\t통과 (291.23ms, 95.6MB)";
        System.out.println(Tools.avgCalc(other2));
    }

}
