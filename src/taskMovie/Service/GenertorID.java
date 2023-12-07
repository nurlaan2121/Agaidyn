package taskMovie.Service;

public class GenertorID {
    public static Long id = 0L;
    public static Long id2 = 0L;
    public static Long id3 = 0L;

    public static Long actorID(){
        return ++id;
    }
    public static Long ProducerID(){
        return ++id2;
    }
    public static Long movieID(){
        return ++id3;
    }
}
