public class ExhibitorPass extends ConferencePass {

    private int numOfTables;
    private boolean powerOutlet;

    public ExhibitorPass(String nameIn, boolean memberAcmIn, int numOfTablesIn, boolean powerOutletIn) {
        super(nameIn, memberAcmIn);
        numOfTables = numOfTablesIn;
        powerOutlet = powerOutletIn;
    }

    public int getNumOfTables() {
        return numOfTables;
    }

    public boolean getPowerOutlet() {
        return powerOutlet;
    }

    public double totalCost() {

        double basePrice;
        double tableCost = numOfTables * 9.45;

        if (!powerOutlet) {
            basePrice = 350.75;
        } else {
            basePrice = 420.55;
        }

        double Cost = basePrice + tableCost;

        if (getMemberAcm()) {
            Cost = Cost - (Cost * 0.15);
        }

        return Cost;

    }

}
