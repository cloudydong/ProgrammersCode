> 첫시도  


```
public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;
    Map<Integer, Boolean> map = new HashMap();
    for (int i = 0; i < reserve.length; i++) {
        map.put(reserve[i], true);
    }
    for (int i = 0; i < lost.length; i++) {
        if (map.getOrDefault(lost[i] - 1, false)) {
            map.remove(lost[i] - 1);
            answer++;
        } else if (map.getOrDefault(lost[i], false)) {
            map.remove(lost[i]);
            answer++;
        } else if (map.getOrDefault(lost[i] + 1, false)) {
            map.remove(lost[i] + 1);
            answer++;
        }
    }

    return answer;
}
```