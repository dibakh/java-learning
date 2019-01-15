package exercises.week09.ex05;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    List<Film> films = new FilmReader().getFilms();

    public void analyseData() {
        List<String> collect = films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 3 with highest rating, sorted by rating:");
        System.out.println(collect);

        collect = films.stream()
                .filter(film -> film.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 3 with highest rating longer than 3 hours, sorted by rating:");
        System.out.println(collect);

        collect = films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 4 most expensive, sorted by budget:");
        System.out.println(collect);


        collect = films.stream()
                .filter(film -> film.getRuntime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 4 most expensive shorter than 90 minutes, sorted by budget:");
        System.out.println(collect);

        collect = films.stream()
                .filter(film -> film.getScore() > 7)
                .filter(film -> film.getBudget() > 50000)
                .filter(film -> film.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());
        System.out.println("\nTop 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:");
        System.out.println(collect);

        collect = films.stream()
                .filter(film -> film.getRuntime() > 120)
                .filter(film -> film.getRevenue() > 100000000)
                .sorted((Comparator.comparing(Film::getScore).reversed()))
                .limit(5)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 5 most rated earned more than 10 milion longer that 2 hours");
        System.out.println(collect);

        collect = films.stream()
                .filter(film -> film.getVoteCount() > 10000)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .map(film -> film.getTitle())
                .collect(Collectors.toList());

        System.out.println("\nTop 3 most popular than voted more than 10 milion times and sorted by rate");
        System.out.println(collect);
    }
}
