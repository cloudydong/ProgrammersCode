package tool;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test<T,V> {

    private long timeout = 100L;
    private int count = 0;
    private long avgTime = 0;

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
    public long getAvgTime() {
        return avgTime;
    }

    public void run(T input, V output) {
        long start = System.currentTimeMillis();
        try {
            assertEquals(input, output);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        long time = System.currentTimeMillis()-start;
        avgTime += time;
        count++;
        if(timeout>time)
            System.out.println("테스트"+count+" : 통과 ("+time+"ms)");
        else
            System.out.println("테스트"+count+" : 실패 ("+time+"ms)");
    }

    public static Double avgCalc(String s) {
        String str = s.replaceAll("테스트\\s[0-9]+\\s〉\\s통과\\s\\(","\0")
                .replaceAll("ms,\\s[0-9]{1,3}\\.?[0-9]+MB\\)","\0");
        Stream<String> stream = Pattern.compile("\n").splitAsStream(str);
        OptionalDouble average = stream.map(Double::parseDouble).mapToDouble(value -> value).average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }
}
