import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class GenZTest {
    // Your code starts here
    // Valid Gen Z years (boundary and middle)
    @Test
    void testStartBoundaryYear() {
        assertTrue(GenZHelper.IsGenZ(1997));
    }

    @Test
    void testMiddleOfGenZRange() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(2006); // Assuming 2006 is the middle year of Gen Z range
        });
    }

    @Test
    void testEndBoundaryYear() {
        assertTrue(GenZHelper.IsGenZ(2015));
    }

    // Just outside valid Gen Z years (boundary cases)
    @Test
    void testYearJustBeforeStartOfGenZ() {
        assertFalse(GenZHelper.IsGenZ(1996));
    }

    @Test
    void testYearJustAfterEndOfGenZRange() {
        assertFalse(GenZHelper.IsGenZ(2016));
    }

    @Test
    void testFarBeforeGenZRange() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(1800);
        });
    }

    @Test
    void testFarAfterGenZRange() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(2100);
        });
    }

    @Test
    void testNegativeYear() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(-1);
        });
    }

    @Test
    void testZeroYear() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(0);
        });
    }

    @Test
    void testMaximumValidGregorianYear() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(9999);
        });
    }

    @Test
    void testMinimumValidGregorianYear() {
        assertThrows(RuntimeException.class, () -> {
            GenZHelper.IsGenZ(1);
        });
    }

    @Test
    void testYearJustAfterStartOfGenZ() {
        assertTrue(GenZHelper.IsGenZ(1998));
    }

    @Test
    void testYearJustBeforeEndOfGenZRange() {
        assertTrue(GenZHelper.IsGenZ(2014));
    }
    // Your code ends here
}
