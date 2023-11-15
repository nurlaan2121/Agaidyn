public class GeneretorId {
    public static long iid =0;
    public static long iid2 =0;
    public static long generetator(){
        return ++iid;
    }
    public static long generetatorEl(){
        return ++iid2;
    }
}
