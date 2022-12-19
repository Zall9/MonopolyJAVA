package fr.univ.savoie.isc;

public class TaxCase extends Case {

    private int cost;

    public TaxCase(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    private int getCost() {
        return this.cost;
    }

    @Override
    public void action(Player player) {
        // TODO action TaxCase
        
    }

    @Override
    public void actionOnPass(Player player) { }

}
