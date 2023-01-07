package fr.univ.savoie.isc;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String name;
    private int buildPrice;

    private List<PropertyCase> propertyCases;

    public District(String name, int buildPrice) {
        this.name = name;
        this.buildPrice = buildPrice;
        this.propertyCases = new ArrayList<PropertyCase>();
    }

    public String getName() {
        return this.name;
    }

    public int getBuildPrice() {
        return this.buildPrice;
    }

    public List<PropertyCase> getPropertyCases() {
        return this.propertyCases;
    }

    public void addPropertyCase(PropertyCase propertyCase) {
        this.propertyCases.add(propertyCase);
    }


    public void manageDistrictState() {
        // TODO manageDistrictState District --> HotelBuiltState
        /*
        - si proriété achetée : BoughtState
        - si toutes achetées par le même joueur : BuildableState
        - si commencé a construire mais en attente d'une autre construction ailleur : WaitingBuildableState
        - si hotel construit : HotelBuiltState
        */
        for (PropertyCase pc : this.propertyCases) {

            // check if bought
            if (pc.getOwner() != null) {
                pc.becomeBought();
            }

            // check if buildable
            if (haveSameOwner()) {
                // une fois qu'on est assuré que les propriétés ont le même propriétaire :
                // si pc a moins (ou le même nombre) de construction que les autres --> becomeBuildable()
                // si pc a plus de construction qu'au moins une autre propriété --> becomeWaitingbuildableState()
                if (checkIsBuildable(pc))
                    pc.becomeBuildable();
                else
                    pc.becomeWaitingBuildableState();
            }


            // TODO problème ici, a voir quand on arrive a la construction mais a mon avis problème
            if (pc.getNbHouse() == 4) { // > 4 nan ?
                pc.becomeHotelBuilt();
            }
        }
    }


    private boolean haveSameOwner() {
        // on récupère le premier owner
        Player player = this.propertyCases.get(0).getOwner();
        if (player == null) return false;
        String ownerName = player.getName();

        // on compare le premier a tous les autres
        for (int i = 1; i < this.propertyCases.size(); i++) {
            Player owner = this.propertyCases.get(i).getOwner();

            if (owner == null) return false;

            if (!ownerName.equals(owner.getName())) return false;
        }

        return true;
    }

    /**
     * This fonction should only be used inside an if(this.haveSameOwner()) statement
     * @param pc
     * @return
     */
    private boolean checkIsBuildable(PropertyCase pc) {
        for (PropertyCase other : this.propertyCases) {
            if (other.getNbHouse() < pc.getNbHouse())
                return false;
        }
        return true;
    }
}