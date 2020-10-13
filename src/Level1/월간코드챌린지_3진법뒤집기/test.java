package Level1.월간코드챌린지_3진법뒤집기;

public class test {
    private double E = 2.71828182845904523536;
    // base condition n > 0
    private double log(double n) {
        double result = 0;
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

    public static void main(String[] args) {
        System.out.println(new test().log(3.0));
    }

}
