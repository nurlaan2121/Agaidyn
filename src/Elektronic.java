import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Elektronic extends Product {
    private String brandName;
    private int memory;
    private boolean isNow;
    private String color;

    public Elektronic() {
    }

    public Elektronic(String brandName, int memory, boolean isNow, String color) {
        this.brandName = brandName;
        this.memory = memory;
        this.isNow = isNow;
        this.color = color;
    }

    public Elektronic(String nameProduct, String descriptionProduct, int priceProduct, LocalDate createdaddProduct, String brandName, int memory, boolean isNow, String color, long idElectronic) {
        super(nameProduct, descriptionProduct, priceProduct, createdaddProduct);
        this.brandName = brandName;
        this.memory = memory;
        this.isNow = isNow;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isNow() {
        return isNow;
    }

    public void setNow(boolean now) {
        isNow = now;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Elektronic[] addNewproductElecronica(Product[] products, int counter, int counterelectron, Elektronic[] elektronics) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("JAZZ");
        Elektronic elektroks1 = new Elektronic();
        Elektronic[] elektronicsall = Arrays.copyOf(elektronics, elektronics.length + 1);
        Product[] products1 = Arrays.copyOf(elektronics, elektronics.length + 1);

        elektroks1.setIdProduct(GeneretorId.generetatorEl());
        System.out.print(" 1) Write name product:\uD83D\uDCBB  \uD83D\uDCF1  ");
        while (true) {
            String opisamie = scannerStr.nextLine();
            if (Pustoiproverka.proverka(opisamie).equalsIgnoreCase("ok")) {
                elektroks1.setNameProduct(opisamie);
                break;
            } else System.out.print(" 1) Write name product:\uD83D\uDCBB  \uD83D\uDCF1  ");
        }
        System.out.print(" 2) Write  brand name product: \uD83D\uDCF1  ");
        while (true) {
            String opisamie = scannerStr.nextLine();
            if (Pustoiproverka.proverka(opisamie).equalsIgnoreCase("ok")) {
                elektroks1.setBrandName(opisamie);
                break;
            } else System.out.print(" 2) Write  brand name product: \uD83D\uDCF1  ");
        }
        System.out.print(" 3) Write memory:  (ГБ)  \uD83D\uDCBE  \uD83E\uDDE0");
        while (true) {
            String price = scannerStr.nextLine();
            if (price.contains("1") || price.contains("2") || price.contains("3") || price.contains("4") || price.contains("5") || price.contains("6") || price.contains("7") || price.contains("8") || price.contains("9") || price.contains("0")) {
                int sam = Integer.parseInt(price);
                if (sam > 3 && sam < 7) {
                    sam = 4;
                } else if (sam > 7 && sam < 15) {
                    sam = 8;
                } else if (sam > 15 && sam < 31) {
                    sam = 16;
                } else if (sam > 31 && sam < 63) {
                    sam = 32;
                } else if (sam > 63 && sam < 127) {
                    sam = 64;
                } else if (sam > 127 && sam < 256) {
                    sam = 128;
                } else if (sam > 255 && sam < 511) {
                    sam = 256;
                } else if (sam > 511 && sam < 999) {
                    sam = 512;
                } else if (sam > 999 && sam < 2000) {
                    sam = 1000;
                } else if (sam > 1999 && sam < 3999) {
                    sam = 2000;
                } else if (sam > 3999 && sam < 7999) {
                    sam = 4000;
                } else if (sam > 7999 && sam < 15999) {
                    sam = 8000;
                } else if (sam > 15999 && sam < 31999) {
                    sam = 16000;
                } else System.out.println("Myndai pamit jok!");
                elektroks1.setMemory(sam);
                break;
            } else System.out.print(" 3) Write memory:  (ГБ)  \uD83D\uDCBE  \uD83E\uDDE0");
        }
        System.out.print(" 4) Write color product:  \uD83D\uDD34 ⚪ \uD83D\uDFE1 \uD83D\uDD35 \uD83D\uDFE2");
        while (true) {
            String opisamie = scannerStr.nextLine();
            if (Pustoiproverka.proverka(opisamie).equalsIgnoreCase("ok") && !opisamie.trim().contains("1") && !opisamie.contains("2") && !opisamie.contains("3") && !opisamie.contains("4") && !opisamie.contains("5") && !opisamie.contains("6") && !opisamie.contains("7") && !opisamie.contains("8") && !opisamie.contains("9") && !opisamie.contains("0")) {
                elektroks1.setColor(opisamie);
                break;
            } else System.out.print(" 4) Write color product:  \uD83D\uDD34 ⚪ \uD83D\uDFE1 \uD83D\uDD35 \uD83D\uDFE2");
        }

        System.out.print(" 5) Write Now|Bu product:  ♥j♥ || ♥e♥");
        while (true) {
            String eski = scannerStr.nextLine();
            if (eski.equalsIgnoreCase("J")) {
                elektroks1.setNow(true);
                break;
            } else if (eski.equalsIgnoreCase("e")) {
                elektroks1.setNow(false);
                break;
            } else System.out.print(" 5) Write Now|Bu product:  ♥j♥ || ♥e♥");
        }
        System.out.print(" 6) Write opisanie product: ✍\uD83C\uDFFB ");
        while (true) {
            String opisamie = scannerStr.nextLine();
            if (Pustoiproverka.proverka(opisamie).equalsIgnoreCase("ok")) {
                elektroks1.setDescriptionProduct(opisamie);
                break;
            } else System.out.print(" 6) Write opisanie product: ✍\uD83C\uDFFB ");
        }

        System.out.print(" 7) Write price product : ✍\uD83C\uDFFB \uD83D\uDCB2 ");
        while (true) {
            String price = scannerStr.nextLine();
            if (price.trim().contains("1") || price.contains("2") || price.contains("3") || price.contains("4") || price.contains("5") || price.contains("6") || price.contains("7") || price.contains("8") || price.contains("9") || price.contains("0")) {
                int sam = Integer.parseInt(price);
                elektroks1.setPriceProduct(BigDecimal.valueOf(sam));
                break;
            } else System.out.print(" 7) Write price product :  \uD83D\uDCB2");
        }
        elektroks1.setCreatedaddProduct(LocalDate.now());
        elektronicsall[elektronics.length] = elektroks1;
        return elektronicsall;
    }

    @Override
    public Product[] addNewproductBook(Product[] products, int counter, int counterBok, Book[] books) {

        return products;
    }

    public void ingoElectric(Elektronic[] elektronics) {
        for (int i = 0; i < elektronics.length; i++) {
            if (elektronics[i].getIdProduct() != 0) {

                if (elektronics[i].isNow()) {
                    System.out.println(" ♥Elektronic♥ {" + elektronics[i].getIdProduct() + "\nName electronic: :  " + elektronics[i].getNameProduct() +
                            "\nBrandName= '" + elektronics[i].getBrandName() + '\'' +
                            ", \nMemory= \uD83D\uDCBE" + elektronics[i].getMemory() +
                            ", \nIsnow= " + "New \uD83D\uDC76\uD83C\uDFFB" +
                            ", \nColor ='" + elektronics[i].getColor() + '\'' +
                            "\nDescription :✍\uD83C\uDFFB " + elektronics[i].getDescriptionProduct() +
                            "\nDate creat : \uD83D\uDCC6" + elektronics[i].getCreatedaddProduct() +
                            "\nPrice: \uD83D\uDCB2" + elektronics[i].getPriceProduct());
                } else {
                    System.out.println(" ♥Elektronic♥ {" + elektronics[i].getIdProduct() + "\nName electronic: :  " + elektronics[i].getNameProduct() +
                            "\nBrandName= '" + elektronics[i].getBrandName() + '\'' +
                            ", \nMemory= \uD83D\uDCBE" + elektronics[i].getMemory() +
                            ", \nIsnow= " + " Old \uD83D\uDC74\uD83C\uDFFB" +
                            ", \nColor ='" + elektronics[i].getColor() + '\'' +
                            "\nDescription :✍\uD83C\uDFFB " + elektronics[i].getDescriptionProduct() +
                            "\nDate creat : \uD83D\uDCC6" + elektronics[i].getCreatedaddProduct() +
                            "\nPrice: \uD83D\uDCB2" + elektronics[i].getPriceProduct());
                }
            }


        }
    }
    public Elektronic [] deleteProcktelc(Elektronic[] products, int counter) {
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
    public Book[] deleteBook(Book[] products, int counter) {
        return new Book[0];
    }

    public Elektronic [] deleteProcall(int counter, Elektronic[] products,String [] idsToDelete) {
        for (String idStr : idsToDelete) {
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

    @Override
    public Book[] deleteProcallBook(int counter, Book[] products, String[] idsto) {
        return new Book[0];
    }
}
