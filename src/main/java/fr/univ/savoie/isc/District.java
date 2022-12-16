package fr.univ.savoie.isc;
import java.util.ArrayList;
import java.util.List;

public class District {

    private String name;

    private String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    private void setName(String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

    private int housePrice;

    private int getHousePrice() {
        // Automatically generated method. Please do not modify this code.
        return this.housePrice;
    }

    private void setHousePrice(int value) {
        // Automatically generated method. Please do not modify this code.
        this.housePrice = value;
    }

    private String hotelPrice;

    private String getHotelPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.hotelPrice;
    }

    private void setHotelPrice(String value) {
        // Automatically generated method. Please do not modify this code.
        this.hotelPrice = value;
    }

    private List<BuyableCase> buyableCase = new ArrayList<BuyableCase>();

    private List<BuyableCase> getBuyableCase() {
        // Automatically generated method. Please do not modify this code.
        return this.buyableCase;
    }

    private void setBuyableCase(List<BuyableCase> value) {
        // Automatically generated method. Please do not modify this code.
        this.buyableCase = value;
    }

    public void manageDistrictState() {
    }

}
