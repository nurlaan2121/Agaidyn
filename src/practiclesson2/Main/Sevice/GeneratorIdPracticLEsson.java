package practiclesson2.Main.Sevice;

public class GeneratorIdPracticLEsson {
    public static long id= 0;
    public static long id2= 0;
    public static long generatoridPost(){
        return ++id;
    }public static long generatoridUser(){
        return ++id;
    }
}
