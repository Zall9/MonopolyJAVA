package fr.univ.savoie.isc;

public abstract class Case {

    private String name;

    private String getName() {
        // Automatically generated method. Please do not modify this code.
        return this.name;
    }

    private void setName(String value) {
        // Automatically generated method. Please do not modify this code.
        this.name = value;
    }

    private Case suivante;

    private Case getSuivante() {
        // Automatically generated method. Please do not modify this code.
        return this.suivante;
    }

    private void setSuivante(Case value) {
        // Automatically generated method. Please do not modify this code.
        this.suivante = value;
    }

    public abstract void action(Player p1);

    public abstract void actionOnPass(Player p1);

}
