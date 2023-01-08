package fr.univ.savoie.isc;

public interface State {

    void action(Player player);
    boolean isBuildable();
    void build();
    String toString();
}
