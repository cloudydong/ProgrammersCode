> Best  

평균 6.42ms, Set 성질이용 Distinct(중복제거)  
다형성 이용하기위해 Set으로 선언시 평균 6.66ms
```
public int[] solution(int[] numbers) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < numbers.length; i++) {
        for (int j = i+1; j < numbers.length; j++) {
            set.add(numbers[i]+numbers[j]);
        }
    }
    return set.stream().sorted().mapToInt(x->x).toArray();
}
```

> 첫시도  
   
11.4 ms
```
public int[] solution(int[] numbers) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
            if(i!=j)
                arrayList.add(numbers[i]+numbers[j]);
        }
    }
    return arrayList.stream().distinct().sorted().mapToInt(x->x).toArray();
}
```