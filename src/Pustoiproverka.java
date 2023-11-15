public class Pustoiproverka {


    public static String proverka(String sox){
        while (true){
            if (sox.length()>2){
                return "ok";
            }else return "jok";
        }
    }

    public static String proverkaAvtora(String sox){
        while (true){
            if (sox.length()>2&&!sox.contains("1")||!sox.contains("2")||!sox.contains("4")||!sox.contains("5")|| !sox.contains("6")||!sox.contains("7") ||!sox.contains("8") ||!sox.contains("9") || !sox.contains("0")){
                return "ok";
            }else return "jok";
        }
    }
}
