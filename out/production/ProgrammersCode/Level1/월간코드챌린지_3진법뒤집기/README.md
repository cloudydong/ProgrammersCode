> best  

wile문 한번
```
public int solution(int n) {
    int answer = 0;
    int pow = (int) Math.pow(3, (int) (Math.log(n) / Math.log(3)));
    while (n > 0) {
        answer += (n % 3) * pow;
        pow /= 3;
        n /= 3;
    }
    return answer;
}
```
>첫시도   

 6점 0.062 ms
```
public int solution(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    int answer = 0;
    while(n>0) {
        list.add(n%3);
        n = n/3;
    }
    int x =list.size() - 1;
    for (int i = 0; i < list.size(); i++) {
        answer += list.get(i)*Math.pow(3,x--);
    }
    return answer;
}   
```

가장 빠르게 pow, log 구현시  
0.024 ms 4점...
```
class Solution {
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
        for (int i = 0, denominator = 3; i < 10; ++i, denominator += 2) {
            x *= xx;
            result += x / denominator;
        }
        return  result + result + N;
    }
}
``` 
