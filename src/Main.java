import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        User login = new User();
        User[] massiveLogin = new User[100];
        int counterLogin = 0, allProduct = 0;
        Book book = new Book();
        Book[] books = new Book[100];
        int conterBook = 0;
        Elektronic elektronic = new Elektronic();
        Elektronic[] elektronics = new Elektronic[100];
        int counterElctronic = 0;
        Product product = new Product();
        Product[] products = new Product[100];
        int conterProduct = 0;
        System.out.println("Welcome my store!\uD83E\uDD70");
        while (true) {System.out.println("♥1♥ Sigin\uD83D\uDCE5" +
                    "\n♥2♥  Sigin up\uD83C\uDFC3\uD83C\uDFFB\n" +
                    "♥3♥ Logout❌");
            String action = scannerStr.nextLine();
            if (action.equalsIgnoreCase("1")) {
                login.getnewLogin(massiveLogin, counterLogin);
                counterLogin++;
                login.getinfo2(massiveLogin, counterLogin);
            } else if (action.equalsIgnoreCase("2")) {
                System.out.println("♥2♥  Sigin up \uD83C\uDFC3\uD83C\uDFFB\n");

                if (login.proverka(massiveLogin, counterLogin).equalsIgnoreCase("ok")) {
                    System.out.println("Welcome!!! :" + massiveLogin[0].getName());
//
                    while (true) {
                        System.out.println("""
                                ♥0♥ Log out ❌
                                ♥1♥ Add new pruduct ➕ || 📖 ||💻 || 📱
                                ♥2♥ Get all product 👀 ✅
                                ♥3♥ Get all book 👀 📖
                                ♥4♥ Get all electronik 👀 💻 📱
                                """);
                        String actionmain = scannerStr.nextLine();
                        if (actionmain.equalsIgnoreCase("1")) {
                            System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");
                            String kategor = scannerStr.nextLine();
                            if (kategor.equalsIgnoreCase("1")) {
                                product.addNewproductElecronica(products, conterProduct, counterElctronic, elektronics);
                                allProduct++;
                                conterProduct++;
                                counterElctronic++;
                                elektronic.ingoElectric(elektronics, counterElctronic);

                            } else if (kategor.equalsIgnoreCase("2")) {
                                product.addNewproductBook(products, conterProduct, conterBook, books);
                                allProduct++;
                                conterProduct++;
                                conterBook++;
                                book.infoBook(books, conterBook);
                            } else System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");

                        } else if (actionmain.equalsIgnoreCase("2") && allProduct>0) {
                            elektronic.ingoElectric(elektronics, counterElctronic);
                            book.infoBook(books, conterBook);

                        } else if (actionmain.equalsIgnoreCase("3") && allProduct>0) {
                            book.infoBook(books, conterBook);
                        } else if (actionmain.equalsIgnoreCase("4") && allProduct>0) {
                            elektronic.ingoElectric(elektronics, counterElctronic);
                        } else if (actionmain.equalsIgnoreCase("0")) {
                            System.out.println("Log out succesfalei!");
                            break;
                        } else System.out.println("Not command");
                    }

                } else System.out.println("KATA MAIGE KELDI");
            } else if (action.equalsIgnoreCase("3")) {
                break;
            } else if (action.equalsIgnoreCase(" ")) {
                login.getinfo2(massiveLogin, counterLogin);
            }
        }
    }
}