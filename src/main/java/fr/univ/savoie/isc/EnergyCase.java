package fr.univ.savoie.isc;

public class EnergyCase extends BuyableCase {

    public EnergyCase(String name, int price) {
        super(name, price);
    }

    @Override
    public void action(Player player) {
        //TODO action EnergyCase

    }

    @Override
    public void becomeBuildable() { }

    @Override
    public void becomeHotelBuilt() {

    }

    @Override
    public void becomeWaitingbuildableState() {

    }

    @Override
    public void becomeBought() { }

    @Override
    public void showBuildable() { }

    @Override
    public void build() { }

    @Override
    public void actionOnPass(Player player) { }
}
