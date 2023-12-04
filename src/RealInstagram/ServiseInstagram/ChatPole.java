package RealInstagram.ServiseInstagram;

public class ChatPole {
    private UserPole user1;
    private UserPole user2;
    private String chat;

    public ChatPole() {
    }

    public ChatPole(UserPole user1, UserPole user2, String messege) {
        this.user1 = user1;
        this.user2 = user2;
        this.chat = messege;
    }

    public UserPole getUser1() {
        return user1;
    }

    public void setUser1(UserPole user1) {
        this.user1 = user1;
    }

    public UserPole getUser2() {
        return user2;
    }

    public void setUser2(UserPole user2) {
        this.user2 = user2;
    }

    public String getMessege() {
        return chat;
    }

    public void setMessege(String messege) {
        this.chat = messege;
    }

    @Override
    public String toString() {
        return "ChatPole{" +
                " You   " +
                user2.getLogin() +
                ", chat='" + chat + '\'' +
                '}';
    }
    public void seechat(UserPole currentUser, UserPole user2) {
        int currentUserChatLength = currentUser.getChatPolesketken().length;
        int user2ChatLength = user2.getChatPolesketken().length;

        int maxLength = Math.max(currentUserChatLength, user2ChatLength);

        for (int i = 0; i < maxLength; i++) {
            String currentUserMessage = (i < currentUserChatLength) ? currentUser.getChatPolesketken()[i].getMessege() : "";
            String user2Message = (i < user2ChatLength) ? user2.getChatPolesketken()[i].getMessege() : "";

            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("| " + currentUser.getLogin() + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + user2.getLogin() + " |");
            System.out.println("| " + currentUserMessage + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t| " + user2Message + " |");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");

        }
    }

}
