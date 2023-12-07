package taskMovie.Service;

import taskMovie.DateBazeMovie;
import taskMovie.Janre;
import taskMovie.Movie;
import java.util.LinkedList;
public class MovieImpl implements MovieInter {
    @Override
    public LinkedList<Movie> getallmovies() {
        return DateBazeMovie.allMovies;
    }

    @Override
    public Movie findMovieByNameOrPartName(String name) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            if (name.equalsIgnoreCase(DateBazeMovie.allMovies.get(i).getName()) || name.contains(DateBazeMovie.allMovies.get(i).getNik().element())){
                return DateBazeMovie.allMovies.get(i);
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            if (actorName.equalsIgnoreCase(DateBazeMovie.allMovies.get(i).getActors().get(i).getFullName())){
                return DateBazeMovie.allMovies.get(i);
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByYear(int year) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            if (DateBazeMovie.allMovies.get(i).getYear() == year){
                return DateBazeMovie.allMovies.get(i);
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerName) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            if (DateBazeMovie.allMovies.get(i).getProducer().getFersName().equalsIgnoreCase(producerName)){
                return DateBazeMovie.allMovies.get(i);
            }
        }return null;
    }

    @Override
    public Movie findMovieByGenre(Janre genre) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            if (genre.name().equalsIgnoreCase(DateBazeMovie.allMovies.get(i).getJanr().name())){
                return DateBazeMovie.allMovies.get(i);
            }
        }return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (int i = 0; i < DateBazeMovie.allMovies.size(); i++) {
            for (int i1 = 0; i1 < DateBazeMovie.allMovies.get(i).getActors().size(); i1++) {
                if (role.equalsIgnoreCase(DateBazeMovie.allMovies.get(i).getActors().get(i1).getRole())){
                    return DateBazeMovie.allMovies.get(i);
                }
            }
        }return  null;
    }

    @Override
    public LinkedList<Movie> sortByMovieName(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("ask")){
            DateBazeMovie.sortbyName = new LinkedList<>(DateBazeMovie.allMovies);
            DateBazeMovie.sortbyName.sort(Movie.sortAty);
            return DateBazeMovie.sortbyName;
        } else if (ascOrDesc.equalsIgnoreCase("Desk")) {
            DateBazeMovie.sortbyName = new LinkedList<>(DateBazeMovie.allMovies);
            DateBazeMovie.sortbyName.sort(Movie.sortAty);
            return DateBazeMovie.sortbyName.reversed();
        }
        return null;

    }

    @Override
    public LinkedList<Movie> sortByYear(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("ask")){
            DateBazeMovie.sortByYear = new LinkedList<>(DateBazeMovie.allMovies);
            DateBazeMovie.sortByYear.sort(Movie.sortJyl);
            return DateBazeMovie.sortByYear;
        } else if (ascOrDesc.equalsIgnoreCase("Desk")) {
            DateBazeMovie.sortByYear = new LinkedList<>(DateBazeMovie.allMovies);
            DateBazeMovie.sortByYear.sort(Movie.sortJyl);
            return DateBazeMovie.sortByYear.reversed();
        }
        return null;
    }

    @Override
    public LinkedList<Movie> sortByProducer(String name) {
        DateBazeMovie.sorByJAnr = new LinkedList<>(DateBazeMovie.allMovies);
        DateBazeMovie.sorByJAnr.sort(Movie.sortJAnr);
        return DateBazeMovie.sorByJAnr;
    }
}
