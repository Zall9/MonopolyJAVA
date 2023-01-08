package fr.univ.savoie.isc;

public class WaitingBuildableState implements State {

    private PropertyCase propertyCase;

    public WaitingBuildableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        int rent = 0;

        // dans cet état, il peut y avoir entre 1 et 4 maison construites
        switch (this.propertyCase.getNbHouse()) {
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

    public void buy() {
    }

    public void buyHouse() {
    }

    public void buyHotel() {
    }

    public boolean isBuildable() { return false; }

    public void build() {
    }

    public String toString() {
        return "WaitingBuildableState";
    }
}
