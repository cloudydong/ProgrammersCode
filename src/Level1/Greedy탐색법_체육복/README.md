> Best  
  
최선  0.065ms
```
public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;
    Map<Integer, Boolean> map = new HashMap<>();
    for (int i = 0; i < reserve.length; i++) {
        map.put(reserve[i], true);
    }
    for (int i = 0; i < lost.length; i++) {
        if (map.getOrDefault(lost[i], false)) {
            map.remove(lost[i]);
            lost[i] = -99;
            answer++;
        }
    }
    for (int i = 0; i < lost.length; i++) {
        if (map.getOrDefault(lost[i] - 1, false)) {
            map.remove(lost[i] -1);
            answer++;
        } else if (map.getOrDefault(lost[i] + 1, false)) {
            map.remove(lost[i] + 1);
            answer++;
        }
    }
    return answer;
}
```
> 첫시도   

12점??? 0.090ms
```
public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;
    Map<Integer, Boolean> map = new HashMap<>();
    Arrays.sort(lost);
    Arrays.sort(reserve);
    for (int i = 0; i < reserve.length; i++) {
        map.put(reserve[i], true);
    }
    for (int i = 0; i < lost.length; i++) {
        if (map.getOrDefault(lost[i], false)) {
            map.remove(lost[i]);
            lost[i] = -1;
            answer++;
        }
    }
    for (int i = 0; i < lost.length; i++) {
        if (map.getOrDefault(lost[i] - 1, false)) {
            map.remove(lost[i] -1);
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
> 다름사람 풀이 응용 HashSet 사용

0.071 ms  
```
public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < reserve.length; i++) {
        set.add(reserve[i]);
    }
    for (int i = 0; i < lost.length; i++) {
        if (set.contains(lost[i])) {
            set.remove(lost[i]);
            lost[i] = -99;
            answer++;
        }
    }
    for (int i = 0; i < lost.length; i++) {
        if (set.contains(lost[i] - 1)) {
            set.remove(lost[i] -1);
            answer++;
        } else if (set.contains(lost[i] + 1)) {
            set.remove(lost[i] + 1);
            answer++;
        }
    }
    return answer;
}
```