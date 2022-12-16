import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bf006bac-62e2-4eb3-b9ca-6ae1363cb01a")
public abstract class Case {
    @mdl.prop
    @objid ("d30a26f5-c593-493e-8a90-8d8bddc430f7")
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
    @objid ("0e37bd05-1c96-4ad9-9ee9-2e155af1c4b9")
    private Case suivante;

    @mdl.propgetter
    private Case getSuivante() {
        // Automatically generated method. Please do not modify this code.
        return this.suivante;
    }

    @mdl.propsetter
    private void setSuivante(Case value) {
        // Automatically generated method. Please do not modify this code.
        this.suivante = value;
    }

    @objid ("6c88c7c2-6b58-4064-97fd-cf821f79d405")
    public abstract void action(Player p1);

    @objid ("5c473fcb-2c8f-4efc-a960-fc4c81632f46")
    public abstract void actionOnPass(Player p1);

}
