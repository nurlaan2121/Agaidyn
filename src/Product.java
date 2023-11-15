import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Product {
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

    public  abstract Product[] addNewproductBook(Product[] products, int counter, int counterBok, Book[] books);
    public abstract Product [] addNewproductElecronica(Product[] products, int counter, int counterelectron, Elektronic[] elektronics);

    public  abstract Elektronic [] deleteProcktelc(Elektronic[] products, int counter);
    public abstract Book[] deleteBook(Book[] products, int counter);
    public abstract Elektronic [] deleteProcall(int counter, Elektronic[] products,String [] idsToDelete);
    public abstract Book [] deleteProcallBook(int counter, Book[] products,String [] idsto);

}
