import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4c703413-60e6-4739-9ef8-155924428b61")
public abstract class BuyableCase extends Case {
    @mdl.prop
    @objid ("85386901-bc17-4ce2-931a-5e7a501a8275")
    private int price;

    @mdl.propgetter
    private int getPrice() {
        // Automatically generated method. Please do not modify this code.
        return this.price;
    }

    @mdl.propsetter
    private void setPrice(int value) {
        // Automatically generated method. Please do not modify this code.
        this.price = value;
    }

    @mdl.prop
    @objid ("d175cab6-33c9-4397-a8b9-75428edad5fb")
    private Player owner;

    @mdl.propgetter
    private Player getOwner() {
        // Automatically generated method. Please do not modify this code.
        return this.owner;
    }

    @mdl.propsetter
    private void setOwner(Player value) {
        // Automatically generated method. Please do not modify this code.
        this.owner = value;
    }

    @objid ("161dff74-ae97-43de-acd2-528f1a75869e")
    private District district;

    @objid ("dc055bb8-e8f2-4206-b35f-bb6609ca7d50")
    public void buy(Player p1) {
    }

    @objid ("7815f48f-34e0-4439-a615-2002fc476263")
    public void setOwner(Player p1) {
    }

    @objid ("2a86dc8e-001b-43b6-81c9-13ac17c49519")
    public abstract void becomeBuildable();

    @objid ("486f433d-e7a5-430f-8d5a-e949f94d4d31")
    public abstract void becomeBought();

    @objid ("89c4c14e-eda4-4574-bbc8-596a427a46b6")
    public abstract void showBuildable();

    @objid ("10f9af41-c9d1-4865-ae05-bb9aa258b0da")
    public abstract void build();

    @objid ("b072d492-5e8f-4171-bfa7-20d26baac6a9")
    District getDistrict() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.district;
    }

    @objid ("723dc953-7844-45c4-98dc-a10edcfc618e")
    void setDistrict(District value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.district = value;
    }

}
