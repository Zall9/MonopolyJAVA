package fr.univ.savoie.isc;

public abstract class BuyableCase extends Case {

    private int price;
    private District district;
    private Player owner;

    public BuyableCase(String name, int price) {
        super(name);
        this.price = price;
    }

    public abstract void buy(Player player);

    public abstract void becomeBought();

    public abstract void becomeBuildable();

    public abstract void showBuildable();

    public abstract void build();


    private int getPrice() {
        return this.price;
    }

    private Player getOwner() {
        return this.owner;
    }

    private void setOwner(Player owner) {
        this.owner = owner;
    }

    public District getDistrict() {
        return this.district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
