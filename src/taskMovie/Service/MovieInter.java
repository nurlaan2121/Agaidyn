package taskMovie.Service;

import taskMovie.Janre;
import taskMovie.Movie;

import java.util.Comparator;
import java.util.LinkedList;

public interface MovieInter {
    LinkedList<Movie>getallmovies();
    Movie findMovieByNameOrPartName(String name);
    Movie findMovieByActorName(String actorName);
    Movie findMovieByYear(int year);
    Movie findMovieByProducer(String producerName);
    Movie findMovieByGenre(Janre genre);
    Movie findMovieByRole(String role);
    LinkedList<Movie> sortByMovieName(String ascOrDesc);
    LinkedList<Movie> sortByYear(String ascOrDesc);
    LinkedList<Movie> sortByProducer(String name);



}
