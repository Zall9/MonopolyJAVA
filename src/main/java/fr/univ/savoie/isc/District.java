package fr.univ.savoie.isc;
import java.util.ArrayList;
import java.util.List;

public class District {

    private String name;
    private int buildPrice;

    private List<BuyableCase> buyableCases = new ArrayList<BuyableCase>();

    public District(String name, int buildPrice) {
        this.name = name;
        this.buildPrice = buildPrice;
    }

    public String getName() {
        return this.name;
    }

    public int getBuildPrice() {
        return this.buildPrice;
    }

    public List<BuyableCase> getBuyableCases() {
        return this.buyableCases;
    }

    public void addBuyableCase(BuyableCase buyableCase) {
        this.buyableCases.add(buyableCase);
    }


    public void manageDistrictState() {
        // TODO manageDistrictState District

    }

}
