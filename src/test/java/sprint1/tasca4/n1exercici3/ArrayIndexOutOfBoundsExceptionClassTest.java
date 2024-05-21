package sprint1.tasca4.n1exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayIndexOutOfBoundsExceptionClassTest {

    @Test
    public void testExpectedException() {
        ArrayIndexOutOfBoundsExceptionClass arrayIOOBE = new ArrayIndexOutOfBoundsExceptionClass();
        int[] array = {1, 2, 3, 4, 5};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayIOOBE.throwIndexOutOfBoundsExc(array, 5);
        });
    }

}