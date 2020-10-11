package Level1.정렬_K번째수;

import Utils.Tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
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
            mergeSort(arr, 0, arr.length-1, new int[arr.length]);
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


    public static void main(String[] args) {
        String directImplementation = "테스트 1 〉\t통과 (0.02ms, 53.7MB)\n" +
                "테스트 2 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 3 〉\t통과 (0.04ms, 54MB)\n" +
                "테스트 4 〉\t통과 (0.02ms, 51.9MB)\n" +
                "테스트 5 〉\t통과 (0.03ms, 52MB)\n" +
                "테스트 6 〉\t통과 (0.02ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (0.02ms, 51.7MB)";
        System.out.println(Tools.avgCalc(directImplementation));
        String useJavaApi = "테스트 1 〉\t통과 (4.96ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (7.76ms, 53.1MB)\n" +
                "테스트 3 〉\t통과 (11.31ms, 52.1MB)\n" +
                "테스트 4 〉\t통과 (12.59ms, 53.2MB)\n" +
                "테스트 5 〉\t통과 (6.50ms, 52.9MB)\n" +
                "테스트 6 〉\t통과 (7.51ms, 53.1MB)\n" +
                "테스트 7 〉\t통과 (4.47ms, 51.8MB)";
        System.out.println(Tools.avgCalc(useJavaApi));
    }
}
