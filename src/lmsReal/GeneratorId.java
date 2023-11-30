package lmsReal;

public class GeneratorId {
    public static long idforgroup = 0;
    public static long idforlesson = 0;
    public static long idforstudent = 0;
    public static long generatorforgroup(){
        return ++idforgroup;
    }public static long generatorforlesson(){
        return ++idforlesson;
    }public static long generatorforstuden(){
        return ++idforstudent;
    }
}
