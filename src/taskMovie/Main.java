package taskMovie;

import lmsReal.Database;
import taskMovie.Service.GenertorID;
import taskMovie.Service.MovieImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor(GenertorID.actorID(), "Жениш Майрамбеков", "Аяш");
        Actor actor2 = new Actor(GenertorID.actorID(), "Динара Багышбаева", "Аяшынын досу");
        Actor actor3 = new Actor(GenertorID.actorID(), "Калипа Таштанова", "Бакыттын аялы");
        Actor actor4 = new Actor(GenertorID.actorID(), "Бакыт Осмонканов", "Жеништин досу");
        LinkedList<Actor> actorsAyash = new LinkedList<>();
        actorsAyash.add(actor);
        actorsAyash.add(actor2);
        actorsAyash.add(actor3);
        actorsAyash.add(actor4);
        Producer producer = new Producer(GenertorID.ProducerID(), "Анвар", "Осмоналиев");
        LinkedList<String> ss = new LinkedList<>();
        ss.add("Аяш");
        ss.add("Аяш2");
        ss.add("Аяш3");
        ss.add("Аяштар");
        Movie movie = new Movie(ss,GenertorID.movieID(), "Аяш", 2021, Janre.KOMEDIA, producer, actorsAyash);


        Actor actor8 = new Actor(GenertorID.actorID(), " Омар Си", "Байдын кызматчысы");
        Actor actor5 = new Actor(GenertorID.actorID(), "Анн Ле Ни", "Дома хозайка");
        Actor actor6 = new Actor(GenertorID.actorID(), "Франсуа Клюзе", "Бай");
        Actor actor7 = new Actor(GenertorID.actorID(), "Клотильд Молле", "Байдын кызы");
        LinkedList<Actor> actors2 = new LinkedList<>();
        actors2.add(actor5);
        actors2.add(actor6);
        actors2.add(actor7);
        actors2.add(actor8);
        Producer producer2 = new Producer(GenertorID.ProducerID(), "Арно", "Бертран");
        LinkedList<String> rr = new LinkedList<>();

        rr.add("Бай эркек");
        rr.add("Комедия");
        rr.add("1+11");
        Movie movie2 = new Movie(rr,GenertorID.movieID(), "1+1", 2011, Janre.DRAMMA, producer2, actors2);


        Actor actor12 = new Actor(GenertorID.actorID(), "Шайа ЛаБаф", "Главный рольдог бала");
        Actor actor9 = new Actor(GenertorID.actorID(), "Меган Фокс", "Ошонун аялы");
        Actor actor10 = new Actor(GenertorID.actorID(), "Джон Туртурро", "Окумуштуу");
        Actor actor11 = new Actor(GenertorID.actorID(), "Тайриз Гибсон", "Милиция");
        LinkedList<Actor> actors3 = new LinkedList<>();
        actors3.add(actor9);
        actors3.add(actor10);
        actors3.add(actor12);
        actors3.add(actor11);
        Producer producer3 = new Producer(GenertorID.ProducerID(), "Йен", "Брайс");
        LinkedList<String> tt = new LinkedList<>();
        tt.add("РОбот");
        tt.add("Трансформеры");
        tt.add("РОботтар");
        tt.add("Трасформеры 1");
        tt.add("Трасформеры 2");
        tt.add("Трасформеры 3");
        Movie movie3 = new Movie(tt,GenertorID.movieID(), "Трансформеры", 2007, Janre.VANTASTIKA, producer3, actors3);
        DateBazeMovie.allMovies.add(movie);
        DateBazeMovie.allMovies.add(movie2);
        DateBazeMovie.allMovies.add(movie3);
        MovieImpl movie1 = new MovieImpl();


        Scanner scanner = new Scanner(System.in);
        LOOP1:
        while (true) {
            System.out.println("""
                    1.Get All movies
                    2.Search movie by name || by part name
                    3.Search movie by actor name
                    4.Search movie by yaer
                    5.Search  movie by Producer
                    6.Search movie by Genre
                    7.Search movie by Role
                    8.Sort movie by name
                    9.Sort movie by year
                    10.Sort movie by Producer
                    0.Exit!    
                                       
                    """);
            try {
                int actions = scanner.nextInt();
                switch (actions) {
                    case 1 -> {
                        System.out.println(movie1.getallmovies());
                    }
                    case 2 -> {
                        System.out.println("Write name movie || Write part name");
                        System.out.println(movie1.findMovieByNameOrPartName(new Scanner(System.in).nextLine()));
                    }
                    case 3 -> {
                        System.out.println("Write actor Name: ");
                        System.out.println(movie1.findMovieByActorName(new Scanner(System.in).nextLine()));
                    }
                    case 4 -> {
                        System.out.println("Write  year movie");
                        System.out.println(movie1.findMovieByYear(new Scanner(System.in).nextInt()));
                    }
                    case 5 -> {
                        System.out.println("Write producer: ");
                        System.out.println(movie1.findMovieByProducer(new Scanner(System.in).nextLine()));
                    }
                    case 6 -> {
                        System.out.println("Write Genre :(DRAMMA,KOMEDIA,EKSHN,DETEKTIV,VANTASTIKA) ");
                        String genre = new Scanner(System.in).nextLine();
                        if (genre.equalsIgnoreCase("DRAMMA")) {
                            System.out.println(movie1.findMovieByGenre(Janre.DRAMMA));
                        } else if (genre.equalsIgnoreCase("KOMEDIA")) {
                            System.out.println(movie1.findMovieByGenre(Janre.KOMEDIA));
                        } else if (genre.equalsIgnoreCase("EKSHN")) {
                            System.out.println(movie1.findMovieByGenre(Janre.EKSHN));
                        } else if (genre.equalsIgnoreCase("DETEKTIV")) {
                            System.out.println(movie1.findMovieByGenre(Janre.DETEKTIV));
                        } else if (genre.equalsIgnoreCase("VANTASTIKA")) {
                            System.out.println(movie1.findMovieByGenre(Janre.VANTASTIKA));
                        }
                    }
                    case 7 -> {
                        System.out.println("Write role: ");
                        System.out.println(movie1.findMovieByRole(new Scanner(System.in).nextLine()));
                    }
                    case 8 -> {
                        System.out.println("Write ask || Desk");
                        System.out.println(movie1.sortByMovieName(new Scanner(System.in).nextLine()));
                    }
                    case 9 -> {
                        System.out.println("Write ask || Desk");
                        System.out.println(movie1.sortByYear(new Scanner(System.in).nextLine()));
                    }
                    case 10 -> {
                        System.out.println("Write chto to");
                        System.out.println(movie1.sortByProducer(new Scanner(System.in).nextLine()));
                    }case 0->{
                        break LOOP1;
                    }
                    default -> System.out.println("Not command!");
                }
            } catch (InputMismatchException exception) {
                System.out.println("San jaz");
                scanner.next();

            }
        }

    }
}
