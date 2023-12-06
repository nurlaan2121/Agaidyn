package practiclesson2.Main.Sevice.Interfaces;

import RealInstagram.ServiseInstagram.PostPole;
import practiclesson2.Main.PostPolePractic;
import practiclesson2.Main.UserPolePracktic;

import java.util.ArrayList;

public interface PostInterdfacePrakctic {
    UserPolePracktic addPostToUser(UserPolePracktic userPolePracktic,String dicription,String url);
    UserPolePracktic deletePostById(UserPolePracktic userPolePracktic,Long idforDelete);
    ArrayList<PostPolePractic> getpostsByUserId(Long id);

}
