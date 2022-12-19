package fr.univ.savoie.isc;

public class BuildableState implements State {

    private PropertyCase propertyCase;

    public BuildableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        //TODO action BuildableState
    }

    public void buy() { }

    public void showBuildable() {
        //TODO showBuildable BuildableState
    }

    public void build() {
        //TODO build BuildableState
    }
}
