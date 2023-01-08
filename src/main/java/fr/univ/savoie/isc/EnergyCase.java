package fr.univ.savoie.isc;

import java.util.Scanner;

public class EnergyCase extends BuyableCase {

    public EnergyCase(String name, int price) {
        super(name, price);
    }

    @Override
    public void action(Player player) {
        // si la case est available, on propose de l'acheté
        if (this.getOwner() == null) {
            System.out.println("You can buy this property for "+ getPrice() + "€");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                player.buy(this);
            }
        }
        else // sinon on fait payer le joueur
        {
            System.out.println(this.getName() + " is own by " + this.getOwner().getName());

            // il faut trouver le nombre de case energy possédées par le joueur
            int nbEnergy = this.getOwner().getNbEnergy();
            int rent = 0;

            if (nbEnergy == 1) {
                rent = Game.diceResult * 4;
            }
            if (nbEnergy == 2) {
                rent = Game.diceResult * 10;
            }

            System.out.println("You need to pay " + rent + "€");
            player.pay(this.getOwner(), rent);
        }
    }

    @Override
    public void becomeBuildable() { }

    @Override
    public void becomeHotelBuilt() {

    }

    @Override
    public void becomeWaitingBuildableState() {

    }

    @Override
    public void becomeBought() { }

    @Override
    public boolean isBuildable() { return false; }

    @Override
    public void build() { }

    @Override
    public void actionOnPass(Player player) { }
}
