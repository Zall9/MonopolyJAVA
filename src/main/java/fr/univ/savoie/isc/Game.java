package fr.univ.savoie.isc;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> player = new ArrayList<Player>();

    private List<Case> cases = new ArrayList<Case>();

    private List<Case> getCases() {
        // Automatically generated method. Please do not modify this code.
        return this.cases;
    }

    private void setCases(List<Case> value) {
        // Automatically generated method. Please do not modify this code.
        this.cases = value;
    }

    private List<District> district = new ArrayList<District>();

    private List<District> getDistrict() {
        // Automatically generated method. Please do not modify this code.
        return this.district;
    }

    private void setDistrict(List<District> value) {
        // Automatically generated method. Please do not modify this code.
        this.district = value;
    }

    public int throwDice() {
        return 0;
    }

    public void onClickBuy() {
    }

    public void onClickShowBuildable() {
    }

    public void onClickBuild() {
    }

}
