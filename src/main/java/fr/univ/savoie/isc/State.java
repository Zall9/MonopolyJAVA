package fr.univ.savoie.isc;

public interface State {

    void action(Player player);
    void showBuildable();
    void build();
    String toString();
}
