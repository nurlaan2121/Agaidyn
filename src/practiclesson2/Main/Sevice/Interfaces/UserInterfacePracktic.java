package practiclesson2.Main.Sevice.Interfaces;

import practiclesson2.Main.GenderPrackticLesson;
import practiclesson2.Main.UserPolePracktic;

public interface UserInterfacePracktic {
    UserPolePracktic registr(String email, String password, GenderPrackticLesson genderPrackticLesson,String fullname);
    UserPolePracktic loginPrackticLesson(String email,String password);
    UserPolePracktic getUserByEmail(String email);
    void getallusers();
    boolean unical(String email);

}
