import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Book extends Product {
    private String avtorFullname;


    public Book() {
    }

    @Override
    public Product[] addNewproductElecronica(Product[] products, int counter, int counterelectron, Elektronic[] elektronics) {

        return products;
    }

    @Override
    public Elektronic[] deleteProcktelc(Elektronic[] products, int counter) {
        return new Elektronic[0];
    }

    public Book(String avtorFullname) {
        this.avtorFullname = avtorFullname;
    }

    public Book(String nameProduct, String descriptionProduct, int priceProduct, LocalDate createdaddProduct, String avtorFullname) {
        super(nameProduct, descriptionProduct, priceProduct, createdaddProduct);
        this.avtorFullname = avtorFullname;
    }

    public String getAvtorFullname() {
        return avtorFullname;
    }

    public void setAvtorFullname(String avtorFullname) {
        this.avtorFullname = avtorFullname;
    }

    @Override
    public Book[] addNewproductBook(Product[] products, int counter, int counterBok, Book[] books) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        Book[] newPruducct = Arrays.copyOf(books, books.length + 1);
        Product [] allproduckt = Arrays.copyOf(books, books.length + 1);
        Book book1 = new Book();
        book1.setIdProduct(GeneretorId.generetator());
        System.out.print(" 1) Write name book: \uD83D\uDCD6 ");
        while (true) {
            String name = scannerStr.nextLine();
            if (Pustoiproverka.proverka(name).equalsIgnoreCase("ok")) {
                book1.setNameProduct(name);
                break;
            } else System.out.print(" 1) Write name book: \uD83D\uDCD6 ");
        }
        System.out.print(" 2) Write  aftor  book ull name: \uD83D\uDCD6 \uD83E\uDD35\u200D♂\uFE0F   ✍\uD83C\uDFFB");
        while (true) {
            String nameavtor = scannerStr.nextLine();
            if (Pustoiproverka.proverkaAvtora(nameavtor).equalsIgnoreCase("ok")) {
                book1.setAvtorFullname(nameavtor);
                break;
            } else
                System.out.print(" 2) Write  aftor  book ull name: \uD83D\uDCD6 \uD83E\uDD35\u200D♂\uFE0F   ✍\uD83C\uDFFB");

        }
        System.out.print(" 3) Write opisanie product: ✍\uD83C\uDFFB ");
        while (true) {
            String opisamie = scannerStr.nextLine();
            if (Pustoiproverka.proverka(opisamie).equalsIgnoreCase("ok")) {
                book1.setDescriptionProduct(opisamie);
                break;
            } else System.out.print(" 3) Write opisanie product: ✍\uD83C\uDFFB ");
        }
        System.out.print(" 4) Write price product :  \uD83D\uDCB2");
        while (true) {
            String price = scannerStr.nextLine();
            if (price.contains("1") || price.contains("2") || price.contains("3") || price.contains("4") || price.contains("5") || price.contains("6") || price.contains("7") || price.contains("8") || price.contains("9") || price.contains("0")) {
                int sam = Integer.parseInt(price);
                book1.setPriceProduct(BigDecimal.valueOf(sam));
                break;
            } else System.out.print(" 4) Write price product :  \uD83D\uDCB2");
        }
        book1.setCreatedaddProduct(LocalDate.now());
        newPruducct[books.length] = book1;
        allproduckt[books.length] = book1;


        return newPruducct;
    }

    public void infoooo(Product[] products) {

    }

    public void infoBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getIdProduct() != 0) {
                System.out.println("♥Books♥ : \uD83D\uDCD6 {" + books[i].getIdProduct() + "\nName: \uD83D\uDCD6" + books[i].getNameProduct() + "\nFull nameavtora: \uD83D\uDCD6 ✍\uD83C\uDFFB  \uD83E\uDD35\u200D♂\uFE0F" + books[i].getAvtorFullname() +
                        "\nPrice: \uD83D\uDCB2" + books[i].getPriceProduct() + "\nOpisanie: ✍\uD83C\uDFFB" + books[i].getDescriptionProduct() + "\nOpiblicirovana:  \uD83D\uDCC6" + books[i].getCreatedaddProduct());
            }
        }

    }
    public Book[] deleteBook(Book[] products, int counter) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write id :  ✉\uFE0F");
        long id = scanner.nextLong();
        for (int i = 0; i < counter; i++) {
            if (products[i].getIdProduct() == id) {
                for (int j = i; j < products.length-1; j++) {
                    products[j] = products[j+1];
                }
            } else System.out.println("Mindai id jok! ");
        }
        return Arrays.copyOf(products,products.length-1);
    }

    @Override
    public Elektronic[] deleteProcall(int counter, Elektronic[] products, String[] idsToDelete) {
        return new Elektronic[0];
    }

    public Book [] deleteProcallBook(int counter, Book[] products,String [] idsto) {
        Scanner scanner = new Scanner(System.in);
        for (String idStr : idsto) {
            long idToDelete = Long.parseLong(idStr.trim());
            for (int i = 0; i < products.length; i++) {
                if (products[i].getIdProduct() == idToDelete) {
                    for (int j = i; j < products.length-1; j++) {
                        products[j] = products[j+1];
                    }
                    System.out.println("Succesfalei!");
                }
            }
        }
        return Arrays.copyOf(products,products.length-counter);
    }
}
