package fr.univ.savoie.isc;

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
        //TODO action TrainStationCase

    }

    @Override
    public void buy(Player player) {
        //TODO buy TrainStationCase
    }

    @Override
    public void becomeBuildable() { }

    @Override
    public void becomeBought() { }

    @Override
    public void showBuildable() { }

    @Override
    public void build() { }

    @Override
    public void actionOnPass(Player player) { }

}
