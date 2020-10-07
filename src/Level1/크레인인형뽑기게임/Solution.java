package Level1.크레인인형뽑기게임;

import Utils.Tools;

import java.util.*;

public class Solution {

    public int solution(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            count += pickUpCrane(board, move, stack);
        }
        return count;
    }
    public int pickUpCrane (int[][] board, int move, Stack<Integer> stack) {
        int HEIGHT = board[0].length;
        for (int i = 0; i < HEIGHT; i++) {
            int pickUp = board[i][move-1];
            if(pickUp!=0) {
                stack.push(pickUp);
                board[i][move-1] = 0;
                return boom(stack);
            }
        }
        return 0;
    }

    public int boom(Stack<Integer> stack) {
        if(stack.size()>1) {
            if(stack.get(stack.size()-2).equals(stack.get(stack.size()-1))) {
                stack.pop();
                stack.pop();
                return 2;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(new Solution()
                .solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
        String stack = "테스트 1 〉\t통과 (0.21ms, 52.8MB)\n" +
                "테스트 2 〉\t통과 (0.37ms, 52.5MB)\n" +
                "테스트 3 〉\t통과 (0.19ms, 51.8MB)\n" +
                "테스트 4 〉\t통과 (1.75ms, 53MB)\n" +
                "테스트 5 〉\t통과 (0.19ms, 52.1MB)\n" +
                "테스트 6 〉\t통과 (0.21ms, 53.2MB)\n" +
                "테스트 7 〉\t통과 (0.34ms, 52MB)\n" +
                "테스트 8 〉\t통과 (0.72ms, 52.7MB)\n" +
                "테스트 9 〉\t통과 (0.61ms, 52.1MB)\n" +
                "테스트 10 〉\t통과 (0.72ms, 52.4MB)\n" +
                "테스트 11 〉\t통과 (1.23ms, 52.1MB)";
        System.out.println(Tools.avgCalc(stack));
        String arr = "테스트 1 〉\t통과 (0.05ms, 52.6MB)\n" +
                "테스트 2 〉\t통과 (0.10ms, 52.1MB)\n" +
                "테스트 3 〉\t통과 (0.14ms, 52.4MB)\n" +
                "테스트 4 〉\t통과 (1.59ms, 52.2MB)\n" +
                "테스트 5 〉\t통과 (0.07ms, 52.9MB)\n" +
                "테스트 6 〉\t통과 (0.06ms, 52.4MB)\n" +
                "테스트 7 〉\t통과 (0.14ms, 52.7MB)\n" +
                "테스트 8 〉\t통과 (0.55ms, 54MB)\n" +
                "테스트 9 〉\t통과 (0.54ms, 52.3MB)\n" +
                "테스트 10 〉\t통과 (0.68ms, 52.8MB)\n" +
                "테스트 11 〉\t통과 (1.02ms, 52.1MB)";
        System.out.println(Tools.avgCalc(arr));
    }
}
