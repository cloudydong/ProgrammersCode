>Best

정규표현식 사용
```
public String solution(int n) {
        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
```
>Nomal
```
public String solution(int n) {
        StringBuilder answer= new StringBuilder();
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                answer.append("수");
                flag=false;
            } else {
                answer.append("박");
                flag=true;
            }
        }
        return answer.toString();
    }
```
>Worst

스트링빌더나 버퍼를 사용하지 않고 +연산자를 사용하면 String 객체가 계속 생겨서 Heap영역이 꽉찰수도 있다.
에러는 다음과 같이 뜬다.  
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space 
```
public String solution(int n) {
        String answer="";
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                answer+="수";
                flag=false;
            } else {
                answer+="박";
                flag=true;
            }
        }
        return answer;
  }
```