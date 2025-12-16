package adapters;

import models.*;

public class CryptoAdapter extends Cash {

    private Crypto crypto;

    public CryptoAdapter(Crypto _crypto){
        super(_crypto.getPrice() / 2);
        this.crypto = _crypto;
    }

    public double getAdaptedPrice(){
        return crypto.getPrice() / 2;
    }

}