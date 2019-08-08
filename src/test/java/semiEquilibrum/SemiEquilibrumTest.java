package semiEquilibrum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemiEquilibrumTest {

    @Test
    public void test0(){
        int[] ints = new int[] {1, 2, 5, 2, 1};
        int correctIndex = 2;

        assertEquals(correctIndex, SemiEquilibrum.check(ints));
    }

    @Test
    public void test1(){
        int[] ints = new int[] {1, 2, 3, 5, 3, 2, 1};
        int correctIndex = 3;

        assertEquals(correctIndex, SemiEquilibrum.check(ints));
    }

    @Test
    public void test2(){
        int[] ints = new int[] {1, 2, 3, 4, 3, 20, 1};
        int correctIndex = 5;

        assertEquals(correctIndex, SemiEquilibrum.check(ints));
    }

    @Test
    public void test3(){
        int[] ints = new int[] {1, 2, 20, 4, 3, 1};
        int correctIndex = 2;

        assertEquals(correctIndex, SemiEquilibrum.check(ints));
    }

}