package movieSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<movie> movieList = new ArrayList<>();

        movieList.add(new movie("Inception", 2010, "Bilim Kurgu", 8.8));
        movieList.add(new movie("The Godfather", 1972, "Suç", 9.2));
        movieList.add(new movie("Interstellar", 2014, "Bilim Kurgu", 8.6));
        movieList.add(new movie("Parasite", 2019, "Dram", 8.5));
        movieList.add(new movie("Pulp Fiction", 1994, "Suç", 8.9));

        System.out.println("IMDB'ye göre (Büyükten Küçüğe)");
        movieList.sort(Comparator.comparingDouble(movie::getRating).reversed());
        movieList.forEach(System.out::println);
        System.out.println("-------------");
        System.out.println("Yayın Yılına Göre");
        movieList.sort(Comparator.comparingInt(movie::getYear));
        movieList.forEach(System.out::println);
        System.out.println("-------------");
        System.out.println("Bilim Kurgu Filmleri");
        filter(movieList, "Bilim Kurgu");
    }

    public static void filter(List<movie> movieList, String genre) {
        for (movie m : movieList) {
            if (m.getGenre().equals(genre)) {
                System.out.println(m);
            }
        }

    }
}
