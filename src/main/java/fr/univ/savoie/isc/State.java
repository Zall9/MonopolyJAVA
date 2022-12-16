package fr.univ.savoie.isc;

public interface State {

    void action(Player p1);

    void buy();

    void buyHouse();

    void buyHotel();

    void showBuildable();

    void build();

    PropertyCase get();

    void set(PropertyCase value);

}
