package fr.univ.savoie.isc;

public interface State {

    void action(Player player);
    void buy();
    void showBuildable();
    void build();
}
