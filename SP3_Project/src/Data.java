import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface Data {

    ArrayList<User> readUserData(String path);

    void saveUserData(List<User> users);

    void saveWatchedMedia(List<Media> watched);

    void saveSavedMedia(List<Media> saved);

    String[] readMediaData (String path, int length);

    Set<Media> readMovieData();

    Set<Media> readSerieData();
}
