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
        // TODO manageDistrictState District
        /*
        - si proriété achetée : BoughtState
        - si toutes achetées par le même joueur : BuildableState
        - si commencé a construire mais en attente d'une autre construction ailleur : WaitingBuildableState
        - si hotel construit : HotelBuiltState
        */
        for (PropertyCase pc : this.propertyCases) {
            if (pc.getOwner() != null) {
                pc.becomeBought();
            }
            for (PropertyCase pc2 : this.propertyCases) {
                if (pc2.getOwner() != pc.getOwner()) {
                    //pardon madame pour le break :(
                    break;
                }
                pc.becomeBuildable();
            }
            if (pc.getNbHouse() == 4) {
                pc.becomeHotelBuilt();
            }
            for (PropertyCase pc3 : this.propertyCases) {
                if (pc3.getOwner() == pc.getOwner()) {
                    if (pc3.getDistrict() == pc.getDistrict() && pc3.getNbHouse() < pc.getNbHouse()) {
                        pc.becomeWaitingbuildableState();
                    }

                }
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
}