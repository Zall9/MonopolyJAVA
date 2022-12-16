import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("66e3ba0e-bb93-42fa-8a9f-71654f29e67b")
public class Game {
    @mdl.prop
    @objid ("b046b027-0751-4331-9989-615d977b9fed")
    private List<Player> player = new ArrayList<Player> ();

    @mdl.prop
    @objid ("eef172d2-31ac-45e9-b475-78443b2f5852")
    private List<Case> cases = new ArrayList<Case> ();

    @mdl.propgetter
    private List<Case> getCases() {
        // Automatically generated method. Please do not modify this code.
        return this.cases;
    }

    @mdl.propsetter
    private void setCases(List<Case> value) {
        // Automatically generated method. Please do not modify this code.
        this.cases = value;
    }

    @mdl.prop
    @objid ("66e2fecd-fe28-4dbd-bceb-8cba6f453f17")
    private List<District> district = new ArrayList<District> ();

    @mdl.propgetter
    private List<District> getDistrict() {
        // Automatically generated method. Please do not modify this code.
        return this.district;
    }

    @mdl.propsetter
    private void setDistrict(List<District> value) {
        // Automatically generated method. Please do not modify this code.
        this.district = value;
    }

    @objid ("a80689d1-9a64-4f53-b987-b56ac04995ff")
    public int throwDice() {
    }

    @objid ("9f187e21-a774-43b5-9338-36dd744b418d")
    public void onClickBuy() {
    }

    @objid ("98317826-46d0-4e6b-a5f6-7218ca4d0816")
    public void onClickShowBuildable() {
    }

    @objid ("f481d4be-d791-41d6-a920-8930ab516453")
    public void onClickBuild() {
    }

}
