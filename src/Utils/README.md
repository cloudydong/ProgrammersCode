EX) String s =   
테스트 1 〉	통과 (0.02ms, 51.9MB)  
테스트 2 〉	통과 (0.03ms, 52.3MB)  
테스트 3 〉	통과 (0.04ms, 52.1MB)  
테스트 4 〉	통과 (0.02ms, 52.9MB)  
테스트 5 〉	통과 (0.02ms, 52.7MB)  
테스트 6 〉	통과 (0.03ms, 52.6MB)  
테스트 7 〉	통과 (0.02ms, 53MB)  
테스트 8 〉	통과 (0.02ms, 52.9MB)  
테스트 9 〉	통과 (0.03ms, 51.9MB)  
테스트 10 〉	통과 (0.03ms, 52.1MB)  
테스트 11 〉	통과 (0.02ms, 52.5MB)  
테스트 12 〉	통과 (0.02ms, 52.4MB)  
테스트 13 〉	통과 (0.02ms, 52.7MB)  
테스트 14 〉	통과 (0.02ms, 53.8MB)  
테스트 15 〉	통과 (0.02ms, 52.7MB)  

replaceAll("테스트\\s[0-9]+\\s〉\\s통과\\s\\(","\0")  
앞에 값을 공백으로 치환
  
replaceAll("ms,\\s[0-9]{1,3}\\.?[0-9]+MB\\)","\0")  
뒤에 값을 공백으로 치환
  
Stream<String> stream = Pattern.compile("\n").splitAsStream(str);  
\n기준으로 나눈 String stream을 만든다.
  
OptionalDouble average = stream.map(Double::parseDouble).mapToDouble(value -> value).average();  
String을 Double로 변환 mapToDouble(value -> value).average()은 OptionalDouble을 만들기 위함
  
average.isPresent() ? average.getAsDouble() : 0;  
isPresent로 값이 있으면 getAsDouble 없으면 0 리턴

replace와 replaceAll은 다르게 동작한다. replaceAll은 정규표현식이 사용가능하고 replace에서는 \0와같은 몇몇은 동작하고 그외는 되지않았다.

참고 https://stackoverflow.com/questions/10791568/calculating-average-of-an-array-list  

