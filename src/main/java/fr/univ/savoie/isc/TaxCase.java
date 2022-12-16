import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b6f80a90-da99-4763-adb1-f9c3f0249c47")
public class TaxCase extends Case {
    @mdl.prop
    @objid ("122b2e85-b0a0-4a5b-8e3a-2548a7f8d8a6")
    private int cost;

    @mdl.propgetter
    private int getCost() {
        // Automatically generated method. Please do not modify this code.
        return this.cost;
    }

    @mdl.propsetter
    private void setCost(int value) {
        // Automatically generated method. Please do not modify this code.
        this.cost = value;
    }

}
