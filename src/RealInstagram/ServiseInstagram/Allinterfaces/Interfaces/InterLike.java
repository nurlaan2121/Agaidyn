package RealInstagram.ServiseInstagram.Allinterfaces.Interfaces;

import RealInstagram.ServiseInstagram.LikePole;
import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;

public interface InterLike {
    PostPole addlikeIkPost(PostPole postPole, UserPole userPole, LikePole [] likePoles);
    PostPole deleteLikeinPost(PostPole postPole,UserPole userPole,LikePole like);
}
