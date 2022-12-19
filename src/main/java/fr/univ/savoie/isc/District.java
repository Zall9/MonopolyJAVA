package fr.univ.savoie.isc;
import java.util.ArrayList;
import java.util.List;

public class District {

    private String name;
    private int housePrice;
    private int hotelPrice;

    private List<BuyableCase> buyableCases = new ArrayList<BuyableCase>();

    public District(String name, int housePrice, int hotelPrice) {
        this.name = name;
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
    }

    public String getName() {
        return this.name;
    }

    public int getHousePrice() {
        return this.housePrice;
    }

    public int getHotelPrice() {
        return this.hotelPrice;
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
