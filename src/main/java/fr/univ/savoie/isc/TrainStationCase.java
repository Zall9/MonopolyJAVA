package fr.univ.savoie.isc;


import java.util.Scanner;

public class TrainStationCase extends BuyableCase {

    private int rent1Station;
    private int rent2Station;
    private int rent3Station;
    private int rent4Station;

    public TrainStationCase(String name, int price) {
        super(name, price);
        this.rent1Station = 25;
        this.rent2Station = 50;
        this.rent3Station = 100;
        this.rent4Station = 200;
    }



    private int getRent1Station() {
        return this.rent1Station;
    }

    private int getRent2Station() {
        return this.rent2Station;
    }

    private int getRent3Station() {
        return this.rent3Station;
    }

    private int getRent4Station() {
        return this.rent4Station;
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

            // il faut trouver le nombre de gare possédées par le joueur
            int nbTrainStation = this.getOwner().getNbTrainStation();
            int rent = 0;

            switch (nbTrainStation) {
                case 1:
                    rent = this.getRent1Station();
                    break;
                case 2:
                    rent = this.getRent2Station();
                    break;
                case 3:
                    rent = this.getRent3Station();
                    break;
                case 4:
                    rent = this.getRent4Station();
                    break;
            }

            System.out.println("You need to pay " + rent + "€");
            player.pay(this.getOwner(), rent);
        }
    }

    @Override
    public void becomeBuildable() { }

    @Override
    public void becomeHotelBuilt() {}

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
