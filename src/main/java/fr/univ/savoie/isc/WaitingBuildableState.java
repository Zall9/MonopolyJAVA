package fr.univ.savoie.isc;

public class WaitingBuildableState implements State {

    private PropertyCase propertyCase;

    public WaitingBuildableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
    }

    public void buy() {
    }

    public void buyHouse() {
    }

    public void buyHotel() {
    }

    public void showBuildable() {
    }

    public void build() {
    }
}
