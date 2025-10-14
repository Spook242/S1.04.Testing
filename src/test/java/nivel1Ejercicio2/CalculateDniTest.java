package nivel1Ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y",
            "99999999, R"
    })
    void testCalculateCorrectLetter(int numero, char goodLetter) {
        char result = CalculateDni.calculateLetter(numero);
        assertEquals(goodLetter, result,
                "Error calculating letter by number: " + numero);
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "100000000"
    })
    void testInvalidNumber(int invalidNumber) {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateLetter(invalidNumber);
        });
    }
}
