package fr.univ.savoie.isc;

public abstract class BuyableCase extends Case {

    private int price;

    private int getPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.price;
    }

    private void setPrice(int value) {
        // Automatically generated method. Please do not modify this code.
        this.price = value;
    }

    private Player owner;

    private Player getOwner() {
        // Automatically generated method. Please do not modify this code.
        return this.owner;
    }

    // private void setOwner(Player value) {
    //     // Automatically generated method. Please do not modify this code.
    //     this.owner = value;
    // }

    private District district;

    public void buy(Player p1) {
    }

    public void setOwner(Player p1) {
    }

    public abstract void becomeBuildable();

    public abstract void becomeBought();

    public abstract void showBuildable();

    public abstract void build();

    District getDistrict() {
        // Automatically generated method. Please delete this comment before entering
        // specific code.
        return this.district;
    }

    void setDistrict(District value) {
        // Automatically generated method. Please delete this comment before entering
        // specific code.
        this.district = value;
    }

}
