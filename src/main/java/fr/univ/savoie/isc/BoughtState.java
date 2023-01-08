package fr.univ.savoie.isc;


public class BoughtState implements State {

    private PropertyCase propertyCase;

    public BoughtState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        // dans cet état, il n'y a pas de maison construite
        int rent = this.propertyCase.getRentEmpty();
        System.out.println("You need to pay " + rent + "€");
        player.pay(this.propertyCase.getOwner(), rent);
    }

    public void buy() { }

    public boolean isBuildable() { return false; }

    public void build() { }

    public String toString() {
        return "BoughtState";
    }
}
