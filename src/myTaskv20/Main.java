package myTaskv20;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sozdor sozdor = new Sozdor("ы", true);
        Sozdor sozdor2 = new Sozdor("с", true);
        Sozdor sozdor3 = new Sozdor("с", true);
        Sozdor sozdor4 = new Sozdor("ы", true);
        Sozdor sozdor5 = new Sozdor("к", true);
        Sozdor sozdor6 = new Sozdor("к", true);
        Sozdor sozdor7 = new Sozdor("о", true);
        Sozdor sozdor8 = new Sozdor("л", true);
        String[] str = {"*", "*", "*", "*", "*", "*", "*", "*"};
        String[] str2 = {"ы", "с", "с", "ы", "к", "к", "о", "л"};

        Sozdor[] allsoz = {sozdor, sozdor2, sozdor3, sozdor4, sozdor5, sozdor6,sozdor7,sozdor8};
        boolean popytka = true;
        int counter = 3;
        int ball = 0;
        System.out.println("    1)Ал жер тууралуу таарыхта турлуу аттар сакталып калган! \nбирок азыркы учурда ал жерди биз бир эле ат менен айтып жана сыймыктанып келебиз!!");
        while (popytka) {
            System.out.println("Сиздин жобузун");
            System.out.println("******");
            String soz = scanner.nextLine();
            if (!uu(soz, str, allsoz)) {
                counter--;
                if (counter==1){
                    System.out.println("    2)Ал жерди даңазалап акындар ыр жазышкан. Жазуучулар тамшандырган көлөмдүү китептерди, уламыш, жомокторду жаратышкан.");
                }
                System.out.println("Сизде  :" + counter + " мумкунчулук калды");
                if (ball >= 30) {
                    try {
                        System.out.println("сизде" + ball + "балл бар эгер колдонуп бир тамганы ачууну каалсаныз анда (1)ди басыныз\nЭгер каалабасныз тамга таабын!");
                        int num = scanner.nextInt();
                        if (num == 1) {
                            random(str, allsoz, ball);
                            System.out.println("Ийгиликтуу!" +
                                    "Сизден 30 балл кемитилди");
                            ball -= 30;
                        }
                        counter++;
                    }catch (InputMismatchException e){
                        System.out.println("SAN JAZ!");
                    }
                }
                if (counter == 0) {
                    System.out.println("КИЙИНКИ ОЮНДА ЖЕНИП КАЛЫШЫНЫЗ МУМКУН КАПА БОЛБОНУЗ");
                    System.out.println(Arrays.toString(str2));
                    popytka = false;
                } else if (Arrays.equals(str2, str)) {
                    System.out.println("ТУУРА");
                    System.out.println(Arrays.toString(str));
                    popytka = false;
                }
            } else {
                ball += 10;
                System.out.println("Сизге 10 бал берилди");
                if (Arrays.equals(str2, str)) {
                    System.out.println("УРАА");
                    System.out.println(Arrays.toString(str));
                    popytka = false;
                }
            }
        }
    }

    public static boolean uu(String soz, String[] str, Sozdor[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (soz.equalsIgnoreCase(chars[i].getSoz()) && chars[i].isOpen()) {
                System.out.println("Азаматсыз!");
                System.out.println(chars[i].getSoz());
                str[i] = soz;
                chars[i].setOpen(false);
                System.out.println(Arrays.toString(str));
                return true;
            }
        }
        return false;
    }

    public static void random(String[] str, Sozdor[] chars, int ball) {
        int[] numbers = {-2, -2, -2, -2, -2, -2, -2, -2};
        Random random = new Random();
        if (chars[0].isOpen()) {
            numbers[0] = 1;
        }
        if (chars[1].isOpen()) {
            numbers[1] = 2;
        }
        if (chars[2].isOpen()) {
            numbers[2] = 3;
        }
        if (chars[3].isOpen()) {
            numbers[3] = 4;
        }
        if (chars[4].isOpen()) {
            numbers[4] = 5;
        }
        if (chars[5].isOpen()) {
            numbers[5] = 6;
        }
        if (chars[6].isOpen()) {
            numbers[6] = 7;
        }
        if (chars[7].isOpen()) {
            numbers[7] = 8;
        }
        while (true){
            int res = random.nextInt(0,numbers.length);
            int randomnumber = numbers[res];
            if (randomnumber == 1 && chars[0].isOpen()) {
                str[0] = "ы";
                chars[0].setOpen(false);
                break;
            } else if (randomnumber == 2 && chars[1].isOpen()) {
                str[1] = "с";
                chars[1].setOpen(false);
                break;
            } else if (randomnumber == 3 && chars[2].isOpen()) {
                str[2] = "с";
                chars[2].setOpen(false);
                break;
            } else if (randomnumber == 4 && chars[3].isOpen()) {
                str[3] = "ы";
                chars[3].setOpen(false);
                break;
            } else if (randomnumber == 5 && chars[4].isOpen()) {
                str[4] = "к";
                chars[4].setOpen(false);
                break;
            } else if (randomnumber == 6 && chars[5].isOpen()) {
                str[5] = "к";
                chars[5].setOpen(false);
                break;
            } else if (randomnumber == 7 && chars[6].isOpen()) {
                str[6] = "о";
                chars[6].setOpen(false);
                break;
            } else if (randomnumber == 8 && chars[7].isOpen()) {
                str[7] = "л";
                chars[7].setOpen(false);
                break;
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
