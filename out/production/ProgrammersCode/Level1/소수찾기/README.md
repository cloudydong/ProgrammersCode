> 첫시도  

에라토스테네스의 체  
10점 11.294375ms  
```
public int solution(int n) {
    int cnt = 0;
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    for (int i = 2; i <= Math.sqrt(n); i++) {
        for (int j = i * 2; j <= n; j += i) {
            isPrime[j - 1] = false;
        }
    }
    for (int i = 2; i <= n; i++) {
        if (isPrime[i - 1]) {
            cnt++;
        }
    }
    return cnt;
}
```