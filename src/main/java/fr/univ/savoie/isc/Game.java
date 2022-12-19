package fr.univ.savoie.isc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private List<Player> players = new ArrayList<Player>();
    private List<Case> cases = new ArrayList<Case>();
    private List<District> districts = new ArrayList<District>();
    private Player currentPlayer;

    public Game() {
        //TODO constructor Game
        // build the board here

        // Districts
        District marron = new District("Marron", 50);
        District bleuClair = new District("Bleu Clair", 50);
        District violet = new District("Violet", 100);
        District orange = new District("Orange", 100);
        District rouge = new District("Rouge", 150);
        District jaune = new District("Jaune", 150);
        District vert = new District("Vert", 200);
        District bleuFonce = new District("Bleu Foncé", 200);

        this.districts.add(marron);
        this.districts.add(bleuClair);
        this.districts.add(violet);
        this.districts.add(orange);
        this.districts.add(rouge);
        this.districts.add(jaune);
        this.districts.add(vert);
        this.districts.add(bleuFonce);

        // bas
        AngleCase        c0 = new AngleCase("DEPART");
        BuyableCase      c1 = new PropertyCase("BOULEVARD DE BELLEVILLE", 60, 2, 10, 30, 90, 160, 250);
        AngleCase        c2 = new AngleCase("CAISSE DE COMMUNAUTE");
        BuyableCase      c3 = new PropertyCase("RUE LECOURBE", 60, 4, 20, 60, 180, 320, 450);
        TaxCase          c4 = new TaxCase("IMPOTS SUR LE REVENU", 200);
        TrainStationCase c5 = new TrainStationCase("GARE MONTPARNASSE", 200);
        BuyableCase      c6 = new PropertyCase("RUE VAUGIRARD", 100, 6, 30, 90, 270, 400, 550);
        AngleCase        c7 = new AngleCase("CHANCE");
        BuyableCase      c8 = new PropertyCase("RUE DE COURCELLES", 100, 6, 30, 90, 270, 400, 550);
        BuyableCase      c9 = new PropertyCase("AVENUE DE LA REPUBLIQUE", 120, 8, 40, 100, 300, 450, 600);

        c0.setNext(c1);
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        c4.setNext(c5);
        c5.setNext(c6);
        c6.setNext(c7);
        c7.setNext(c8);
        c8.setNext(c9);

        marron.addBuyableCase(c1);
        marron.addBuyableCase(c3);

        bleuClair.addBuyableCase(c6);
        bleuClair.addBuyableCase(c8);
        bleuClair.addBuyableCase(c9);

        // gauche
        // http://www.monopolypedia.fr/editions/france/classique2014/monopoly-classique-plateau.jpg

    }

    public int throwDice() {
        int numberOfDice = 2;
        int diceResult = 0;

        for(int i=0; i<numberOfDice; i++)
            diceResult += new Random().nextInt(6) + 1;

        return diceResult;
    }

    public void onClickBuy() {
        //TODO onClickBuy Game
    }

    public void onClickShowBuildable() {
        this.currentPlayer.showMyBuildables();
    }

    public void onClickBuild() {
        //TODO onClickBuild Game
    }

}
