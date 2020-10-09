> best

7점 0.0915 ms  
```
public String solution(String s, int n) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        // A-Z 65-90
        if (chars[i] > 64 && chars[i] < 91) {
            if ((char) (chars[i] + n) > 90)
                chars[i] = (char) (chars[i] + n -26);
            else
                chars[i] = (char) (chars[i] + n);
        // a-z 97-122
        } else if (chars[i] > 96 && chars[i] < 123) {
            if ((char) (chars[i] + n) > 122)
                chars[i] = (char) (chars[i] + n -26);
            else
                chars[i] = (char) (chars[i] + n);
        }
        // ' ' 32 nothing
    }
    return new String(chars);
}
```
> 첫시도  

  
7점 0.0961ms  
```
public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= (int) 'A' && chars[i] <= (int) 'Z') {
                if ((char) (chars[i] + n) > (int) 'Z')
                    chars[i] = (char) (chars[i] + n -1 - 'Z' + 'A');
                else
                    chars[i] = (char) (chars[i] + n);
            } else if (chars[i] >= (int) 'a' && chars[i] <= (int) 'z') {
                if ((char) (chars[i] + n) > (int) 'z')
                    chars[i] = (char) (chars[i] + n -1 - 'z' + 'a');
                else
                    chars[i] = (char) (chars[i] + n);
            }
        }
        return new String(chars);
    }
```