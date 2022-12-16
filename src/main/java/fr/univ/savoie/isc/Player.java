import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e4be8414-719c-427f-accc-3bfa79f54bac")
public class Player {
    @mdl.prop
    @objid ("2be9be55-d345-4698-9291-fbeac75a5a90")
    private double money;

    @mdl.propgetter
    private double getMoney() {
        // Automatically generated method. Please do not modify this code.
        return this.money;
    }

    @mdl.propsetter
    private void setMoney(double value) {
        // Automatically generated method. Please do not modify this code.
        this.money = value;
    }

    @mdl.prop
    @objid ("23a326ef-2dbb-422c-91f5-2fa38e762563")
    private Case position;

    @mdl.propgetter
    private Case getPosition() {
        // Automatically generated method. Please do not modify this code.
        return this.position;
    }

    @mdl.propsetter
    private void setPosition(Case value) {
        // Automatically generated method. Please do not modify this code.
        this.position = value;
    }

    @objid ("405b184d-6e3c-4560-805d-10a971a962fa")
    private BuyableCase properties;

    @objid ("4a30aa09-c11e-4e56-8e44-cc85db6ceca0")
    public void addProperty(BuyableCase p1) {
    }

    @objid ("a352b64d-9d86-43dc-a666-9000c87e2711")
    public void move(int p1) {
    }

    @objid ("1b780c39-ba4b-4271-b477-bad7e536b991")
    public void buy() {
    }

    @objid ("94ef6818-ed35-403f-92bc-54334f08e512")
    public void showMyBuildables() {
    }

    @objid ("d8792e3f-1585-43c9-ac70-445474937d99")
    public void pay(Player owner, int price) {
    }

    @objid ("2217290f-e6db-403e-8073-29b9b7ddd2a4")
    public void getPaid(int rent) {
    }

    @objid ("f939446b-56be-4109-92dc-f23a24129ba8")
    BuyableCase getProperties() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.properties;
    }

    @objid ("10378c77-7f7d-4d5b-97d8-da5b7c9e5ba3")
    void setProperties(BuyableCase value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.properties = value;
    }

}
