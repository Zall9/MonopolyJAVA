package fr.univ.savoie.isc;

public class PropertyCase extends BuyableCase {

    private int rentEmpty;
    private int rent1House;
    private int rent2House;
    private int rent3House;
    private int rent4House;
    private int rentHotel;

    private int nbHouse;

    private State state;

    public PropertyCase(String name, int price, int rentEmpty, int rent1House, int rent2House, int rent3House, int rent4House, int rentHotel) {
        super(name, price);
        this.rentEmpty = rentEmpty;
        this.rent1House = rent1House;
        this.rent2House = rent2House;
        this.rent3House = rent3House;
        this.rent4House = rent4House;
        this.rentHotel = rentHotel;
        this.nbHouse = 0;
        this.state = new AvailableState(this);
    }

    public int getRentEmpty() {
        return this.rentEmpty;
    }

    public int getRent1House() {
        return this.rent1House;
    }

    public int getRent2House() {
        return this.rent2House;
    }

    public int getRent3House() {
        return this.rent3House;
    }

    public int getRent4House() {
        return this.rent4House;
    }

    public int getRentHotel() {
        return this.rentHotel;
    }

    public int getNbHouse() {
        return this.nbHouse;
    }

    public void setNbHouse(int value) {
        this.nbHouse = value;
    }

    @Override
    public void becomeBought() {
        System.out.println(this.getName() + " state changed from " + this.state + " to BoughtState");
        this.state = new BoughtState(this);
    }

    @Override
    public void becomeBuildable() {
        System.out.println(this.getName() + " state changed from " + this.state + " to BuildableState");
        this.state = new BuildableState(this);
    }

    @Override
    public void becomeHotelBuilt() {
        System.out.println(this.getName() + " state changed from " + this.state + " to HotelBuiltState");
        this.state = new HotelBuiltState(this);
    }
    @Override
    public void becomeWaitingBuildableState() {
        System.out.println(this.getName() + " state changed from " + this.state + " to WaitingBuildableState");
        this.state = new WaitingBuildableState(this);
    }
    @Override
    public void action(Player player) {
        System.out.println("State : " + this.state.toString());
        this.state.action(player);
    }

    @Override
    public void actionOnPass(Player player) { }

    @Override
    public boolean isBuildable() {
        return this.state.isBuildable();
    }

    @Override
    public void build() {
        this.state.build();
    }
}
