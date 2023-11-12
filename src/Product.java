import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private String nameProduct;
    private String descriptionProduct;
    private BigDecimal priceProduct;
    private LocalDate createdaddProduct;
    private long idProduct;

    public Product() {
    }

    public Product(String nameProduct, String descriptionProduct, BigDecimal priceProduct, LocalDate createdaddProduct, long idProduct) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.createdaddProduct = createdaddProduct;
        this.idProduct = idProduct;
    }

    public Product(String nameProduct, String descriptionProduct, int priceProduct, LocalDate createdaddProduct) {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public BigDecimal getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(BigDecimal priceProduct) {
        this.priceProduct = priceProduct;
    }

    public LocalDate getCreatedaddProduct() {
        return createdaddProduct;
    }

    public void setCreatedaddProduct(LocalDate createdaddProduct) {
        this.createdaddProduct = createdaddProduct;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public void addNewproductElecronica(Product[] products, int counter, int counterelectron, Elektronic[] elektronics) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        for (int i = counter - 1; i < counter; i++) {
            Product ozu = new Product();

            Elektronic elektroks1 = new Elektronic();
            elektroks1.setIdProduct(counter + 1);
            System.out.print(" 1) Write name product:\uD83D\uDCBB  \uD83D\uDCF1  ");
            elektroks1.setNameProduct(scannerStr.nextLine());
            System.out.print(" 2) Write  brand name product: \uD83D\uDCF1  ");
            elektroks1.setBrandName(scannerStr.nextLine());
            System.out.print(" 3) Write memory:  (ГБ)  \uD83D\uDCBE  \uD83E\uDDE0");
            elektroks1.setMemory(scannerInt.nextInt());
            System.out.print(" 4) Write color product:  \uD83D\uDD34 ⚪ \uD83D\uDFE1 \uD83D\uDD35 \uD83D\uDFE2");
            elektroks1.setColor(scannerStr.nextLine());
            System.out.print(" 5) Write Now|Bu product:  ♥j♥ || ♥e♥");
            while (true) {
                System.out.print(" 6) Write Now|Bu product:  ♥j♥ || ♥e♥");
                String eski = scannerStr.nextLine();
                if (eski.equalsIgnoreCase("J")) {
                    elektroks1.setNow(true);
                    break;
                } else if (eski.equalsIgnoreCase("e")) {
                    elektroks1.setNow(false);
                    break;
                }
            }
            System.out.print(" 7) Write opisanie product: ✍\uD83C\uDFFB ");
            elektroks1.setDescriptionProduct(scannerStr.nextLine());
            System.out.print(" 8) Write price product : ✍\uD83C\uDFFB \uD83D\uDCB2 ");
            elektroks1.setPriceProduct(scannerStr.nextBigDecimal());
            elektroks1.setCreatedaddProduct(LocalDate.now());
            products[counter] = elektroks1;
            elektronics[counterelectron] = elektroks1;


        }

    }

    public void getInfo(Elektronic[] elektronics, int counter) {
        Elektronic elektronic = new Elektronic();
        for (int i = 0; i < counter; i++) {
            System.out.println("NAme : " + elektronic.getNameProduct() + "\n" +
                    "Brand: " + elektronic.getBrandName() + "\n" + "Memory: " + elektronic.getMemory() + "\nPrice: " + elektronic.getPriceProduct() + "\n" +
                    "Sostaienie: " + elektronic.isNow() + "\n" + "Color: " + elektronic.getColor() + "\nOpisanie : " + elektronic.getDescriptionProduct() + "\n" +
                    "OPUBLIKROVANA: " + elektronic.getCreatedaddProduct());
        }
    }


    public void addNewproductBook(Product[] products, int counter, int counterBok, Book[] books) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        for (int i = counter - 1; i < counter; i++) {
            Product ozu = new Product();

            Book book1 = new Book();
            book1.setIdProduct(counter + 1);
            System.out.print(" 1) Write name book: \uD83D\uDCD6 ");
            book1.setNameProduct(scannerStr.nextLine());
            System.out.print(" 2) Write  aftor  book ull name: \uD83D\uDCD6 \uD83E\uDD35\u200D♂\uFE0F   ✍\uD83C\uDFFB");
            book1.setAvtorFullname(scannerStr.nextLine());
            System.out.print(" 3) Write opisanie product: ✍\uD83C\uDFFB ");
            book1.setDescriptionProduct(scannerStr.nextLine());
            System.out.print(" 4) Write price product :  \uD83D\uDCB2");
            book1.setPriceProduct(scannerInt.nextBigDecimal());
            book1.setCreatedaddProduct(LocalDate.now());
            products[counter] = book1;
            books[counterBok] = book1;

        }
    }

    public void getInfoBook(Elektronic[] elektronics, int counter) {
        Elektronic elektronic = new Elektronic();
        for (int i = 0; i < counter; i++) {
            System.out.println("NAme : " + elektronic.getNameProduct() + "\n" +
                    "Brand: " + elektronic.getBrandName() + "\n" + "Memory: " + elektronic.getMemory() + "\nPrice: " + elektronic.getPriceProduct() + "\n" +
                    "Sostaienie: " + elektronic.isNow() + "\n" + "Color: " + elektronic.getColor() + "\nOpisanie : " + elektronic.getDescriptionProduct() + "\n" +
                    "OPUBLIKROVANA: " + elektronic.getCreatedaddProduct());
        }
    }

    public static String deleteProckt(Product[] products, int counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write id :  ✉\uFE0F");
        long id = scanner.nextLong();
        for (int i = 0; i < counter; i++) {
            if (products[i].getIdProduct() == id) {
                products[i].setIdProduct(0);
                return "OK";
            } else System.out.println("Mindai id jok! ");
        }
        return "wef";
    }

    public static void deleteProckt(long counter,Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write id CHEREZ PROBEL! : ✉️");
        String[] idsToDelete = scanner.nextLine().split(" ");

        for (String idStr : idsToDelete) {
            long idToDelete = Long.parseLong(idStr.trim());
            for (int i = 0; i < counter; i++) {
                if (products[i].getIdProduct() == idToDelete) {
                    products[i].setIdProduct(0);
                    System.out.println("Succesfalei!");
                }
            }

        }

    }

}
