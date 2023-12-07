package taskMovie;

import java.util.Comparator;

public class SortByJyl implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear() - o2.getYear();
    }
}
