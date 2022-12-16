import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20cc66dd-c00d-42fa-9df8-08357cb99c00")
public class District {
    @mdl.prop
    @objid ("80b66583-a20b-4529-8dce-81932d91543b")
    private String name;

    @mdl.propgetter
    private String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    @mdl.propsetter
    private void setName(String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

    @mdl.prop
    @objid ("228e353e-d962-41f8-81ab-9f69a0c7a101")
    private int housePrice;

    @mdl.propgetter
    private int getHousePrice() {
        // Automatically generated method. Please do not modify this code.
        return this.housePrice;
    }

    @mdl.propsetter
    private void setHousePrice(int value) {
        // Automatically generated method. Please do not modify this code.
        this.housePrice = value;
    }

    @mdl.prop
    @objid ("96cc42cf-d451-4651-8f04-06d0e6392931")
    private String hotelPrice;

    @mdl.propgetter
    private String getHotelPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.hotelPrice;
    }

    @mdl.propsetter
    private void setHotelPrice(String value) {
        // Automatically generated method. Please do not modify this code.
        this.hotelPrice = value;
    }

    @mdl.prop
    @objid ("912fb0dc-002d-4184-85dd-51b9bffcdd18")
    private List<BuyableCase> buyableCase = new ArrayList<BuyableCase> ();

    @mdl.propgetter
    private List<BuyableCase> getBuyableCase() {
        // Automatically generated method. Please do not modify this code.
        return this.buyableCase;
    }

    @mdl.propsetter
    private void setBuyableCase(List<BuyableCase> value) {
        // Automatically generated method. Please do not modify this code.
        this.buyableCase = value;
    }

    @objid ("bb8932c0-3046-493e-beea-2cde0ad6c9b7")
    public void manageDistrictState() {
    }

}
