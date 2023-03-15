import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import primes.PrimalityChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimesTests
{
    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1})
    public void primesBoundaryTest(int number)
    {
        PrimalityChecker checker = new PrimalityChecker();
        assertFalse(checker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
    public void validPrimeTest(int number2)
    {
        PrimalityChecker checker2 = new PrimalityChecker();
        assertTrue(checker2.isPrime(number2));

    }

}
