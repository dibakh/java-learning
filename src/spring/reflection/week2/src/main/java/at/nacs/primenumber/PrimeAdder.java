package at.nacs.primenumber;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@Value
public class PrimeAdder {

    private Primes primes;

    public int getSum(int i) {
        return IntStream.iterate(2, e -> ++e)
                .filter(e -> primes.isPrime(e))
                .limit(i)
                .sum();
    }
}