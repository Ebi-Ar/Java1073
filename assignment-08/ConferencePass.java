
public abstract class ConferencePass {
    private String name;
    private boolean memberAcm;

    public ConferencePass(String nameIn, boolean memberAcmIn) {
        name = nameIn;
        memberAcm = memberAcmIn;
    }

    public String getName() {
        return name;
    }

    public boolean getMemberAcm() {
        return memberAcm;
    }

    public abstract double totalCost();
}