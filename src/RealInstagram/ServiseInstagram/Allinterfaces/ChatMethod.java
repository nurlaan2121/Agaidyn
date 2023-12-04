package RealInstagram.ServiseInstagram.Allinterfaces;

import Chat.Chats;
import Chat.User;
import RealInstagram.DataBazaInstagram;
import RealInstagram.ServiseInstagram.Allinterfaces.Interfaces.InterChat;
import RealInstagram.ServiseInstagram.ChatPole;
import RealInstagram.ServiseInstagram.UserPole;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChatMethod implements InterChat {

    @Override
    public UserPole addnewChat(UserPole userPole, ChatPole[] chatPoles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write login for sent messsege");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBazaInstagram.user.length; i++) {
            ChatPole chatPole = new ChatPole();
            if (name.equalsIgnoreCase(DataBazaInstagram.user[i].getLogin())) {
                chatPole.setUser1(userPole);
                chatPole.setUser2(DataBazaInstagram.user[i]);
                System.out.println("Write messege : ");
                String messege = scanner.nextLine();
                chatPole.setMessege(messege);
                chatPoles = Arrays.copyOf(chatPoles, chatPoles.length + 1);
                chatPoles[chatPoles.length - 1] = chatPole;
                userPole.setChatPolesketken(chatPoles);
                chatPole.seechat(userPole,DataBazaInstagram.user[i]);
                System.out.println("Success");
                return userPole;
            }
        }
        return null;
    }

}
