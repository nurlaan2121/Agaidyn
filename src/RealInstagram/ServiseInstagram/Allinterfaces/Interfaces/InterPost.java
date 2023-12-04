package RealInstagram.ServiseInstagram.Allinterfaces.Interfaces;

import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;
import taskEkzamen.User;

public interface InterPost {
    UserPole addnewPost(UserPole userPole,PostPole[] postPoles);
    PostPole createPost(PostPole postPole);
    PostPole [] deletePost(PostPole [] postPoles,PostPole postPole);
    void seeAllPostMyPost(UserPole userPole,PostPole [] postPoles);
    void recamendation();
    void randomPOST(UserPole userPole);
}
