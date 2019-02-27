package at.nacs.primenumber;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@Value
public class PrimeGenerator {

    private Primes primes;

    public int getNumbers(int i) {
        return IntStream.iterate(2, e -> ++e)
                .filter(e -> primes.isPrime(e))
                .peek(e-> System.out.println(e))
                .limit(i)
                .sum();
    }
}