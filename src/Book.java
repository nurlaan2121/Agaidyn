import java.time.LocalDate;

public class Book extends Product {
    private String avtorFullname;


    public Book() {
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


    public void infoBook(Book[] books, int counter) {
        for (int i = 0; i < counter; i++) {
            if (books[i].getIdProduct() != 0) {
                System.out.println("♥Books♥ : \uD83D\uDCD6 {" + books[i].getIdProduct() + "\nName: \uD83D\uDCD6" + books[i].getNameProduct() + "\nFull nameavtora: \uD83D\uDCD6 ✍\uD83C\uDFFB  \uD83E\uDD35\u200D♂\uFE0F" + books[i].getAvtorFullname() +
                        "\nPrice: \uD83D\uDCB2" + books[i].getPriceProduct() + "\nOpisanie: ✍\uD83C\uDFFB" + books[i].getDescriptionProduct() + "\nOpiblicirovana:  \uD83D\uDCC6" + books[i].getCreatedaddProduct());
            }
        }

    }
}
