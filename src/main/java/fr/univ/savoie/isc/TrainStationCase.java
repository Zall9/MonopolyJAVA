package fr.univ.savoie.isc;


import java.util.Scanner;

public class TrainStationCase extends BuyableCase {

    private int rent1Station;
    private int rent2Station;
    private int rent3Station;
    private int rent4Station;

    public TrainStationCase(String name, int price) {
        super(name, price);
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
        //TODO
        if (getOwner()!=null){
            System.out.println("You need to pay "+ getPrice());
            player.pay(getOwner(),getPrice());
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
    public void actionOnPass(Player player) {
        System.out.println("You are on the " + getName());
        if(getOwner()==null){
            System.out.println("You can buy this property for "+ getPrice());
            System.out.println("1-Yes");
            System.out.println("2-No");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                setOwner(player);
                player.buy(this);
            }
        }
    }

}
