package adapters;

import models.*;

public class TransferAdapter extends Cash {

    private Transfer transfer;

    public TransferAdapter(Transfer _transfer){
        super(_transfer.getPrice() * 1.1);
        this.transfer = _transfer;
    }

    public double getAdaptedPrice(){
        return transfer.getPrice() * 1.1;
    }

}
