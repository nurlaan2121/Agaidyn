package carBron;

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Scanner scannerSTR = new Scanner(System.in);
        Scanner scannerINT = new Scanner(System.in);
        User[] users = new User[0];
        Admin ad = new Admin();
        Admin[] admins = ad.getadmins();
        Managment managment = new Managment();
        Car[] cars = {};
        cars = managment.ccars();
        MAINLOOP:
        while (true) {
            System.out.println("""
                    1.Регистрация
                    2.Вход
                    0.Назад
                    """);
            String actionmain = scannerSTR.nextLine();
            switch (actionmain) {
                case "1" -> {
                    users = User.addNewUser(users);
                }
                case "2" -> {
                    if (users.length >= 1) {
                        User user = User.checLogin(users);
                        System.out.println(user.getName() + " - Добро пожаловать на BOOKINGCAR_KG!");
                        LOOP2:
                        while (true) {
                            System.out.println(STR."""
                                    1.Меню всех машин
                                    2.Забронировать
                                    3.Мой баланс
                                    4.Пополнить баланс
                                    0.Назад!
                                    """);
                            String action2 = scannerSTR.nextLine();
                            switch (action2) {
                                case "1" -> {
                                    managment.getAllCars();
                                }
                                case "2" -> {
                                    managment.getAllCars();
                                    cars = Managment.bronCar(managment.cars, user);
                                }
                                case "3" -> {
                                    System.out.println("Ваш баланс : ");
                                    System.out.println(user.getBalance());
                                }
                                case "4" -> {
                                    System.out.println("Введите сумма пополнение: ");
                                    double plusSumma = scannerINT.nextDouble();
                                    user.setBalance(plusSumma + user.getBalance());
                                }
                                case "0" -> {
                                    break LOOP2;
                                }
                            }
                        }
                    }
                }
                case "9" -> {
                    ad = Admin.checLoginAdmin(admins);
                    System.out.println("Добро пожаловать Aдмин! " + ad.getLogin());
                    LOOP2:
                    while (true) {
                        System.out.println(STR."""
                                1.Изменит меню всех машин
                                2.Доходы
                                3.Статистика
                                4.Удалит машину
                                5.Добавит машину
                                6.МЕНЮ
                                0.Назад!
                                """);
                        String actions = scannerSTR.nextLine();
                        if (actions.equalsIgnoreCase("1")) {
                            Admin.printAllCar(cars);
                            cars = Admin.createCars(cars);
                        }else if (actions.equalsIgnoreCase("2")) {

                            Admin.printDohod(cars);
                        }else if (actions.equalsIgnoreCase("3")) {

                            Admin.Statictika(cars);
                        }else if (actions.equalsIgnoreCase("4")) {

                            cars = Admin.deleteCar(cars);
                        }else if (actions.equalsIgnoreCase("5")) {
                            Admin.addCar(cars);
                            Admin.printAllCar(cars);
                        }else if (actions.equalsIgnoreCase("6")){
                            Admin.printAllCar(cars);
                        }else if (actions.equalsIgnoreCase("0")) {
                            break LOOP2;
                        }
                    }
                }
                case "0" -> {
                    break MAINLOOP;
                }

            }
        }


    }
}
