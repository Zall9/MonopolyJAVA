package fr.univ.savoie.isc;


public class BoughtState implements State {

    private PropertyCase propertyCase;

    public BoughtState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        //TODO action BoughtState
    }

    public void buy() { }

    public void showBuildable() { }

    public void build() { }
}
