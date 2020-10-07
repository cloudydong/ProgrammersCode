package Level1.같은숫자는싫어;

import Utils.Tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
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

    public static void main(String[] args) {
        String worst = "테스트 1 〉\t통과 (3.43ms, 53.1MB)\n" +
                "테스트 2 〉\t통과 (7.20ms, 52.1MB)\n" +
                "테스트 3 〉\t통과 (6.92ms, 52.1MB)\n" +
                "테스트 4 〉\t통과 (4.95ms, 52.1MB)\n" +
                "테스트 5 〉\t통과 (3.48ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (7.25ms, 53.5MB)\n" +
                "테스트 7 〉\t통과 (4.83ms, 51.8MB)\n" +
                "테스트 8 〉\t통과 (3.00ms, 51.8MB)\n" +
                "테스트 9 〉\t통과 (2.68ms, 52.7MB)\n" +
                "테스트 10 〉\t통과 (6.36ms, 52.3MB)\n" +
                "테스트 11 〉\t통과 (7.77ms, 54MB)\n" +
                "테스트 12 〉\t통과 (3.71ms, 52.2MB)\n" +
                "테스트 13 〉\t통과 (10.64ms, 53.3MB)\n" +
                "테스트 14 〉\t통과 (2.60ms, 52.1MB)\n" +
                "테스트 15 〉\t통과 (2.26ms, 53.2MB)\n" +
                "테스트 16 〉\t통과 (10.35ms, 52.1MB)\n" +
                "테스트 17 〉\t통과 (4.47ms, 52.1MB)\n" +
                "테스트 1 〉\t통과 (35.15ms, 124MB)\n" +
                "테스트 2 〉\t통과 (32.09ms, 125MB)\n" +
                "테스트 3 〉\t통과 (36.07ms, 128MB)\n" +
                "테스트 4 〉\t통과 (39.37ms, 127MB)";
        System.out.println(Tools.avgCalc(worst));
        String best = "테스트 1 〉\t통과 (2.94ms, 52.2MB)\n" +
                "테스트 2 〉\t통과 (3.99ms, 53.3MB)\n" +
                "테스트 3 〉\t통과 (3.80ms, 52.7MB)\n" +
                "테스트 4 〉\t통과 (2.29ms, 52.6MB)\n" +
                "테스트 5 〉\t통과 (2.55ms, 53.1MB)\n" +
                "테스트 6 〉\t통과 (2.60ms, 52.6MB)\n" +
                "테스트 7 〉\t통과 (2.55ms, 52.4MB)\n" +
                "테스트 8 〉\t통과 (6.31ms, 52.5MB)\n" +
                "테스트 9 〉\t통과 (3.17ms, 52.7MB)\n" +
                "테스트 10 〉\t통과 (3.55ms, 53MB)\n" +
                "테스트 11 〉\t통과 (3.29ms, 52.6MB)\n" +
                "테스트 12 〉\t통과 (9.42ms, 53.4MB)\n" +
                "테스트 13 〉\t통과 (3.43ms, 53.2MB)\n" +
                "테스트 14 〉\t통과 (3.60ms, 53.2MB)\n" +
                "테스트 15 〉\t통과 (2.61ms, 53.2MB)\n" +
                "테스트 16 〉\t통과 (5.96ms, 52.3MB)\n" +
                "테스트 17 〉\t통과 (11.72ms, 53MB)\n" +
                "테스트 1 〉\t통과 (36.88ms, 127MB)\n" +
                "테스트 2 〉\t통과 (35.07ms, 125MB)\n" +
                "테스트 3 〉\t통과 (32.20ms, 125MB)\n" +
                "테스트 4 〉\t통과 (34.02ms, 128MB)";
        System.out.println(Tools.avgCalc(best));
    }
}
