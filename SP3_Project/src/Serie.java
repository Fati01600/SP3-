import java.io.IOException;
import java.util.ArrayList;


public class Serie extends Media {

    private int season;


    Serie(String title, int publicationYear, ArrayList<String> genre , double rating, int season) throws IOException {
        super(title, publicationYear, genre, rating);
        this.season = season;
    }


    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public int getSeason() {
        return season;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", " + "Seasons and episodes: " + season;
    }

}

