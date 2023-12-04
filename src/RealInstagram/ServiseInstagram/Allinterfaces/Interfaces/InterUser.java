package RealInstagram.ServiseInstagram.Allinterfaces.Interfaces;

import RealInstagram.ServiseInstagram.UserPole;
import taskEkzamen.User;

public interface InterUser{
    UserPole[] addnewUser();
    UserPole loginproverka();
    UserPole createInfo(UserPole userPole);
    UserPole[] deleteMyaccaunt(UserPole userPole);
    void seemyProfile(UserPole userPole);
    void seeAllPostsInbaza(UserPole userPole);
    UserPole searchAccaunt(UserPole userPole);
}
