package fr.univ.savoie.isc;


public class BoughtState implements State {

    private PropertyCase propertyCase;

    public BoughtState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        System.out.println("You need to pay " + this.propertyCase.getPrice());
        player.pay(this.propertyCase.getOwner(), this.propertyCase.getPrice());
    }

    public void buy() { }

    public void showBuildable() { }

    public void build() { }

    public String toString() {
        return "BoughtState";
    }
}
