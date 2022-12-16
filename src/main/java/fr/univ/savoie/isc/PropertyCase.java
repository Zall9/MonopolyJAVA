import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fa453527-326c-43c6-a446-139632e9b467")
public class PropertyCase extends BuyableCase {
    @mdl.prop
    @objid ("6528a00b-4160-42e3-86dd-a3248929ccfe")
    private String rent1House;

    @mdl.propgetter
    private String getRent1House() {
        // Automatically generated method. Please do not modify this code.
        return this.rent1House;
    }

    @mdl.propsetter
    private void setRent1House(String value) {
        // Automatically generated method. Please do not modify this code.
        this.rent1House = value;
    }

    @mdl.prop
    @objid ("1b1c8670-7bc9-4537-a010-b68b606df637")
    private String rent2House;

    @mdl.propgetter
    private String getRent2House() {
        // Automatically generated method. Please do not modify this code.
        return this.rent2House;
    }

    @mdl.propsetter
    private void setRent2House(String value) {
        // Automatically generated method. Please do not modify this code.
        this.rent2House = value;
    }

    @mdl.prop
    @objid ("c95a2a8b-f72b-4f31-a70c-9a30b8055e06")
    private String rent3House;

    @mdl.propgetter
    private String getRent3House() {
        // Automatically generated method. Please do not modify this code.
        return this.rent3House;
    }

    @mdl.propsetter
    private void setRent3House(String value) {
        // Automatically generated method. Please do not modify this code.
        this.rent3House = value;
    }

    @mdl.prop
    @objid ("3f226e51-9442-4eb0-8522-7519e22c0f0d")
    private String rent4House;

    @mdl.propgetter
    private String getRent4House() {
        // Automatically generated method. Please do not modify this code.
        return this.rent4House;
    }

    @mdl.propsetter
    private void setRent4House(String value) {
        // Automatically generated method. Please do not modify this code.
        this.rent4House = value;
    }

    @mdl.prop
    @objid ("202300dc-f657-4b23-a58a-1fccd0ae4ab7")
    private String rentHotel;

    @mdl.propgetter
    private String getRentHotel() {
        // Automatically generated method. Please do not modify this code.
        return this.rentHotel;
    }

    @mdl.propsetter
    private void setRentHotel(String value) {
        // Automatically generated method. Please do not modify this code.
        this.rentHotel = value;
    }

    @mdl.prop
    @objid ("371db0c1-73b5-4450-92f0-3ad0ed46abdf")
    private double rentEmpty;

    @mdl.propgetter
    private double getRentEmpty() {
        // Automatically generated method. Please do not modify this code.
        return this.rentEmpty;
    }

    @mdl.propsetter
    private void setRentEmpty(double value) {
        // Automatically generated method. Please do not modify this code.
        this.rentEmpty = value;
    }

    @mdl.prop
    @objid ("0e0fe588-05b4-4508-9e76-2e69b0e6d9a4")
    private int nbHouse;

    @mdl.propgetter
    private int getNbHouse() {
        // Automatically generated method. Please do not modify this code.
        return this.nbHouse;
    }

    @mdl.propsetter
    private void setNbHouse(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbHouse = value;
    }

    @mdl.prop
    @objid ("d42501e7-7108-4d0e-840c-26746138a09d")
    private State etat;

    @mdl.propgetter
    public State getEtat() {
        // Automatically generated method. Please do not modify this code.
        return this.etat;
    }

    @mdl.propsetter
    public void setEtat(State value) {
        // Automatically generated method. Please do not modify this code.
        this.etat = value;
    }

    @objid ("7b9a8fba-25da-4563-8b96-42591fb86a86")
    public void buyHouse() {
    }

    @objid ("fec9d75c-1383-4d68-93f0-df886ba36b8f")
    public void buyHotel() {
    }

    @objid ("53f9c9a8-cda3-4e29-9408-b5c694adc710")
    public void setState(State p1) {
    }

}
