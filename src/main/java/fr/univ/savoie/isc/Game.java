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
        // http://www.monopolypedia.fr/editions/france/classique2014/monopoly-classique-plateau.jpg

        // All Cases

        // bottom
        AngleCase        c0  = new AngleCase("DEPART");
        BuyableCase      c1  = new PropertyCase("BOULEVARD DE BELLEVILLE", 60, 2, 10, 30, 90, 160, 250);
        AngleCase        c2  = new AngleCase("CAISSE DE COMMUNAUTE");
        BuyableCase      c3  = new PropertyCase("RUE LECOURBE", 60, 4, 20, 60, 180, 320, 450);
        TaxCase          c4  = new TaxCase("IMPOTS SUR LE REVENU", 200);
        TrainStationCase c5  = new TrainStationCase("GARE MONTPARNASSE", 200);
        BuyableCase      c6  = new PropertyCase("RUE VAUGIRARD", 100, 6, 30, 90, 270, 400, 550);
        AngleCase        c7  = new AngleCase("CHANCE");
        BuyableCase      c8  = new PropertyCase("RUE DE COURCELLES", 100, 6, 30, 90, 270, 400, 550);
        BuyableCase      c9  = new PropertyCase("AVENUE DE LA REPUBLIQUE", 120, 8, 40, 100, 300, 450, 600);

        // left
        AngleCase        c10 = new AngleCase("PRISON");
        BuyableCase      c11 = new PropertyCase("BOULEVARD DE LA VILETTE", 140, 10, 50, 150, 450, 625, 750);
        EnergyCase       c12 = new EnergyCase("COMPAGNIE DE DISTRIBUTION D'ELECTICITE", 150);
        BuyableCase      c13 = new PropertyCase("AVENUE DE NEUILLY", 140, 10, 50, 150, 450, 625, 750);
        PropertyCase     c14 = new PropertyCase("RUE DE PARADIS", 160, 12, 60, 180, 500, 700, 900);
        TrainStationCase c15 = new TrainStationCase("GARE DE LYON", 200);
        BuyableCase      c16 = new PropertyCase("AVENUE MOZART", 180, 14, 70, 200, 550, 750, 950);
        AngleCase        c17 = new AngleCase("CAISSE DE COMMUNAUTE");
        BuyableCase      c18 = new PropertyCase("BOULEVARD SAINT-MICHEL", 180, 14, 70, 200, 550, 750, 950);
        BuyableCase      c19 = new PropertyCase("PLACE PIGALLE", 200, 16, 80, 220, 600, 800, 1000);

        // top
        AngleCase        c20 = new AngleCase("PARC GRATUIT");
        BuyableCase      c21 = new PropertyCase("AVENUE MATIGNON", 220, 18, 90, 250, 700, 875, 1050);
        AngleCase        c22 = new AngleCase("CHANCE");
        PropertyCase     c23 = new PropertyCase("BOULEVARD MALESHERBES", 220, 18, 90, 250, 700, 875, 1050);
        PropertyCase     c24 = new PropertyCase("AVENUE HENRI-MARTIN", 240, 20, 100, 300, 750, 925, 1100);
        TrainStationCase c25 = new TrainStationCase("GARE DU NORD", 200);
        BuyableCase      c26 = new PropertyCase("FAUBOURG SAINT-HONORE", 260, 22, 110, 330, 800, 975, 1150);
        PropertyCase     c27 = new PropertyCase("PLACE DE LA BOURSE", 260, 22, 110, 330, 800, 975, 1150);
        EnergyCase       c28 = new EnergyCase("COMPAGNIE DE DISTRIBUTION DES EAUX", 150);
        BuyableCase      c29 = new PropertyCase("RUE LA FAYETTE", 280, 24, 120, 360, 850, 1025, 1200);

        // bottom
        AngleCase        c30 = new AngleCase("ALLEZ EN PRISON");
        BuyableCase      c31 = new PropertyCase("AVENUE DE BRETEUIL", 300, 26, 130, 390, 900, 1100, 1275);
        BuyableCase      c32 = new PropertyCase("AVENUE FOCH", 300, 26, 130, 390, 900, 1100, 1275);
        AngleCase        c33 = new AngleCase("CAISSE DE COMMUNAUTE");
        PropertyCase     c34 = new PropertyCase("BOULEVARD DES CAPUCINE", 320, 28, 150, 450, 1000, 1200, 1400);
        TrainStationCase c35 = new TrainStationCase("GARE SAINT-LAZARE", 200);
        AngleCase        c36 = new AngleCase("CHANCE");
        BuyableCase      c37 = new PropertyCase("AVENUE DES CHAMPS-ELYSEES", 350, 35, 175, 500, 1100, 1300, 1500);
        TaxCase          c38 = new TaxCase("TAXE DE LUXE", 100);
        BuyableCase      c39 = new PropertyCase("RUE DE LA PAIX", 400, 50, 200, 600, 1400, 1700, 2000);


        // add all cases
        cases.add(c1);
        cases.add(c2);
        cases.add(c3);
        cases.add(c4);
        cases.add(c5);
        cases.add(c6);
        cases.add(c7);
        cases.add(c8);
        cases.add(c9);
        cases.add(c10);
        cases.add(c11);
        cases.add(c12);
        cases.add(c13);
        cases.add(c14);
        cases.add(c15);
        cases.add(c16);
        cases.add(c17);
        cases.add(c18);
        cases.add(c19);
        cases.add(c20);
        cases.add(c21);
        cases.add(c22);
        cases.add(c23);
        cases.add(c24);
        cases.add(c25);
        cases.add(c26);
        cases.add(c27);
        cases.add(c28);
        cases.add(c29);
        cases.add(c30);
        cases.add(c31);
        cases.add(c32);
        cases.add(c33);
        cases.add(c34);
        cases.add(c35);
        cases.add(c36);
        cases.add(c37);
        cases.add(c38);
        cases.add(c39);

        // link all cases
        for(int i=0; i<cases.size()-1; i++) {
            cases.get(i).setNext(cases.get(i+1));
        }
        cases.get(38).setNext(cases.get(0));


        // Districts
        District brown = new District("Marron", 50);
        District lightBlue = new District("Bleu Clair", 50);
        District violet = new District("Violet", 100);
        District orange = new District("Orange", 100);
        District red = new District("Rouge", 150);
        District yellow = new District("Jaune", 150);
        District green = new District("Vert", 200);
        District darkBlue = new District("Bleu Foncé", 200);

        this.districts.add(brown);
        this.districts.add(lightBlue);
        this.districts.add(violet);
        this.districts.add(orange);
        this.districts.add(red);
        this.districts.add(yellow);
        this.districts.add(green);
        this.districts.add(darkBlue);

        brown.addBuyableCase(c1);
        brown.addBuyableCase(c3);

        lightBlue.addBuyableCase(c6);
        lightBlue.addBuyableCase(c8);
        lightBlue.addBuyableCase(c9);

        violet.addBuyableCase(c11);
        violet.addBuyableCase(c13);
        violet.addBuyableCase(c14);

        orange.addBuyableCase(c16);
        orange.addBuyableCase(c18);
        orange.addBuyableCase(c19);

        red.addBuyableCase(c21);
        red.addBuyableCase(c23);
        red.addBuyableCase(c24);

        yellow.addBuyableCase(c26);
        yellow.addBuyableCase(c27);
        yellow.addBuyableCase(c29);

        green.addBuyableCase(c31);
        green.addBuyableCase(c32);
        green.addBuyableCase(c34);

        darkBlue.addBuyableCase(c37);
        darkBlue.addBuyableCase(c39);

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
