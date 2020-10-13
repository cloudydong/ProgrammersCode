package Level1.월간코드챌린지_3진법뒤집기;

import Utils.Tools;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int digit = (int) (log(n) / log(3.0));
        int pow = pow(3, digit);
        while (n > 0) {
            answer += (n % 3) * pow;
            pow /= 3;
            n /= 3;
        }
        return answer;
    }

    private int pow(int n, int digit) {
        int pow = 1;
        for (int i = 0; i < digit; i++) {
            pow *= n;
        }
        return pow;
    }

    // base condition n > 0
    private double log(double n) {
        double E = 2.71828182845904523536;
        double result = 0.0;
        int N = 0;
        while (n >= 2) {
            ++N;
            n /= E;
        }
        double x = (n - 1) / (n + 1);
        double xx = x * x;
        result = x;
        for (int i = 0, denominator = 3; i < 5; ++i, denominator += 2) {
            x *= xx;
            result += x / denominator;
        }
        return  result + result + N;
    }

    public static int test(int n) {
        return (int) (Math.log(n) / Math.log(3));
    }

    public static void main(String[] args) {

        String first = "테스트 1 〉\t통과 (0.05ms, 52.2MB)\n" +
                "테스트 2 〉\t통과 (0.08ms, 52.7MB)\n" +
                "테스트 3 〉\t통과 (0.05ms, 52.7MB)\n" +
                "테스트 4 〉\t통과 (0.05ms, 52MB)\n" +
                "테스트 5 〉\t통과 (0.06ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (0.06ms, 51.7MB)\n" +
                "테스트 7 〉\t통과 (0.06ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (0.07ms, 52.4MB)\n" +
                "테스트 9 〉\t통과 (0.07ms, 53.4MB)\n" +
                "테스트 10 〉\t통과 (0.07ms, 51.7MB)";
        System.out.println(Tools.avgCalc(first));

        String best = "테스트 1 〉\t통과 (0.02ms, 51.7MB)\n" +
                "테스트 2 〉\t통과 (0.04ms, 52.4MB)\n" +
                "테스트 3 〉\t통과 (0.02ms, 52.4MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 5 〉\t통과 (0.02ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (0.03ms, 52.6MB)\n" +
                "테스트 8 〉\t통과 (0.02ms, 52.3MB)\n" +
                "테스트 9 〉\t통과 (0.02ms, 51.8MB)\n" +
                "테스트 10 〉\t통과 (0.03ms, 52.6MB)";
        System.out.println(Tools.avgCalc(best));


    }
}
