import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60eeb23f-79a9-4a75-aa54-3458d76cc5fa")
public interface State {
    @objid ("45a37dd0-3541-4c70-bded-ee1c3519dbeb")
    void action(Player p1);

    @objid ("30adc4b5-a40c-478e-a187-6defdbb37aa1")
    void buy();

    @objid ("114e81f9-310b-4829-926c-375da13a5c34")
    void buyHouse();

    @objid ("24745e0e-ade5-49b9-98b2-634f7c3ffe20")
    void buyHotel();

    @objid ("9bf0a0a0-2c2b-4bed-8564-1b6da2ab9deb")
    void showBuildable();

    @objid ("5adc58be-e6d3-4d45-bc44-01577a645f7a")
    void build();

    @objid ("96820037-2ea0-43bb-a4fa-72fa8210a8ce")
    PropertyCase get();

    @objid ("e84778d5-5689-4b91-bae4-d4c14507ac62")
    void set(PropertyCase value);

}
