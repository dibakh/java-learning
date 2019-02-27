package at.nacs.primenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PrimeGeneratorTest {

    @Autowired
    PrimeGenerator primeGenerator;

    @Autowired
    Primes primes;

    @Test
    void getNumbers() {
        int actual = primeGenerator.getNumbers(100);
        Assertions.assertEquals(24133, actual);
    }

    @Test
    void isPrime() {
        boolean prime = primes.isPrime(3);
        assertTrue(prime);
    }


}