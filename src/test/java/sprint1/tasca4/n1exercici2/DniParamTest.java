package sprint1.tasca4.n1exercici2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DniParamTest {

    @ParameterizedTest
    @MethodSource("dniProvider")
    @DisplayName("Test getLetter() method, passing expected letter and gelLetter with number as argument")
    void testGetLetter(char expectedLetter, int number) {
        Dni dni = new Dni(number);
        assertEquals(expectedLetter, dni.getLetter());
    }

    static Stream<Arguments> dniProvider() {
        return Stream.of(
                Arguments.of('V', 12769548),
                Arguments.of('Y', 58833891),
                Arguments.of('R', 27409699),
                Arguments.of('R', 67765568),
                Arguments.of('Q', 74461274),
                Arguments.of('R', 36109518),
                Arguments.of('G', 80618385),
                Arguments.of('C', 26346658),
                Arguments.of('L', 13526802),
                Arguments.of('K', 88377682)
        );
    }
}