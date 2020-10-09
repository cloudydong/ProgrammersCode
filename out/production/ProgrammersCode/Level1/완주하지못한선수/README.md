> 첫시도 best?  

23.502 ms  
for문 한번으로 가능할거 같아서 시도함
```
public String solution(String[] participant, String[] completion) {
    HashMap<Integer, String> map = new HashMap<>();
    int TOTAL_LENGTH = participant.length;
    int sum = 0;
    for (int i = 0; i < TOTAL_LENGTH-1; i++) {
        int hash = participant[i].hashCode();
        sum += hash;
        sum -= completion[i].hashCode();
        map.put(hash, participant[i]);
    }
    int hash = participant[TOTAL_LENGTH-1].hashCode();
    sum += hash;
    map.put(hash, participant[TOTAL_LENGTH-1]);
    return map.get(sum);
}
```

> 다른사람풀이  

hashMap 가지고 있는 메소드를 공부할 필요가 있다(ex compute)    
31.975 ms 
```
public static String solution(String[] participant, String[] completion) {
    HashMap map = new HashMap<>();
    for (int i = 0; i < participant.length; i++) {
        map.compute(participant[i], (k, v) -> v != null ? null : 1);
        if (i < completion.length) map.compute(completion[i], (k, v) -> v != null ? null : 1);
    }
    return map.keySet().iterator().next().toString();
}
```
38.424 ms 
```
public String solution(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
    for (String player : completion) hm.put(player, hm.get(player) - 1);

    for (String key : hm.keySet()) {
        if (hm.get(key) != 0){
            answer = key;
        }
    }
    return answer;
}
```
128.46 ms 
```
public String solution(String[] participant, String[] completion) {
    Arrays.sort(participant);
    Arrays.sort(completion);
    for(int i=0; i<completion.length; i++){
        if(!participant[i].equals(completion[i])) {
            return participant[i];
        }
    }
    return participant[participant.length-1];
}
```