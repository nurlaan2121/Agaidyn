package carBron;

import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String name;
    private String lastName;
    private String emal;
    private String password;
    private int age;
    private double balance;
    private Gender gender;

    public User() {
    }

    public User(String name, String lastName, int age, double balance, String emal, String password, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
        this.emal = emal;
        this.password = password;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmal() {
        return emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emal='" + emal + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", gender=" + gender +
                '}';
    }

    public static User[] addNewUser(User[] users) {
        User user = new User();
        Scanner scannerSTR = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Введите имя: ");
        while (!scannerSTR.hasNextLine()) {
            System.out.println("Введите имя: ");
            scannerSTR.next();

        }
        String naame = scannerSTR.nextLine();
        user.setName(naame);
        while (true) {
            System.out.println("Введите ФИО: ");
            String name = scannerSTR.nextLine();
            if (name.length() > 4) {
                user.setLastName(name);
                break;
            }
        }
        while (true) {
            System.out.println("Сколько вам лет: ");
            while (!scannerInt.hasNextInt()) {
                System.out.println("Сколько вам лет: ");
                scannerInt.next();
            }
            int name2 = scannerInt.nextInt();
            if (name2 > 18 && name2 < 100) {
                user.setAge(name2);
                break;
            }
        }
        while (true) {
            System.out.println("Write genger: ");
            String gender = scannerSTR.nextLine();
            if (gender.equalsIgnoreCase(Gender.MALE.toString())) {
                user.setGender(Gender.MALE);
                break;
            } else if (gender.toUpperCase().equalsIgnoreCase(Gender.FAMALE.toString())) {
                user.setGender(Gender.FAMALE);
                break;
            }else System.out.println("Male||Famale");
        }
        while (true) {
            System.out.println("Введите почту : (example@gmail.com)");
            String name = scannerSTR.nextLine();
            if (name.endsWith("@gmail.com")) {
                user.setEmal(name);
                break;
            }
        }
        while (true) {
            System.out.println("Введите пароль :");
            String name = scannerSTR.nextLine();
            if (name.length() > 3) {
                user.setPassword(name);
                break;
            } else System.out.println("Введите пароль :");
        }
        System.out.println("Какую сумму хотите перевести на баланс  : ");
        while (!scannerInt.hasNextInt()) {
            System.out.println("Введите сумму: ");
            scannerInt.next();
        }
        int balance = scannerInt.nextInt();
        user.setBalance(balance);

        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
        return users;
    }

    public static User checLogin(User[] users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите почту: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String passwo = scanner.nextLine();
        for (User user : users) {
            if (user.getEmal().equals(login) && user.getPassword().equals(passwo)) {
                return user;
            }
        }
        System.out.println("Вы не вверно ввели почту или пароль");
        return checLogin(users);

    }
}
