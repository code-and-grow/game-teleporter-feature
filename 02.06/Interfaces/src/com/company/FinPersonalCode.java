package com.company;

public class FinPersonalCode implements PersonalCode {

    String isikukood = "230181-237J";

    @Override
    public char getSugu() {
        int genderNumber = Integer.parseInt(this.isikukood.substring(9,10));
        if (genderNumber % 2 == 0) {
            return 'M';
        } else {
            return 'N';
        }
    }

    @Override
    public int getSynniAasta() {
        return 0;
    }

    @Override
    public String getSynniKuu() {
        return null;
    }

    @Override
    public int getSynniPaevaPaev() {
        return 0;
    }

    @Override
    public String getSynniPaev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}
