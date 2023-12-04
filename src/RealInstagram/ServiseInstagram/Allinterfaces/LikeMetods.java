package RealInstagram.ServiseInstagram.Allinterfaces;

import RealInstagram.ServiseInstagram.Allinterfaces.Interfaces.InterLike;
import RealInstagram.ServiseInstagram.LikePole;
import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class LikeMetods implements InterLike {

    @Override
    public PostPole addlikeIkPost(PostPole postPole,UserPole userPole,LikePole[] like) {
        LikePole likePole = new LikePole();
        likePole.setLikes(0);
        likePole.setUser(userPole);
        likePole.setDateTime(ZonedDateTime.now());
        like = Arrays.copyOf(like,like.length+1);
        like[like.length-1] = likePole;
        postPole.setLikes(like);
        return postPole;
    }
    @Override
    public PostPole deleteLikeinPost(PostPole postPole,UserPole userPole,LikePole like) {
        like.setLikes(like.getLikes() - 1);
        return postPole;
    }
}
