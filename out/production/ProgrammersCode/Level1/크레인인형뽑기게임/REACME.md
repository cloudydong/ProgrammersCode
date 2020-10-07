> 첫시도  

ArrayList로 풀이  
0.449 ms 9점
```
public int solution(int[][] board, int[] moves) {
    int count = 0;
    ArrayList<Integer> stack = new ArrayList<>();
    for (int move : moves) {
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][move-1]!=0) {
                stack.add(board[i][move-1]);
                board[i][move-1] = 0;
                if(stack.size()>1) {
                    if(stack.get(stack.size()-2).equals(stack.get(stack.size()-1))) {
                        stack.remove(stack.size()-1);
                        stack.remove(stack.size()-1);
                        count+=2;
                    }
                }
                break;
            }
        }
    }
    return count;
}
```
> 두번쨰 

stack 이용  
0.594 ms  7점  
오히려 ArrayList 풀었을때가 결과가 더 좋았다.  
```
public int solution(int[][] board, int[] moves) {
    int count = 0;
    Stack<Integer> stack = new Stack<>();
    for (int move : moves) {
        for (int i = 0; i < board[0].length; i++) {
            if(board[i][move-1]!=0) {
                stack.push(board[i][move-1]);
                board[i][move-1] = 0;
                if(stack.size()>1) {
                    if(stack.get(stack.size()-2).equals(stack.get(stack.size()-1))) {
                        stack.pop();
                        stack.pop();
                        count+=2;
                    }
                }
                break;
            }
        }
    }
    return count;
}
```
> 코드 가독성  
```
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
```