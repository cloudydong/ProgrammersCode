> best  

직접 병합정렬을 만들어서 문자열 정렬뒤 합치는게 가장 빨랐다.  
자바에선 
Comparator.reverseOrder()나    
Arrays.sort(arr, Collections.reverseOrder())  
를 이용해야하는데 char와 같은 기본 자료형은 불가능하다.
Character로 boxed하는것과
new StringBuilder(new String(arr)).reverse()을 이용하는게 최선이다.  
(물론 느리다.) 

0.105 ms  
```
public String solution(String str){
    char[] arr = str.toCharArray();
    char[] tmp = new char[str.length()];
    mergeReverseSort(arr, 0, arr.length-1, tmp);
    return new String(arr);
}
private void mergeReverseSort(char A[], int low, int high, char B[]){
    // 1. base condition
    if(low >= high) return;
    // 2. divide
    int mid = (low + high) / 2;
    // 3. conquer
    mergeReverseSort(A, low, mid, B);
    mergeReverseSort(A, mid+1, high, B);
    // 4. combine
    int i=low, j=mid+1, k=low;
    for(;k<=high;++k){
        if(j > high) B[k] = A[i++];
        else if(i > mid) B[k] = A[j++];
        else if(A[i] > A[j]) B[k] = A[i++];
        else B[k] = A[j++];
    }
    // 5. copy
    for(i=low;i<=high;++i) A[i] = B[i];
}
```

>nomarl  
  
0.605 ms
```
public String solution(String str){
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new StringBuilder(new String(arr)).reverse().toString();
}
```
6.91625 ms
```
public String solution(String str){
    return str.chars()
            .mapToObj(i ->String.valueOf((char) i))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
}
```
> worst  

3점 8.824 ms
```
public String solution(String s) {
    String answer = "";
    List<String> list = new ArrayList<>();
    for (int i = 0; i< s.length(); i++) {
        list.add(s.substring(i,i+1));
    }
    return list.stream().sorted(Comparator.reverseOrder()).reduce((x, y) -> x + y).orElse("");
}
```
