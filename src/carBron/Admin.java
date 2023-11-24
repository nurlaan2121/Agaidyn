package carBron;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Admin extends Managment {
    private String login;
    private String password;

    public Admin() {
    }

    public Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Admin[] getadmins() {
        Admin admin = new Admin("nurlan@gmail.com", "nurlan21");
        Admin admin1 = new Admin("muktar@gmail.com", "muktar21");
        Admin admin2 = new Admin("nurkamil@gmail.com", "nurkamil21");
        return new Admin[]{admin, admin1, admin2};

    }

    public static void printLogins(User[] users) {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            System.out.println("Пользователь{" + counter++ +
                    "Имя: " + users[i].getName() + '\'' +
                    "ФИО: " + users[i].getLastName() + '\'' +
                    "Логин: " + users[i].getEmal() + '\'' +
                    "Пароль: " + users[i].getPassword() + '\'' +
                    "Возраст: " + users[i].getAge() +
                    "Баланс на счету: " + users[i].getBalance() +
                    "Пол: " + users[i].getGender().toString());
        }
    }

    public static void printAllCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Названия : " + cars[i].getName() +
                    " | Модел : " + cars[i].getModel() +
                    " | Цена на час : " + cars[i].getPriceForHours() + "$" +
                    " |  ID: " + cars[i].getId());
        }
    }

    public static Car[] createCars(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите айди машину: ");
        long id = scanner.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (id == cars[i].getId()) {
                System.out.println(cars[i]);
                System.out.println("""
                        Введите команду:
                        1.Изменить название
                        2.Изменит модель
                        3.Изменит цену на час
                        4.Изменит водилку
                        """);
                String action3 = scanner2.nextLine();
                if (action3.equalsIgnoreCase("1")) {
                    System.out.println("Write name: ");
                    cars[i].setName(new Scanner(System.in).nextLine());
                } else if (action3.equalsIgnoreCase("2")) {
                    System.out.println("Write Model: ");
                    cars[i].setModel(scanner.nextLine());
                } else if (action3.equalsIgnoreCase("3")) {
                    System.out.println("Write price for Hourse");
                    cars[i].setPriceForHours(scanner.nextDouble());
                } else if (action3.equalsIgnoreCase("4")) {
                    System.out.println("""
                                    Введите команду:
                            1.Изменить имя
                            2.Изменит ФИО
                            3.Изменит телефон номера
                            4.Изменит возраст
                            """);
                    switch (scanner.nextLine()) {
                        case "1" -> {
                            System.out.println("Write name: ");
                            cars[i].getMingenAdam().setFirstName(scanner.nextLine());
                        }
                        case "2" -> {
                            System.out.println("Write LAST name: ");
                            cars[i].getMingenAdam().setLastName(scanner.nextLine());
                        }
                        case "3" -> {
                            System.out.println("Write telephone number: ");
                            cars[i].getMingenAdam().setPhoneNumber(scanner.nextLine());
                        }
                        case "4" -> {
                            System.out.println("Write age: ");
                            cars[i].getMingenAdam().setAge(scanner.nextInt());
                        }
                        default -> System.out.println("Not command!");
                    }
                    System.out.println("Успешно изменили! ");
                    return cars;
                }
            }
        }
        return cars;
    }

    public static Admin checLoginAdmin(Admin[] admins) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите почту: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        for (Admin user : admins) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        System.out.println("Вы не вверно ввели почту или пароль");
        return checLoginAdmin(admins);
    }

    public static void printDohod(Car[] cars) {
        double dohot = 0;
        for (int i = 0; i < cars.length; i++) {
            dohot += cars[i].getDohod();
        }
        System.out.println("Доход: " + dohot);

    }

    public static Car[] deleteCar(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write id car for delete");
        long id = scanner.nextLong();
        for (int i = 0; i < cars.length; i++) {
            if (id == (cars[i].getId())) {
                for (int j = i; j < cars.length - 1; j++) {
                    cars[j] = cars[j + 1];
                }
            }
        }
        return Arrays.copyOf(cars, cars.length - 1);
    }

    public static Car[] addCar(Car[] cars) {
        Scanner scanerSTR = new Scanner(System.in);
        Scanner scanerInt = new Scanner(System.in);
        Car car1 = new Car();
        Driver driver1 = new Driver();
        System.out.println("Write name: ");
        car1.setName(scanerSTR.nextLine());
        System.out.println("Write model: ");
        car1.setModel(scanerSTR.nextLine());
        System.out.println("Write price in Hour :");
        car1.setPriceForHours(scanerInt.nextDouble());
        car1.setId(GeneratorId.generatorMyId());
        car1.setBar(true);
        car1.setDohod(0);
        System.out.println("Write name driver: ");
        driver1.setFirstName(scanerSTR.nextLine());
        System.out.println("Write last name driver: ");
        driver1.setLastName(scanerSTR.nextLine());
        System.out.println("Write telephone number: ");
        driver1.setPhoneNumber(scanerSTR.nextLine());
        System.out.println("Write age: ");
        driver1.setAge(scanerInt.nextInt());
        car1.setMingenAdam(driver1);
        cars = Arrays.copyOf(cars, cars.length + 1);
        cars[cars.length - 1] = car1;
        return cars;
    }

    public static void Statictika(Car[] cars) {
        Car car1 = new Car();
        for (int i = 0; i < cars.length; i++) {
            for (int j = i; j < cars.length - 1; j++) {
                if (cars[j].getDohod() < cars[j +1].getDohod()) {
                    car1 = cars[i];
                    cars[i] = cars[j + 1];
                    cars[j+1] = car1;
                }
            }
            System.out.println(i+1 + ")Топ | " + " Названия : " + cars[i].getName() + " | Цена на час: " + cars[i].getPriceForHours() + " | Доход: " + cars[i].getDohod() + "\n");
        }

    }

}
