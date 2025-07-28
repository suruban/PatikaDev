package movieSorting;

public class movie {
    String name;
    int year;
    String genre;
    double rating;

    public movie(String name, int year, String genre, double rating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public double getRating() {
        return rating;
    }
    public String toString() {
        return name + " | " + year + " | " + genre + " | " + rating;
    }
}
