package Module1_Level3;

public class Movie {

    private String title;
    private String actor;
    private int year;

    public Movie(String title, String actor, int year) {
        this.title = title;
        this.actor = actor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getActor() {
        return actor;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie = " + title + ", actor = " + actor + ", year = " + year + "]";
    }

}
