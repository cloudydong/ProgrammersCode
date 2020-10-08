package Level1.소수찾기;

import java.util.ArrayList;

public class Solution {
    public int solution(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        for (int num = 3; num < n + 1; num++) {
            primeAdd(num, primeList);
        }
        return primeList.size();
    }
    public void primeAdd(int num, ArrayList<Integer> primeList) {
        for (Integer integer : primeList)
            if (num % integer == 0)
                return;
        primeList.add(num);
    }
}
