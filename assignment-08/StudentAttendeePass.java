import java.util.Random;

public class StudentAttendeePass extends AttendeePass {
	private String giveawayItem;

	public StudentAttendeePass(String nameIn, boolean memberAcmIn, int extraBanquetTicketsIn) {
		super(nameIn, memberAcmIn, extraBanquetTicketsIn);

		Random random = new Random();
		int item = random.nextInt(4);

		if (item == 0) {
			giveawayItem = "T-shirt";
		} else if (item == 1) {
			giveawayItem = "Water bottle";
		} else if (item == 2) {
			giveawayItem = "Travel mug";
		} else {
			giveawayItem = "Lanyard";
		}
	}

	public String getGiveawayItem() {
		return giveawayItem;
	}

	public double totalCost() {
		double cost = super.totalCost() - 150.00;
		return cost;
	}
}