package nivel1Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionTest {

    @Test
    public void testProvokeException() {
        ArrayException example = new ArrayException();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            example.provokeException();
        });
    }
}

