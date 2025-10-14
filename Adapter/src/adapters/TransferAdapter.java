package adapters;

import models.Cash;
import models.Transfer;

public class TransferAdapter extends Cash {
	
	Transfer transfer;

	public TransferAdapter(Transfer transfer) {
		super(transfer.getAmount() * 6/5);
		this.transfer = transfer;
		// TODO Auto-generated constructor stub
	}
	
	public int getAmount() {
		return transfer.getAmount() * 6/5;
	}

}
