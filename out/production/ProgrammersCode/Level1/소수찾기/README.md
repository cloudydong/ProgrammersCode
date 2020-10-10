> 첫시도  

에라토스테네스의 체  true false 를 뒤집으면 아주 약간 빨라진다.  
시간복잡도 N(sqrt(N)+1)
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