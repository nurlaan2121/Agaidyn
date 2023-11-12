import java.util.Scanner;

public class User {
    private String name;
    private String lastName;
    private String login;
    private String padword;

    public User() {
    }

    public User(String name, String lastName, String login, String padword) {
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.padword = padword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPadword() {
        return padword;
    }

    public void setPadword(String padword) {
        this.padword = padword;
    }

    public void getnewLogin(User[] login, int counter) {
        String r = "!";
        Scanner scannerStr = new Scanner(System.in);
        for (int i = counter - 1; i < counter; i++) {
            User login1 = new User();
            System.out.print(" 1) Write name: \uD83E\uDD35\u200D♂\uFE0F");

            while (true) {
                String name = scannerStr.nextLine();
                if (name.length() >= r.length()) {
                    login1.setName(name);
                    break;
                } else {
                    System.out.print(" 1) Write name: \uD83E\uDD35\u200D♂\uFE0F");
                }
            }
            System.out.print(" 2) Write Last name: \uD83E\uDD35\u200D♂\uFE0F");
            while (true) {
                String lastnamee = scannerStr.nextLine();
                if (lastnamee.length() >= r.length()) {
                    login1.setLastName(lastnamee);
                    break;
                } else {
                    System.out.print(" 2) Write Last name: \uD83E\uDD35\u200D♂\uFE0F");
                }
            }

            System.out.print(" 3) Write Login (example@gmail.com) : ✉\uFE0F ");

            while (true) {
                String loginuser = scannerStr.nextLine();
                if (loginuser.endsWith("@gmail.com")) {
                    login1.setLogin(loginuser);
                    break;
                } else {
                    System.out.println("Write Login (example@gmail.com) ♥JAZZ CHYRAGYM♥: ✉\uFE0F");
                }
            }
            System.out.print(" 4) Write passwort (password > 4simvola) : \uD83D\uDD11");
            String oggran = "!!!";
            while (true) {
                String password = scannerStr.nextLine();
                if (password.length() > oggran.length()) {
                    login1.setPadword(password);
                    break;
                } else {
                    System.out.print(" 4) Write passwort (password > 4simvola) : ! ♥ Chyragym parol jazz!♥ \uD83D\uDD11");
                }
            }
            login[counter] = login1;

        }

    }

    public String proverka(User[] users, int counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Login (example@gmail.com) :  ✉\uFE0F");
        String log = scanner.nextLine();
        for (int i = 0; i < counter; i++) {
            if (users[i].getLogin().equalsIgnoreCase(log)) {
                System.out.println("Write password!:  \uD83D\uDD11");
                String par = scanner.nextLine();
                if (users[i].getPadword().equalsIgnoreCase(par)) {
                    return "ok";
                } else System.out.println("Password kata! \uD83D\uDD11");
            }
        }
        return "wef";
    }

    public void getinfo2(User[] logins, int counter) {
        for (int i = 0; i < counter; i++) {

            System.out.println("Login:  {" +
                    "  name:'" + logins[i].getName() + '\'' +
                    " lastName:'" + logins[i].getLastName() + '\'' +
                    " login:'" + logins[i].getLogin() + '\'' +
                    " padword:'" + logins[i].getPadword() + '\'' +
                    '}');

        }

    }

}