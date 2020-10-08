> 첫시도  

```
public String solution(String[] seoul) {
    int cnt = 0;
    for (String s : seoul) {
        if (s.equals("Kim"))
            break;
        cnt++;
    }
    return "김서방은 "+cnt+"에 있다";
}
```