> 첫시도

0.029 ms 4점
```
public String solution(int a, int b) {
    String[] day = new String[]{"FRI","SAT","SUN","MON","TUE","WED","THU"};
    int[] maxDays = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
    int d = b-1;
    for (int i = 0; i < a-1; i++) {
        d += maxDays[i];
    }
    return day[d%7];
}
```