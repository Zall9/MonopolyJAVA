import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("99dd26c6-04a8-41aa-b165-72c8e4cb1405")
public class TrainStationCase extends BuyableCase {
    @mdl.prop
    @objid ("c89f940a-85e5-47c2-9e87-c643e4253573")
    private int rent1Station;

    @mdl.propgetter
    private int getRent1Station() {
        // Automatically generated method. Please do not modify this code.
        return this.rent1Station;
    }

    @mdl.propsetter
    private void setRent1Station(int value) {
        // Automatically generated method. Please do not modify this code.
        this.rent1Station = value;
    }

    @mdl.prop
    @objid ("c39e1ca2-1c37-48bb-b5ff-6bea7f13cd42")
    private int rent2Station;

    @mdl.propgetter
    private int getRent2Station() {
        // Automatically generated method. Please do not modify this code.
        return this.rent2Station;
    }

    @mdl.propsetter
    private void setRent2Station(int value) {
        // Automatically generated method. Please do not modify this code.
        this.rent2Station = value;
    }

    @mdl.prop
    @objid ("f38b9608-a6ca-461b-ac6e-cd9d519153e4")
    private int rent3Station;

    @mdl.propgetter
    private int getRent3Station() {
        // Automatically generated method. Please do not modify this code.
        return this.rent3Station;
    }

    @mdl.propsetter
    private void setRent3Station(int value) {
        // Automatically generated method. Please do not modify this code.
        this.rent3Station = value;
    }

    @mdl.prop
    @objid ("37e30f87-ed48-4081-b435-e0bbadc5b412")
    private int rent4Station;

    @mdl.propgetter
    private int getRent4Station() {
        // Automatically generated method. Please do not modify this code.
        return this.rent4Station;
    }

    @mdl.propsetter
    private void setRent4Station(int value) {
        // Automatically generated method. Please do not modify this code.
        this.rent4Station = value;
    }

}
