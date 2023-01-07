package fr.univ.savoie.isc;

public abstract class BuyableCase extends Case {

    private int price;
    private District district;
    private Player owner;

    public BuyableCase(String name, int price) {
        super(name);
        this.price = price;
        this.owner = null;
    }

    public abstract void becomeBought();

    public abstract void becomeBuildable();

    public abstract void becomeHotelBuilt();

    public abstract void becomeWaitingBuildableState();

    public abstract void showBuildable();

    public abstract void build();


    public int getPrice() {
        return this.price;
    }

    public Player getOwner() {
        return this.owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public District getDistrict() {
        return this.district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
