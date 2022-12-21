package fr.univ.savoie.isc;

public class HotelBuiltState implements State {

    private PropertyCase propertyCase;

    public HotelBuiltState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        //TODO action HotelBuiltState
    }

    public void buy() { }

    public void showBuildable() { }

    public void build() { }


    public String toString() {
        return "HotelBuiltState";
    }
}
