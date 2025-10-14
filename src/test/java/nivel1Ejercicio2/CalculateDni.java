package nivel1Ejercicio2;

public class CalculateDni {


        private static final char[] LETTERS = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
                'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        public static char calculateLetter(int numberDni) {
            if (numberDni < 0 || numberDni > 99999999) {
                throw new IllegalArgumentException("The DNI number must be between 0 and 99.999.999");
            }

            int index = numberDni % 23;
            return LETTERS[index];
        }
    }

