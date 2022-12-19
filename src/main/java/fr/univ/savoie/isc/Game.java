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
