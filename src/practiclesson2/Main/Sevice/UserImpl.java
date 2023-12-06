package practiclesson2.Main.Sevice;

import Chat.User;
import chahtatach.datadazahach.DB;
import practiclesson2.Main.BdPracticTask2;
import practiclesson2.Main.GenderPrackticLesson;
import practiclesson2.Main.Sevice.Interfaces.UserInterfacePracktic;
import practiclesson2.Main.UserPolePracktic;

import java.util.ArrayList;

public class UserImpl implements UserInterfacePracktic {

    @Override
    public UserPolePracktic registr(String email, String password, GenderPrackticLesson genderPrackticLesson, String fullname) {
        UserPolePracktic userPolePracktic = new UserPolePracktic();
        userPolePracktic.setIdUser(GeneratorIdPracticLEsson.generatoridUser());
        userPolePracktic.setEmail(email);
        userPolePracktic.setPassword(password);
        userPolePracktic.setFullName(fullname);
        userPolePracktic.setGender(genderPrackticLesson);
        BdPracticTask2.arrayListUsers.add(userPolePracktic);
        return userPolePracktic;
    }

    @Override
    public UserPolePracktic loginPrackticLesson(String email, String password) {
        for (int i = 0; i < BdPracticTask2.arrayListUsers.size(); i++) {
            if (email.equalsIgnoreCase(BdPracticTask2.arrayListUsers.get(i).getEmail()) && password.equalsIgnoreCase(BdPracticTask2.arrayListUsers.get(i).getPassword())) {
                return BdPracticTask2.arrayListUsers.get(i);
            }
        }return null;
    }

    @Override
    public UserPolePracktic getUserByEmail(String email) {
        for (int i = 0; i < BdPracticTask2.arrayListUsers.size(); i++) {
            if (email.equalsIgnoreCase(BdPracticTask2.arrayListUsers.get(i).getEmail())){
                return BdPracticTask2.arrayListUsers.get(i);
            }
        }return null;
    }
    @Override
    public void getallusers() {
        System.out.println(BdPracticTask2.arrayListUsers);
    }

    @Override
    public boolean unical(String email) {
        return false;
    }
}
