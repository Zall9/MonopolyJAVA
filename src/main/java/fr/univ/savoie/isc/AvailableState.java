package fr.univ.savoie.isc;


public class AvailableState implements State {

    private PropertyCase propertyCase;

    public AvailableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        //TODO action AvailableState
    }

    public void buy() {
        //TODO buy AvailableState
    }

    public void showBuildable() { }

    public void build() { }
}
