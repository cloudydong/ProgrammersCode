package Utils;

import java.util.OptionalDouble;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Tools {
    public static Double avgCalc(String s) {
        String str = s.replaceAll("테스트\\s[0-9]+\\s〉\\s통과\\s\\(","\0")
                .replaceAll("ms,\\s[0-9]{1,3}\\.?[0-9]+MB\\)","\0");
        Stream<String> stream = Pattern.compile("\n").splitAsStream(str);
        OptionalDouble average = stream.map(Double::parseDouble).mapToDouble(value -> value).average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }
}
