package Level1.greedy체육복;

import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] isLost = new boolean[n];
        ArrayList<Integer> extra = new ArrayList<>();
        for (int i = 0; i < reserve.length; i++) {
            extra.add(reserve[i]);
        }
        for (int i = 0; i < lost.length; i++) {
            isLost[lost[i]-1] = true;
        }
        extra.stream()
                .filter(x -> {
                    if (isLost[x-1]) {
                        isLost[x-1] = false;
                        return false;
                    }
                    return true;
                });
        int useCount = reserve.length - (int) extra.stream()
                .filter(x -> {
                    if (x>1&&isLost[x - 2]) {
                        isLost[x - 2] = false;
                        return false;
                    } else if (x<n&&isLost[x]) {
                        isLost[x] = false;
                        return false;
                    }
                    return true;
                }).count();
        return n - lost.length + useCount;
    }

    public static void main(String[] args) {
        new Solution().solution(5 , new int[]{2,4}, new int[]{1,3,5});
    }
}
