package myTaskv20;

public class Sozdor {
    private String soz;
    private boolean open;

    public Sozdor() {
    }

    public Sozdor(String soz, boolean open) {
        this.soz = soz;
        this.open = open;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

}
