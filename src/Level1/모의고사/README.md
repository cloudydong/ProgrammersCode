> 첫시도 best?

7점 0.339 ms  
int[]를 가변적으로 늘리수없기에 List를 써야했고,  
List<Inreger> 를 int[]로 바꾸는 방법음 for문이 가장 빠르고 간단하다.  
Stream을 사용하는 경우는 다음과 같고 Stream을 사용했기에 무거워진다.(훨신복잡하면 이득을 볼수도 있음)    
Java8 Stream int[] array = list.stream().mapToInt(i->i).toArray();  
```
public int[] solution(int[] answers) {
    int[] player1 = {1, 2, 3, 4, 5};
    int[] player2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] player3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] collects = new int[3];
    // count
    for (int i = 0; i < answers.length; i++) {
        int answer = answers[i];
        if (answer == player1[i % 5]) collects[0]++;
        if (answer == player2[i % 8]) collects[1]++;
        if (answer == player3[i % 10]) collects[2]++;
    }
    // get max
    int max = collects[0];
    if (max < collects[1]) max = collects[1];
    if (max < collects[2]) max = collects[2];
    // answer
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
```