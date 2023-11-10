import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class Product {
    private String nameProduct;
    private String descriptionProduct;
    private int priceProduct;
    private LocalDate createdaddProduct;

    public Product() {
    }

    public Product(String nameProduct, String descriptionProduct, int priceProduct, LocalDate createdaddProduct) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
        this.createdaddProduct = createdaddProduct;
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

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public LocalDate getCreatedaddProduct() {
        return createdaddProduct;
    }

    public void setCreatedaddProduct(LocalDate createdaddProduct) {
        this.createdaddProduct = createdaddProduct;
    }

    public void addNewproductElecronica(Product[] products, int counter,int counterelectron,Elektronic [] elektronics) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        for (int i = counter - 1; i < counter; i++) {
            Product ozu = new Product();

            Elektronic elektroks1 = new Elektronic();
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
                String eski = scannerStr.nextLine();
                if (eski.equalsIgnoreCase("J")) {
                    elektroks1.setNow(true);
                    break;
                } else if (eski.equalsIgnoreCase("e")) {
                    elektroks1.setNow(false);
                    break;
                }
            }
            System.out.print(" 6) Write opisanie product: ✍\uD83C\uDFFB ");
            elektroks1.setDescriptionProduct(scannerStr.nextLine());
            System.out.print(" 3) Write price product : ✍\uD83C\uDFFB \uD83D\uDCB2 ");
            elektroks1.setPriceProduct(scannerStr.nextInt());
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

    public void addNewproductBook(Product[] products, int counter,int counterBok,Book [] books) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        for (int i = counter - 1; i < counter; i++) {
            Product ozu = new Product();


            Book book1 = new Book();
            System.out.print(" 1) Write name book: \uD83D\uDCD6 ");
            book1.setNameProduct(scannerStr.nextLine());
            System.out.print(" 2) Write  aftor  book ull name: \uD83D\uDCD6 \uD83E\uDD35\u200D♂\uFE0F   ✍\uD83C\uDFFB");
            book1.setAvtorFullname(scannerStr.nextLine());
            System.out.print(" 3) Write opisanie product: ✍\uD83C\uDFFB ");
            book1.setDescriptionProduct(scannerStr.nextLine());
            System.out.print(" 4) Write price product :  \uD83D\uDCB2");
            book1.setPriceProduct(scannerInt.nextInt());
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

}
