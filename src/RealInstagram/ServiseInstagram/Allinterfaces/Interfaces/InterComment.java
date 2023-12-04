package RealInstagram.ServiseInstagram.Allinterfaces.Interfaces;

import RealInstagram.ServiseInstagram.CommentPole;
import RealInstagram.ServiseInstagram.PostPole;
import RealInstagram.ServiseInstagram.UserPole;

public interface InterComment {
    PostPole addcommentToPost(UserPole userPole, PostPole postPole, CommentPole [] commentPoles);
    PostPole createcomment(CommentPole commentPole,PostPole postPole);
}
