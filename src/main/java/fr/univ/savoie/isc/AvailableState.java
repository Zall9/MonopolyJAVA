package fr.univ.savoie.isc;


import java.util.Scanner;

public class AvailableState implements State {

    private PropertyCase propertyCase;

    public AvailableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        System.out.println("Do you want to buy " + this.propertyCase.getName() + " for " + this.propertyCase.getPrice() + "€ ? ");
        System.out.println("1 - YES");
        System.out.println("2 - NO");
        System.out.print("> ");

        int choice = new Scanner(System.in).nextInt();

        if (choice == 1) {
            this.buy(player);
        }
    }

    public void buy(Player player) {
        player.buy(this.propertyCase);
        this.propertyCase.getDistrict().manageDistrictState();
    }

    public void showBuildable() { }

    public void build() { }

    public String toString() {
        return "AvailableState";
    }
}
