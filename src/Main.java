import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        int counteratka = -1;
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
        while (true) {
            System.out.println("♥1♥ Sigin\uD83D\uDCE5" +
                    "\n♥2♥  Sigin up\uD83C\uDFC3\uD83C\uDFFB\n" +
                    "♥3♥ Logout❌");
            String action = scannerStr.nextLine();
            if (action.equalsIgnoreCase("1")||action.equalsIgnoreCase("sigin")) {
                login.getnewLogin(massiveLogin, counterLogin);
                counterLogin++;
                counteratka++;
                login.getinfo2(massiveLogin, counterLogin);
            } else if (action.equalsIgnoreCase("2") && counterLogin>0) {
                System.out.println("♥2♥  Sigin up \uD83C\uDFC3\uD83C\uDFFB\n");
                if (login.proverka(massiveLogin, counterLogin).equalsIgnoreCase("ok")) {
                    System.out.println("Welcome!!! :" + massiveLogin[counteratka].getName());
//
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
                                product.addNewproductElecronica(products, conterProduct, counterElctronic, elektronics);
                                allProduct++;
                                conterProduct++;
                                counterElctronic++;
                                elektronic.ingoElectric(elektronics, counterElctronic);

                            } else if (kategor.equalsIgnoreCase("2")||kategor.equalsIgnoreCase("book")) {
                                product.addNewproductBook(products, conterProduct, conterBook, books);
                                allProduct++;
                                conterProduct++;
                                conterBook++;
                                book.infoBook(books, conterBook);
                            } else System.out.println("  Kategories:  ♥1♥ Elertronic  💻 📱 | ♥2♥ Books 📖");

                        } else if (actionmain.equalsIgnoreCase("2") && allProduct > 0) {
                            elektronic.ingoElectric(elektronics, counterElctronic);
                            book.infoBook(books, conterBook);

                        } else if (actionmain.equalsIgnoreCase("3") && allProduct > 0) {
                            book.infoBook(books, conterBook);
                        } else if (actionmain.equalsIgnoreCase("4") && allProduct > 0) {
                            elektronic.ingoElectric(elektronics, counterElctronic);
                        } else if (actionmain.equalsIgnoreCase("5")) {
                            System.out.println("Choice comand delete : ♥1♥ Remove one by one  || ♥2♥ Many");
                            String udalitlomand = scannerStr.nextLine();
                            switch (udalitlomand) {
                                case "1": {
                                    if (Product.deleteProckt(products, conterProduct).equalsIgnoreCase("ok")) {
                                        System.out.println("SUCCESFLEI");
                                        break;
                                    }
                                }
                                case "2":{
                                    Product.deleteProckt(conterProduct,products);
                                        break;
                                } default:
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
            } else  {
                System.out.println("Not command!");
            }
        }
    }
}