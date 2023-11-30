package lmsReal.Role;

import Chat.User;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Proverka {
    public static String rolProverka(Admin user) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Write login: ");
            String name = scanner.nextLine();
            System.out.println("Write password: ");
            String pass = scanner.nextLine();
            if (name.equalsIgnoreCase(user.getLogin()) && pass.equalsIgnoreCase(user.getPassword())) {
                return "Admin";
            }
        return "NULL";
    }

    public static Admin update(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Write login: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase(admin.getLogin())) {
                System.out.println("Write new password: ");
                String pasword = scanner.nextLine();
                admin.setPassword(pasword);
                System.out.println("Success updated password!");
                return admin;
            }
        }
    }
}
