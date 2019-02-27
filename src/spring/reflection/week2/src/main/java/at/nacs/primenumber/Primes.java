package at.nacs.primenumber;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@Value
public class Primes {
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        return IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}
