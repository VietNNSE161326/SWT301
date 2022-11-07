import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeCheckerTest {

    @Test
    void checkDayInMonthTest1(){
        if (31 == DateTimeChecker.checkDayInMonth((short) 2022, (byte) 12)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(31, DateTimeChecker.checkDayInMonth( (short)2022, (byte)12));

    }

    @Test
    void checkDayInMonthTest2(){
        if (31 == DateTimeChecker.checkDayInMonth((short) 2022, (byte) 1)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(31, DateTimeChecker.checkDayInMonth( (short)2022, (byte)1));
    }

    @Test
    void checkDayInMonthTest3(){
        if (30 == DateTimeChecker.checkDayInMonth((short) 2022, (byte) 11)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(30, DateTimeChecker.checkDayInMonth( (short)2022, (byte)11));
    }

    @Test
    void checkDayInMonthTest4(){
        if (31 == DateTimeChecker.checkDayInMonth((short) 2018, (byte) 8)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(31, DateTimeChecker.checkDayInMonth( (short)2022, (byte)8));
    }

    @Test
    void checkDayInMonthTest5(){
        if (28 == DateTimeChecker.checkDayInMonth((short) 2022, (byte) 2)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(28, DateTimeChecker.checkDayInMonth( (short)2022, (byte)2));
    }

    @Test
    void checkDayInMonthTest6(){
        if (29 == DateTimeChecker.checkDayInMonth((short) 2024, (byte) 2)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(29, DateTimeChecker.checkDayInMonth( (short)2024, (byte)2));
    }

    @Test
    void checkDayInMonthTest7(){
        if (0 == DateTimeChecker.checkDayInMonth((short) 2022, (byte) 0)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(0, DateTimeChecker.checkDayInMonth( (short)2022, (byte)0));
    }

    @Test
    void checkDayInMonthTest8(){
        if (0 == DateTimeChecker.checkDayInMonth((short) 2024, (byte) 0)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(0, DateTimeChecker.checkDayInMonth( (short)2024, (byte)0));
    }

    @Test
    void checkDayInMonthTest9(){
        if (31 == DateTimeChecker.checkDayInMonth((short) 0, (byte) 1)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertEquals(31, DateTimeChecker.checkDayInMonth( (short)0, (byte)1));
    }


    @Test
    void isValidDate1() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)5, (byte)1)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)5, (byte)1));
    }

    @Test
    void isValidDate2() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)31)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)31));
    }
    @Test
    void isValidDate3() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)3, (byte)30)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)3, (byte)30));
    }
    @Test
    void isValidDate4() {
        if (DateTimeChecker.isValidDate((short)2020, (byte)2, (byte)29)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2020, (byte)2, (byte)29));
    }
    @Test
    void isValidDate5() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)2, (byte)28)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)2, (byte)28));
    }

    @Test
    void isValidDate6() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)20)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)20));
    }

    @Test
    void isValidDate7() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)28)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)28));
    }

    @Test
    void isValidDate8() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)1)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)1));
    }

    @Test
    void isValidDate9() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)31)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)1, (byte)31));
    }

    @Test
    void isValidDate10() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)1)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)1));
    }

    @Test
    void isValidDate11() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)31)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)12, (byte)31));
    }

    @Test
    void isValidDate12() {
        if (DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)28)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertTrue(DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)28));
    }

    @Test
    void isValidDate13() {
        if (!DateTimeChecker.isValidDate((short)2022, (byte)0, (byte)20)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertFalse(DateTimeChecker.isValidDate((short)2022, (byte)0, (byte)20));
    }

    @Test
    void isValidDate14() {
        if (!DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)0)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertFalse(DateTimeChecker.isValidDate((short)2022, (byte)7, (byte)0));
    }

    @Test
    void isValidDate15() {
        if (!DateTimeChecker.isValidDate((short)2022, (byte)3, (byte)32)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertFalse(DateTimeChecker.isValidDate((short)2022, (byte)3, (byte)32));
    }

    @Test
    void isValidDate16() {
        if (!DateTimeChecker.isValidDate((short)2020, (byte)2, (byte)30)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        assertFalse(DateTimeChecker.isValidDate((short)2020, (byte)2, (byte)30));
    }
}