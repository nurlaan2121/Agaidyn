package carBron;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Managment {

    User[] users = new User[0];


    Driver driver = new Driver("Erlan", "Niazov", "+996770125689", 25);
    Driver driver2 = new Driver("Karim", "Karimov", "+996770415285", 21);
    Driver driver3 = new Driver("Timur", "Mederbekov", "+996770235688", 29);
    Driver driver4 = new Driver("Erzat", "Lasymaliev", "+996772457744", 26);
    Driver driver5 = new Driver("Ermek", "Esenturov", "+996771451296", 27);
    Driver driver6 = new Driver("Denis", "Ikramov", "+996770154574", 20);
    Driver driver7 = new Driver("Mairambek", "Teshebaev", "+996771124556", 21);
    Driver driver8 = new Driver("Amantur", "Usonov", "+996777481548", 35);
    Driver driver9 = new Driver("Kasym", "Turdaliev", "+996778594815", 41);
    Driver driver10 = new Driver("Esen", "Emilov", "+996778784545", 27);
    Driver[] allDrivers = {driver, driver2, driver3, driver4, driver5, driver6, driver7, driver8, driver9, driver10};


    Car car = new Car("Mersedes", "w210 E320", 550, 1, true, driver, 0);
    Car car2 = new Car("Tayota", "Camry75", 350, 2, true, driver2, 0);
    Car car3 = new Car("Mersedes", "GLS", 300, 3, true, driver3, 0);
    Car car4 = new Car("Honda", "Accord 3", 100, 4, true, driver4, 0);
    Car car5 = new Car("Matiz", "2", 150, 5, true, driver5, 0);
    Car car6 = new Car("Audi", "S4", 250, 6, true, driver6, 0);
    Car car7 = new Car("Honda", "Fit", 150, 7, true, driver7, 0);
    Car car8 = new Car("Lexus", "570", 450, 8, true, driver8, 0);
    Car car9 = new Car("BMW", "E34", 300, 9, true, driver9, 0);
    Car car10 = new Car("BMW", "E5", 350, 10, true, driver10, 0);
    Car[] cars = {car, car2, car3, car4, car5, car6, car7, car8, car9, car10};

    @Override
    public String toString() {
        return "Managment{" +
                "users=" + Arrays.toString(users) +
                ", car=" + car +
                ", car2=" + car2 +
                ", car3=" + car3 +
                ", car4=" + car4 +
                ", car5=" + car5 +
                ", car6=" + car6 +
                ", car7=" + car7 +
                ", car8=" + car8 +
                ", car9=" + car9 +
                ", car10=" + car10 +
                ", cars=" + Arrays.toString(cars) +
                ", driver=" + driver +
                ", driver2=" + driver2 +
                ", driver3=" + driver3 +
                ", driver4=" + driver4 +
                ", driver5=" + driver5 +
                ", driver6=" + driver6 +
                ", driver7=" + driver7 +
                ", driver8=" + driver8 +
                ", driver9=" + driver9 +
                ", driver10=" + driver10 +
                ", allDrivers=" + Arrays.toString(allDrivers) +
                '}';
    }

    public void getAllCars() {
        System.out.println(Arrays.toString(cars));
    }

    public Car[] ccars() {
        return cars;
    }

    public static Car[] bronCar(Car[] cars, User user) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerINT = new Scanner(System.in);
        System.out.println("Введите айди : ");
        long idcar = scanner.nextLong();
        for (Car car1 : cars) {
            if (car1.getId() == idcar && !car1.getBar()) {
                System.out.println(car1.getName() + car1.getModel() + "К сожилению это машина уже забранирован!");
            } else if (car1.getId()== idcar && car1.getBar()) {
                System.out.println("Введите свое имя :");
                String nameBron = scanner.nextLine();
                System.out.println("Введите свое адрес :");
                String adressBron = scanner.nextLine();
                System.out.println("Введите свое телефон номер :");
                String numerBron = scanner.nextLine();
                System.out.println("За сколько часов вы бронируете: ");
                int archa = scanner.nextInt();
                double res = archa * car1.getPriceForHours();
                if (res < user.getBalance()) {
                    user.setBalance(user.getBalance() - res);
                    System.out.println("С вашего баланса : " + res + "$ потрачено!");
                    car1.setBar(false);
                    double doposle = car1.getDohod();
                    car1.setDohod(doposle + res);
                    System.out.println("Вы успешно забронировали ! Желаем вам приятной поездки! \n" +
                            "Это машина вам на :" + archa + "часов доступно!");
                    System.out.println("Ваша машина :  " + car1.getName() + "    " + car1.getModel());
                    System.out.println("Информация о вашего водителья :");
                    System.out.println("Имя: " + car1.getMingenAdam().getFirstName());
                    System.out.println("ФИО: " + car1.getMingenAdam().getLastName());
                    System.out.println("Возраст : " + car1.getMingenAdam().getAge());
                    System.out.println("Телефон номер : " + car1.getMingenAdam().getPhoneNumber());
                } else {
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scanner2 = new Scanner(System.in);
                    Scanner scanner4 = new Scanner(System.in);
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("На вашем балансе не достаточна денег что бы забранировать :\n" +
                            "Эсли вы хотите получит кридит \n" +
                            "Введите цифру  ♥1♥ \n" +
                            "А если нет\n" +
                            "Введите цифру  ♥0♥");
                    String num = scanner1.nextLine();
                    if (num.equals("1")) {
                        System.out.println("Введите сумму : ");
                        double plusSumma = scanner2.nextDouble();
                        user.setBalance(plusSumma + user.getBalance());
                        System.out.println("Успешно!\n" +
                                "Ваш текущий баланс : " + user.getBalance());
                        for (Car car2 : cars) {
                            if (car2.getId() == idcar && !car2.getBar()) {
                                System.out.println(car2.getName() + car2.getModel() + "К сожилению это машина уже забранирован!");
                            }
                            if (car2.getId() == (idcar) && car2.getBar()) {
                                System.out.println("\"Введите свое имя :\"");
                                String nameBron2 = scanner4.nextLine();
                                System.out.println("Введите свое адрес :");
                                String adressBron2 = scanner4.nextLine();
                                System.out.println("Введите свое телефон номер :");
                                String numerBron2 = scanner4.nextLine();
                                System.out.println("За сколько часов вы бронируете: ");
                                int archa2 = scanner5.nextInt();
                                double res2 = archa2 * car2.getPriceForHours();
                                if (res2 < user.getBalance()) {
                                    user.setBalance(user.getBalance() - res2);
                                    System.out.println("С вашего баланса : " + res2 + "$ потрачено!");
                                    car2.setBar(false);
                                    double doposle = car1.getDohod();
                                    car1.setDohod(doposle + res2);
                                    System.out.println("Вы успешно забронировали ! Желаем вам приятной поездки! \n" +
                                            "Это машина вам на :" + archa2 + "часов доступно!");
                                    System.out.println("Ваша машина :  " + car1.getName() + "    " + car1.getModel());
                                    System.out.println("Информация о вашего водителья :");
                                    System.out.println("Имя: " + car1.getMingenAdam().getFirstName());
                                    System.out.println("ФИО: " + car1.getMingenAdam().getLastName());
                                    System.out.println("Возраст : " + car1.getMingenAdam().getAge());
                                    System.out.println("Телефон номер : " + car1.getMingenAdam().getPhoneNumber());
                                }
                            }
                        }
                    } else System.out.println("Пополните баланс на гловном меня");
                }

            }
        }
        return cars;
    }
}
