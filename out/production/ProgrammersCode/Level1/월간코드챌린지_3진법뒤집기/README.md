>첫시도   

 6점 0.062ms
```
public int solution(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    int answer = 0;
    while(n>0) {
        list.add(n%3);
        n = n/3;
    }
    int x =list.size() - 1;
    for (int i = 0; i < list.size(); i++) {
        answer += list.get(i)*Math.pow(3,x--);
    }
    return answer;
}   
```
wile문 한번
```
public int solution(int n) {
    int answer = 0;
    int pow = (int) Math.pow(3, (Math.log(n) / Math.log(3)));
    while (n > 0) {
        answer += (n % 3) * pow;
        pow /= 3;
        n /= 3;
    }
    return answer;
}
```