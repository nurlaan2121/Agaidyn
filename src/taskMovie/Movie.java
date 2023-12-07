package taskMovie;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;

public class Movie {
    private Long id;
    private  String name;
    private int year;
    private Janre janr;
    private Producer producer;
    private LinkedList<Actor> actors = new LinkedList<>();
    private LinkedList<String> nik;

    public Movie() {
    }

    public Movie(LinkedList<String> nik,Long id, String name, int year, Janre janr, Producer producer, LinkedList<Actor> actors) {
        this.nik = nik;
        this.id = id;
        this.name = name;
        this.year = year;
        this.janr = janr;
        this.producer = producer;
        this.actors = actors;
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

    public Janre getJanr() {
        return janr;
    }

    public void setJanr(Janre janr) {
        this.janr = janr;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public LinkedList<Actor> getActors() {
        return actors;
    }

    public void setActors(LinkedList<Actor> actors) {
        this.actors = actors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LinkedList<String> getNik() {
        return nik;
    }

    public void setNik(LinkedList<String> nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID=" + id +
                "| name='" + name + '\'' +
                "| year=" + year +
                "| Ganre=" + janr +
                "| Producer=" + producer +
                "| Actors=" + actors + "\n" +
                '}';
    }
    public static Comparator<Movie> sortAty = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }


    }; public static Comparator<Movie> sortJyl = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };

    public static Comparator<Movie> sortJAnr = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getFersName().compareTo(o2.getProducer().getFersName());
        }
    };
}
