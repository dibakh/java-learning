package exercises.week10.ex03;

import exercises.week09.ex02.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsReader {
    public List<Sms> getLines(){
        return new FileReader().asStream("exercises/week10/ex03/sms.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Sms(e[0],e[1]))
                .collect(Collectors.toList());
    }
}
