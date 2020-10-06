>bestSpeed  

평균 0.020625ms  
if,else 로 max,min 구하는것이 가장 빠르다.

```
public long solution(int a, int b) {
        long answer = 0;
        int min;
        int max;
        if(a>b){
          max=a;
          min=b;
        }else{
          max=b;
          min=a;
        }
        return (long) (max+min)*(max-min+1)/2;
}
```

>ternary 삼항연산자  

평균 0.023125ms  
삼항 연산자 사용  

```
public long solution(int a, int b) {
        int abs = a>b? a-b: b-a;
        return (long) (a+b)*(abs+1)/2;
}
```

>ShortCode  

평균 0.03375ms  
Math.abs 사용  
```
public long solution(int a, int b) {
        return (long) (a+b)*(Math.abs(a-b)+1)/2;
}
```



