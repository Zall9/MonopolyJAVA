package fr.univ.savoie.isc;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private double money;
    private Case position;
    private List<BuyableCase> properties;

    public Player(String name, Case depart) {
        this.name = name;
        this.position = depart;
        this.money = 1500;
        this.properties = new ArrayList<BuyableCase>();
    }


    public double getMoney() {
        return this.money;
    }

    private void setMoney(double value) {
        this.money = value;
    }

    public Case getPosition() {
        return this.position;
    }

    private void setPosition(Case value) {
        this.position = value;
    }


    public void addProperty(BuyableCase property) {
        this.properties.add(property);
    }

    public void move(int diceResult) {
        for(int i=0; i<diceResult; i++) {
            this.position = this.position.getNext();
            this.position.actionOnPass(this);
        }
        System.out.println("You are now on : " + this.position.getName());
        this.position.action(this);
    }

    public void buy(BuyableCase buyableCase) {
        buyableCase.setOwner(this);
        this.addProperty(buyableCase);
        this.money -= buyableCase.getPrice();
    }

    public void showMyBuildables() {
        for (BuyableCase bc: this.properties) {
            bc.showBuildable();
        }
    }

    public void pay(Player owner, int price) {
        this.money -= price;
        owner.getPaid(price);
    }

    public void getPaid(int rent) {
        this.money += rent;
    }

    public List<BuyableCase> getProperties() {
        return this.properties;
    }

    public String getName() {
        return this.name;
    }
}
