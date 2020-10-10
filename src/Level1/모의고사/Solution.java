package Level1.모의고사;

import Utils.Tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] player1 = {1, 2, 3, 4, 5};
        int[] player2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] player3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] collects = new int[3];
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if (answer == player1[i % 5]) collects[0]++;
            if (answer == player2[i % 8]) collects[1]++;
            if (answer == player3[i % 10]) collects[2]++;
        }
        int max = collects[0];
        if (max < collects[1]) max = collects[1];
        if (max < collects[2]) max = collects[2];

        ArrayList<Integer> arr = new ArrayList<>();
        if (max == collects[0]) arr.add(1);
        if (max == collects[1]) arr.add(2);
        if (max == collects[2]) arr.add(3);
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String first = "테스트 1 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 2 〉\t통과 (0.05ms, 52.2MB)\n" +
                "테스트 3 〉\t통과 (0.03ms, 52.4MB)\n" +
                "테스트 4 〉\t통과 (0.04ms, 52.4MB)\n" +
                "테스트 5 〉\t통과 (0.04ms, 52.2MB)\n" +
                "테스트 6 〉\t통과 (0.05ms, 52.9MB)\n" +
                "테스트 7 〉\t통과 (0.44ms, 52.3MB)\n" +
                "테스트 8 〉\t통과 (0.19ms, 51.9MB)\n" +
                "테스트 9 〉\t통과 (0.85ms, 52.3MB)\n" +
                "테스트 10 〉\t통과 (0.41ms, 51.9MB)\n" +
                "테스트 11 〉\t통과 (0.91ms, 53.4MB)\n" +
                "테스트 12 〉\t통과 (0.73ms, 53.1MB)\n" +
                "테스트 13 〉\t통과 (0.07ms, 53.1MB)\n" +
                "테스트 14 〉\t통과 (0.91ms, 53.8MB)";
        System.out.println(Tools.avgCalc(first));

        String useStream = "테스트 1 〉\t통과 (1.94ms, 52.2MB)\n" +
                "테스트 2 〉\t통과 (3.05ms, 52MB)\n" +
                "테스트 3 〉\t통과 (3.04ms, 52.2MB)\n" +
                "테스트 4 〉\t통과 (2.53ms, 52.6MB)\n" +
                "테스트 5 〉\t통과 (7.35ms, 52.3MB)\n" +
                "테스트 6 〉\t통과 (9.39ms, 53.4MB)\n" +
                "테스트 7 〉\t통과 (5.82ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (6.33ms, 53.2MB)\n" +
                "테스트 9 〉\t통과 (7.04ms, 52.4MB)\n" +
                "테스트 10 〉\t통과 (16.11ms, 53MB)\n" +
                "테스트 11 〉\t통과 (5.19ms, 53.1MB)\n" +
                "테스트 12 〉\t통과 (3.38ms, 52.5MB)\n" +
                "테스트 13 〉\t통과 (9.00ms, 52.7MB)\n" +
                "테스트 14 〉\t통과 (5.11ms, 52.2MB)";
        System.out.println(Tools.avgCalc(useStream));
    }
}
