package practiclesson2.Main.Sevice;

import practiclesson2.Main.BdPracticTask2;
import practiclesson2.Main.PostPolePractic;
import practiclesson2.Main.Sevice.Interfaces.PostInterdfacePrakctic;
import practiclesson2.Main.UserPolePracktic;

import java.util.ArrayList;
import java.util.Objects;

public class PostImpl implements PostInterdfacePrakctic {
    @Override
    public UserPolePracktic addPostToUser(UserPolePracktic userPolePracktic,String dicription,String url) {
        PostPolePractic postPolePractic = new PostPolePractic();
        postPolePractic.setIdPost(GeneratorIdPracticLEsson.generatoridPost());
        postPolePractic.setDickrpiption(dicription);
        postPolePractic.setUrlImage(url);
        userPolePracktic.setPosts(postPolePractic);
        return userPolePracktic;
    }

    @Override
    public UserPolePracktic deletePostById(UserPolePracktic userPolePracktic,Long idforDelete) {
        for (int i = 0; i < userPolePracktic.getPosts().size(); i++) {
            if (Objects.equals(idforDelete, userPolePracktic.getPosts().get(i).getIdPost())){
                userPolePracktic.getPosts().remove(i);
                return userPolePracktic;
            }
        }return null;
    }

    @Override
    public ArrayList<PostPolePractic> getpostsByUserId(Long id) {
        for (int i = 0; i < BdPracticTask2.arrayListUsers.size(); i++) {
            if (id.equals(BdPracticTask2.arrayListUsers.get(i).getIdUser())){
                return BdPracticTask2.arrayListUsers.get(i).getPosts();
            }
        }return null;
    }
}
