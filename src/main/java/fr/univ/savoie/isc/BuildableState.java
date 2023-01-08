package fr.univ.savoie.isc;

public class BuildableState implements State {

    private PropertyCase propertyCase;

    public BuildableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println(this.propertyCase.getName() + " is own by " + this.propertyCase.getOwner().getName());
        int rent = 0;

        // dans cet état, il peut y avoir entre 0 et 4 maison construites
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

    public boolean isBuildable() { return true; }


    public void build() {
        int housePrice = this.propertyCase.getDistrict().getBuildPrice();
        Player owner = this.propertyCase.getOwner();

        if (owner.getMoney() < housePrice) {
            System.out.println("You have not enough money !");
            return;
        }

        owner.buyHouse(housePrice);
        this.propertyCase.setNbHouse(this.propertyCase.getNbHouse() + 1);
        this.propertyCase.getDistrict().manageDistrictState();
    }

    public String toString() {
        return "BuildableState";
    }
}
