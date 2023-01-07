package fr.univ.savoie.isc;


public class BoughtState implements State {

    private PropertyCase propertyCase;

    public BoughtState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        int rent = 0;

        switch (this.propertyCase.getNbHouse()) {
            case 0:
                rent = this.propertyCase.getRentEmpty();
                break;
            case 1:
                rent = this.propertyCase.getRent1House();
                break;
            case 2:
                rent = this.propertyCase.getRent2House();
                break;
            case 3:
                rent = this.propertyCase.getRent3House();
                break;
            case 4:
                rent = this.propertyCase.getRent4House();
                break;
        }

        System.out.println("You need to pay " + rent + "€");
        player.pay(this.propertyCase.getOwner(), rent);
    }

    public void buy() { }

    public void showBuildable() { }

    public void build() { }

    public String toString() {
        return "BoughtState";
    }
}
