package Level1.최대공약수와최소공배수;

import Utils.Tools;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        return new int[]{gcd, n * m / gcd};
    }
    public int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n;
            m = temp % m;
        }
        return n;
    }

    public static void main(String[] args) {
        String call = "테스트 1 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 4 〉\t통과 (0.03ms, 53.4MB)\n" +
                "테스트 5 〉\t통과 (0.01ms, 52MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 51.7MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 52.2MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 52.9MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 52.5MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 52.7MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.1MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 16 〉\t통과 (0.02ms, 51.8MB)";
        System.out.println(Tools.avgCalc(call));
        String whi = "테스트 1 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 2 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 4 〉\t통과 (0.01ms, 52.9MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 6 〉\t통과 (0.01ms, 52.4MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 8 〉\t통과 (0.03ms, 51.8MB)\n" +
                "테스트 9 〉\t통과 (0.03ms, 52.6MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 53.9MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 54.2MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 53.2MB)\n" +
                "테스트 14 〉\t통과 (0.03ms, 52.5MB)\n" +
                "테스트 15 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 16 〉\t통과 (0.02ms, 51.7MB)";
        System.out.println(Tools.avgCalc(whi));
        String tes = "테스트 1 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 53.8MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 53MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 53.3MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.02ms, 52.6MB)\n" +
                "테스트 11 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 12 〉\t통과 (0.02ms, 51.6MB)\n" +
                "테스트 13 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 14 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 15 〉\t통과 (0.03ms, 52.3MB)\n" +
                "테스트 16 〉\t통과 (0.04ms, 52.7MB)";
        System.out.println(Tools.avgCalc(tes));
    }
}
