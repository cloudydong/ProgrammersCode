package Level1.문자열을정수로바꾸기;

import org.junit.jupiter.api.*;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    static Solution s;
    static tool.Test<Integer,Integer> test;

    @BeforeAll
    static void init() {
        test = new tool.Test<>();
        test.setTimeout(100L);
        s = new Solution();
    }
    @AfterAll
    static void end() {
        System.out.println("평균시간: "+test.getAvgTime()+"ms");;
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {

    }

    @Test
    void 테스트1() {
        test.run(s.solution("1234"), 1234);
    }

    @Test
    void 테스트2() {
        test.run(s.solution("-1234"), -1234);
    }

    @Test
    void 테스트3() {
        test.run(s.solution("-1234"), -1234);
        test.run(s.solution("-4242"), -4242);
        test.run(s.solution("-5555"), -5555);
        test.run(s.solution("-6666"), -6666);
        test.run(s.solution("-7978"), -7978);
        test.run(s.solution("-6577"), -6577);
        test.run(s.solution("-9999"), -9999);
        test.run(s.solution("-0000"), -0000);
    }

}