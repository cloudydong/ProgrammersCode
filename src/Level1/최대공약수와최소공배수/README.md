>best  

반복문 방법  
0.020625 ms  
```
public int[] solution(int n, int m) {
    int gcd = gcd(n,m);
    int[] answer = {gcd, n*m/gcd};
    return answer;
}
public int gcd(int n, int m) {
    while (m != 0) {
        int temp = n;
        n = m;
        m = temp % m;
    }
    return n;
}
```
재귀 방법  
0.0225 ms  
```
public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        int[] answer = {gcd, n*m/gcd};
        return answer;
    }
    public int gcd(int n, int m) {
        if(m==0)
            return n;
        else
            return gcd(m, n%m);
    }
```

```
public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lcm(n,m)};
        return answer;
    }
    public int gcd(int n, int m) {
        if (m == 0) { return n; }
        return gcd(m, n % m);
    }
    public int lcm(int n, int m) {
        return n*m/gcd(n,m);
    }
```