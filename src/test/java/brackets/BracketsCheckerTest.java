package brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {


    @Test
    public void test0(){
        String stringToCheck = "(a(c)";

        assertEquals(false, BracketsChecker.check(stringToCheck));
    }

    @Test
    public void test1() {
        String stringToCheck = ")b";

        assertEquals(false, BracketsChecker.check(stringToCheck));
    }

    @Test
    public void test2() {
        String stringToCheck = "(b(s))";

        assertEquals(true, BracketsChecker.check(stringToCheck));
    }
}