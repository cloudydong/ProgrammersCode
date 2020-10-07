>best  

```
public int[] solution(int []arr) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    int pre = -1;
    for (int i : arr) {
        if (pre!=i)
            arrayList.add(i);
        pre = i;
    }
    return arrayList.stream().mapToInt(x->x).toArray();
}
```

> worst  
  
```
public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(arr.length>0) {
            arrayList.add(arr[0]);
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]) {
                arrayList.add(arr[i+1]);
            }
        }
        return arrayList.stream().mapToInt(x->x).toArray();
    }
```
