package carBron;

public class Car {
    private long id;
    private String name;
    private String model;
    private double priceForHours;
    private boolean bar;
    private Driver mingenAdam;
    private double dohod;

    public Car() {
    }

    public Car(String name, String model, double priceForHours,long id,boolean bar,Driver mingenAdam,double dohod) {
        this.name = name;
        this.model = model;
        this.priceForHours = priceForHours;
        this.id = id;
        this.bar = bar;
        this.mingenAdam = mingenAdam;
        this.dohod = dohod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceForHours() {
        return priceForHours;
    }

    public void setPriceForHours(double priceForHours) {
        this.priceForHours = priceForHours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public Driver getMingenAdam() {
        return mingenAdam;
    }

    public void setMingenAdam(Driver mingenAdam) {
        this.mingenAdam = mingenAdam;
    }

    public double getDohod() {
        return dohod;
    }

    public void setDohod(double dohod) {
        this.dohod = dohod;
    }

    @Override
    public String toString() {
        return  "Названия : " + name  +
                " | Модел : " + model  +
                " | Цена на час : " + priceForHours +"$"+
                " |  ID: " + id + "\n";
    }
}
