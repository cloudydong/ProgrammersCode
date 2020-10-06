>best?

Integer.parseInt 사용

평균 0.0293ms
```
    public int solution(String s) {
            int answer;
            if(s.charAt(0)== '-')
                answer = -1*Integer.parseInt(s.substring(1));
            else if(s.charAt(0)== '+')
                answer = Integer.parseInt(s.substring(1));
            else
                answer = Integer.parseInt(s);
            return answer;
        }
```
>Integer.parseInt 비사용 방법

char '0'은 int 변환시 48이된다. '1'은 49 따라서 ch-'0' 으로 숫자를 구함

평균 0.0293ms
```
public int solution(String s) {
        int answer;
        if(s.charAt(0)== '-')
            answer = -1*method(s.substring(1));
        else if(s.charAt(0)== '+')
            answer = method(s.substring(1));
        else
            answer = method(s);
        return answer;
    }
    public int method(String s) {
        int answer = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            answer = answer*10 + (ch-'0');
        }
        return answer;
    }
```



>worst 방법

0.0326ms
```
public int solution(String s) {
         int answer = 0;
         if (s.substring(0, 1).equals("-")) {
             answer = -1*Integer.parseInt(s.substring(1,s.length()));
         } else if (s.substring(0, 1).equals("+")) {
             answer = Integer.parseInt(s.substring(1,s.length()));
         } else {
             answer = Integer.parseInt(s.substring(0,s.length()));
         }
         return answer;
     }
```