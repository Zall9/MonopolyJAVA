package fr.univ.savoie.isc;

public class HotelBuiltState implements State {

    private PropertyCase propertyCase;

    public HotelBuiltState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        // dans cet état, il y a un hotel constuit
        int rent = this.propertyCase.getRentHotel();
        System.out.println("You need to pay " + rent + "€");
        player.pay(this.propertyCase.getOwner(), rent);
    }

    public void buy() { }

    public boolean isBuildable() { return false; }

    public void build() { }


    public String toString() {
        return "HotelBuiltState";
    }
}
