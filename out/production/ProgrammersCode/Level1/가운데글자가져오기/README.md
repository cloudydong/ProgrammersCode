> best  

```
public String solution(String s) {
    int halfIdx = (s.length() - 1) / 2;
    int EvenPlus = s.length() / 2 + 1;
    return s.substring(halfIdx, EvenPlus);
}
```