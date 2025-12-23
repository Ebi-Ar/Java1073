public class AttendeePass extends ConferencePass {
	private int numExtraBanquetTickets;

	public AttendeePass(String nameIn, boolean memberAcmIn, int numExtraBanquetTickets) {
		super(nameIn, memberAcmIn);
		this.numExtraBanquetTickets = numExtraBanquetTickets;
	}

	public int getTotalBanquetTickets() {
		return 1 + numExtraBanquetTickets;
	}

	public double totalCost() {
		double total;
		double basePrice = 225.00;
		double selfbanquetTikcetPrice = 45.00;
		double guestBanquetTicketPrice = 53.25;

		total = basePrice + selfbanquetTikcetPrice; // attendee Ticket Price only

		double guestPrice = numExtraBanquetTickets * guestBanquetTicketPrice; // guest price = number of their tickets *
		// specific price for each extra guest.

		total += guestPrice; // total = attendee + guest

		if (getMemberAcm()) {
			total = total - (total * 0.20);
		}
		return total;
	}

}
