> 첫시도  

java 에 있는 Arrays.copyOfRange을 사용했다.  
7.871 ms
```
public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int i = 0; i < commands.length; i++) {
        int start = commands[i][0];
        int end = commands[i][1];
        int few = commands[i][2];
        int pick = Arrays
                .stream(Arrays.copyOfRange(array, start - 1, end))
                .sorted()
                .toArray()[few-1];
        answer[i] = pick;
    }
    return answer;
}
```

> 구현

직접 array를 만들고 병합정렬을 직접 구현했다. 시간 차이는 압도적이다.   
0.0257 ms
```
public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int i = 0; i < commands.length; i++) {
        int start = commands[i][0];
        int end = commands[i][1];
        int few = commands[i][2];
        int[] arr = new int[end - start + 1];
        for (int j = start - 1; j < end; j++) {
            arr[j - start + 1] = array[j];
        }
        mergeSort(arr, 0, arr.length, new int[arr.length]);
        answer[i] = arr[few - 1];
    }
    return answer;
    
}
private void mergeSort(int A[], int low, int high, int B[]){
    // 1. base condition
    if(low >= high) return;
    // 2. divide
    int mid = (low + high) / 2;
    // 3. conquer
    mergeSort(A, low, mid, B);
    mergeSort(A, mid+1, high, B);
    // 4. combine
    int i=low, j=mid+1, k=low;
    for(;k<=high;++k){
        if(j > high) B[k] = A[i++];
        else if(i > mid) B[k] = A[j++];
        else if(A[i] < A[j]) B[k] = A[i++];
        else B[k] = A[j++];
    }
    // 5. copy
    for(i=low;i<=high;++i) A[i] = B[i];
}
```