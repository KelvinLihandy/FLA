package adapters;

import models.Cash;
import models.Qris;

public class QrisAdapter extends Cash {
	
	Qris qris;

	public QrisAdapter(Qris qris) {
		super(qris.getAmount() * 3/2);
		this.qris = qris;
		// TODO Auto-generated constructor stub
	}
	
	public int getAmount() {
		return qris.getAmount() * 3/2;
	}
	
}
