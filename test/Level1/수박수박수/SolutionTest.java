package Level1.수박수박수;

import Level1.문자열을정수로바꾸기.Solution;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    static Level1.수박수박수.Solution s;
    static tool.Test<String,String> test;
    long start= 0;
    @BeforeAll
    static void init() {
        test = new tool.Test<>();
        test.setTimeout(100L);
        s = new Level1.수박수박수.Solution();
    }
    @AfterAll
    static void end() {
        System.out.println("평균시간: "+test.getAvgTime()+"ms");;
    }
    @BeforeEach
    void setUp() {
        start = System.currentTimeMillis();
    }
    @AfterEach
    void tearDown() {
        long time = System.currentTimeMillis()-start;
        System.out.println(time+"ms");
    }

    @Test
    void 테스트1() {
        test.run(s.solution(3), "수박수");
        assertEquals(s.solution(16), "수박수박수박수박수박수박수박수박");
        test.run(s.solution(64), "수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박수박");
    }

    @RepeatedTest(300)
    void 테스트2() {
        assertEquals(s.solution(16), "수박수박수박수박수박수박수박수박");
    }

    @Test
    void 테스트3() {
        s.solution(1000000000);
    }
}