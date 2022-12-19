package fr.univ.savoie.isc;

public abstract class Case {
    private String name;
    private Case next;

    public Case(String name) {
        this.name = name;
        this.next = null;
    }

    private String getName() {
        return this.name;
    }

    public Case getNext() {
        return this.next;
    }

    public void setNext(Case next) {
        this.next = next;
    }

    public abstract void action(Player p1);

    public abstract void actionOnPass(Player p1);

}
