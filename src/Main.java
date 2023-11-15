import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        int counteratka = -1;
        User login = new User();
        User[] massiveLogin = new User[0];
        int counterLogin = 0, allProduct = 0;
        Book book = new Book();
        Book[] books = new Book[0];
        int conterBook = 0;
        Elektronic elektronic = new Elektronic();
        Elektronic[] elektronics = new Elektronic[0];
        int counterElctronic = 0;
        Product[] products = new Product[0];
        int conterProduct = 0;
        System.out.println("Welcome my store!\uD83E\uDD70");
        while (true) {
            System.out.println("♥1♥ Sign in\uD83D\uDCE5" +
                    "\n♥2♥  Sign up\uD83C\uDFC3\uD83C\uDFFB\n" +
                    "♥3♥ Logout❌");
            String action = scannerStr.nextLine();
            if (action.equalsIgnoreCase("1") || action.equalsIgnoreCase("sigin")) {
                massiveLogin = login.getnewLogin(massiveLogin);
                counterLogin++;
                counteratka++;
                login.getinfo2(massiveLogin, counterLogin);
            } else if (action.equalsIgnoreCase("2") && counterLogin > 0) {
                System.out.println("♥2♥  Sigin up \uD83C\uDFC3\uD83C\uDFFB\n");
                if (login.proverka(massiveLogin, counterLogin).equalsIgnoreCase("ok")) {
                    System.out.println("Welcome!!! :" + massiveLogin[counteratka].getName());

                    while (true) {
                        System.out.println("""
                                ♥0♥ Log out ❌
                                ♥1♥ Add new pruduct ➕ || 📖 ||💻 || 📱
                                ♥2♥ Get all product 👀 ✅
                                ♥3♥ Get all book 👀 📖
                                ♥4♥ Get all electronik 👀 💻 📱
                                ♥5♥ Delete pruduct!
                                """);
                        String actionmain = scannerStr.nextLine();
                        if (actionmain.equalsIgnoreCase("1") || actionmain.equalsIgnoreCase("add")) {
                            System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");
                            String kategor = scannerStr.nextLine();
                            if (kategor.equalsIgnoreCase("1") || kategor.equalsIgnoreCase("electronic")) {
                                elektronics = elektronic.addNewproductElecronica(products, conterProduct, counterElctronic, elektronics);
                                allProduct++;
                                conterProduct++;
                                counterElctronic++;
                                elektronic.ingoElectric(elektronics);
                            } else if (kategor.equalsIgnoreCase("2") || kategor.equalsIgnoreCase("book")) {
                                books = book.addNewproductBook(products, conterProduct, conterBook, books);
                                allProduct++;
                                conterProduct++;
                                conterBook++;
                                book.infoBook(books);
                            } else System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");

                        } else if (actionmain.equalsIgnoreCase("2") && allProduct > 0) {
                            elektronic.ingoElectric(elektronics);
                            book.infoBook(books);
                        } else if (actionmain.equalsIgnoreCase("3") && allProduct > 0) {
                            book.infoBook(books);
                        } else if (actionmain.equalsIgnoreCase("4") && allProduct > 0) {
                            elektronic.ingoElectric(elektronics);
                        } else if (actionmain.equalsIgnoreCase("5") && allProduct>0) {

                            System.out.println("Choice comand delete : ♥1♥ Remove one by one  || ♥2♥ Many");
                            String udalitlomand = scannerStr.nextLine();
                            switch (udalitlomand) {
                                case "1": {
                                    System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");
                                    String num = scannerStr.nextLine();
                                    if (num.equalsIgnoreCase("1")) {
                                        elektronics = elektronic.deleteProcktelc(elektronics, counterElctronic);
                                        counterElctronic--;
                                        allProduct--;
                                        System.out.println("SUCCESFLEI");
                                        break;
                                    } else if (num.equalsIgnoreCase("2")) {
                                        books = book.deleteBook(books, conterBook);
                                        conterBook--;
                                        allProduct--;
                                        System.out.println("Succesfly!");
                                    }
                                }
                                case "2": {
                                    Scanner scanner = new Scanner(System.in);
                                    System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");
                                    String num = scannerStr.nextLine();
                                    if (num.equalsIgnoreCase("1")) {
                                        System.out.println("Write id CHEREZ PROBEL! : ✉️");
                                        String[] idsToDelete = scanner.nextLine().split(" ");
                                        int san = idsToDelete.length;
                                        counterElctronic -= san - 1;
                                        allProduct-=san-1;
                                        elektronics = elektronic.deleteProcall(counterElctronic, elektronics, idsToDelete);
                                    } else if (num.equalsIgnoreCase("2")) {
                                        System.out.println("Write id CHEREZ PROBEL! : ✉️");
                                        String[] idsToDelete = scanner.nextLine().split(" ");
                                        int san = idsToDelete.length;
                                        conterBook -= san - 1;
                                        allProduct=-san-1;
                                        books = book.deleteProcallBook(conterBook, books, idsToDelete);

                                    } else System.out.println("Myndai kategoria jok!");
                                    break;
                                }
                                default:
                                    System.out.println("Not command!");
                            }
                        } else if (actionmain.equalsIgnoreCase("0") || actionmain.equalsIgnoreCase("Log out")) {
                            System.out.println("Log out succesfalei!");
                            break;
                        } else System.out.println("Not command");
                    }
                } else System.out.println("KATA MAIGE KELDI");
            } else if (action.equalsIgnoreCase("3")) {
                break;
            } else {
                System.out.println("Not command!");
            }
        }
    }
}