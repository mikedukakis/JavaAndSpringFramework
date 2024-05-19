package sprint1.tasca4.n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MonthsTest {
    static Months months = new Months();

    @Test
    public void twelveMonths() {
        assertEquals(12, months.getMonths().size());
    }

    @Test
    public void notNull() {
        assertNotNull(months);
    }

    @Test
    public void augustIsEighth() {
        assertEquals("August", months.getMonths().get(7));
    }
  
}