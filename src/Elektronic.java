import java.time.LocalDate;

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

    public Elektronic(String nameProduct, String descriptionProduct, int priceProduct, LocalDate createdaddProduct, String brandName, int memory, boolean isNow, String color,long idElectronic) {
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

    public void ingoElectric(Elektronic[] elektronics, int counter) {
        for (int i = 0; i < counter; i++) {
            if (elektronics[i].getIdProduct() != 0){

                if (elektronics[i].isNow()) {

                    System.out.println(" ♥Elektronic♥ {" + elektronics[i].getIdProduct() +  "\nName electronic: :  " + elektronics[i].getNameProduct() +
                            "\nBrandName= '" + elektronics[i].getBrandName() + '\'' +
                            ", \nMemory= \uD83D\uDCBE" + elektronics[i].getMemory() +
                            ", \nIsnow= " + "New \uD83D\uDC76\uD83C\uDFFB" +
                            ", \nColor ='" + elektronics[i].getColor() + '\'' +
                            "\nDescription :✍\uD83C\uDFFB " + elektronics[i].getDescriptionProduct()  +
                            "\nDate creat : \uD83D\uDCC6" + elektronics[i].getCreatedaddProduct() +
                            "\nPrice: \uD83D\uDCB2" + elektronics[i].getPriceProduct());
                }else {System.out.println(" ♥Elektronic♥ {" + elektronics[i].getIdProduct() +  "\nName electronic: :  " + elektronics[i].getNameProduct() +
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
}
