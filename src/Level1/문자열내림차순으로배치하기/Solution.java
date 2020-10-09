package Level1.문자열내림차순으로배치하기;

import Utils.Tools;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
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
            else if(A[i] < A[j]) B[k] = A[i++];
            else B[k] = A[j++];
        }
        // 5. copy
        for(i=low;i<=high;++i) A[i] = B[i];
    }
    public static void main(String[] args) {
        String worst = "테스트 1 〉\t통과 (7.10ms, 54.2MB)\n" +
                "테스트 2 〉\t통과 (9.23ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (5.83ms, 51.9MB)\n" +
                "테스트 4 〉\t통과 (4.96ms, 53.7MB)\n" +
                "테스트 5 〉\t통과 (8.03ms, 53.1MB)\n" +
                "테스트 6 〉\t통과 (8.72ms, 53.1MB)\n" +
                "테스트 7 〉\t통과 (6.99ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (5.98ms, 54.1MB)\n" +
                "테스트 9 〉\t통과 (5.17ms, 52.7MB)\n" +
                "테스트 10 〉\t통과 (5.69ms, 52.9MB)\n" +
                "테스트 11 〉\t통과 (10.33ms, 53.6MB)\n" +
                "테스트 12 〉\t통과 (13.23ms, 52.4MB)\n" +
                "테스트 13 〉\t통과 (4.81ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (4.57ms, 52.3MB)\n" +
                "테스트 15 〉\t통과 (2.69ms, 53.2MB)\n" +
                "테스트 16 〉\t통과 (2.75ms, 52.2MB)";
        System.out.println(Tools.avgCalc(worst));
        String test = "테스트 1 〉\t통과 (0.55ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (0.52ms, 54.5MB)\n" +
                "테스트 3 〉\t통과 (0.56ms, 52.5MB)\n" +
                "테스트 4 〉\t통과 (0.47ms, 52.9MB)\n" +
                "테스트 5 〉\t통과 (0.69ms, 52.4MB)\n" +
                "테스트 6 〉\t통과 (0.62ms, 51.8MB)\n" +
                "테스트 7 〉\t통과 (0.51ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (0.54ms, 52.8MB)\n" +
                "테스트 9 〉\t통과 (1.72ms, 53.1MB)\n" +
                "테스트 10 〉\t통과 (0.55ms, 53.1MB)\n" +
                "테스트 11 〉\t통과 (0.49ms, 52.2MB)\n" +
                "테스트 12 〉\t통과 (0.40ms, 52.9MB)\n" +
                "테스트 13 〉\t통과 (0.55ms, 53.4MB)\n" +
                "테스트 14 〉\t통과 (0.52ms, 53.4MB)\n" +
                "테스트 15 〉\t통과 (0.49ms, 52.8MB)\n" +
                "테스트 16 〉\t통과 (0.50ms, 52.9MB)";
        System.out.println(Tools.avgCalc(test));
        String customMergeSort = "테스트 1 〉\t통과 (0.06ms, 52.7MB)\n" +
                "테스트 2 〉\t통과 (0.05ms, 51.7MB)\n" +
                "테스트 3 〉\t통과 (0.05ms, 51.9MB)\n" +
                "테스트 4 〉\t통과 (0.07ms, 52.5MB)\n" +
                "테스트 5 〉\t통과 (0.50ms, 51.8MB)\n" +
                "테스트 6 〉\t통과 (0.26ms, 52.4MB)\n" +
                "테스트 7 〉\t통과 (0.07ms, 53MB)\n" +
                "테스트 8 〉\t통과 (0.09ms, 52.5MB)\n" +
                "테스트 9 〉\t통과 (0.10ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (0.13ms, 52MB)\n" +
                "테스트 11 〉\t통과 (0.06ms, 51.9MB)\n" +
                "테스트 12 〉\t통과 (0.07ms, 52.3MB)\n" +
                "테스트 13 〉\t통과 (0.07ms, 52.2MB)\n" +
                "테스트 14 〉\t통과 (0.05ms, 51.4MB)\n" +
                "테스트 15 〉\t통과 (0.03ms, 52.6MB)\n" +
                "테스트 16 〉\t통과 (0.03ms, 52.2MB)";
        System.out.println(Tools.avgCalc(customMergeSort));
        String java8 = "테스트 1 〉\t통과 (10.75ms, 52.1MB)\n" +
                "테스트 2 〉\t통과 (5.35ms, 52.3MB)\n" +
                "테스트 3 〉\t통과 (4.80ms, 53.4MB)\n" +
                "테스트 4 〉\t통과 (5.65ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (8.22ms, 52.2MB)\n" +
                "테스트 6 〉\t통과 (6.17ms, 52.8MB)\n" +
                "테스트 7 〉\t통과 (4.79ms, 53.9MB)\n" +
                "테스트 8 〉\t통과 (14.66ms, 52MB)\n" +
                "테스트 9 〉\t통과 (14.20ms, 52.5MB)\n" +
                "테스트 10 〉\t통과 (6.47ms, 53.1MB)\n" +
                "테스트 11 〉\t통과 (4.84ms, 52.1MB)\n" +
                "테스트 12 〉\t통과 (5.21ms, 53MB)\n" +
                "테스트 13 〉\t통과 (4.45ms, 51.9MB)\n" +
                "테스트 14 〉\t통과 (6.06ms, 52.8MB)\n" +
                "테스트 15 〉\t통과 (4.56ms, 52.9MB)\n" +
                "테스트 16 〉\t통과 (4.48ms, 52.6MB)";
        System.out.println(Tools.avgCalc(java8));
    }
}
