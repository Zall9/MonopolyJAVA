package fr.univ.savoie.isc;


public class AvailableState implements State {

    private PropertyCase propertyCase;

    public AvailableState(PropertyCase propertyCase) {
        this.propertyCase = propertyCase;
    }

    public void action(Player player) {
        //TODO action AvailableState
        System.out.println("action on " + this.propertyCase.getName());
        /* il ne faudrait pas que cette fonction affiche des choses dans la console,
        il faut trouver un moyen de faire remonter l'info que la case est disponible a l'achat
        cette info doit remonter jusqu'a la classe Game pour que cette dernière puisse
        proposer l'achat, l'achat est lancé avec la fonction onClickBuy() de la classe Game
         */
    }

    public void buy() {
        //TODO buy AvailableState
    }

    public void showBuildable() { }

    public void build() { }
}
