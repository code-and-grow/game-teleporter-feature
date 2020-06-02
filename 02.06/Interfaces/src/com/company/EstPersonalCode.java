package com.company;

public class EstPersonalCode implements PersonalCode {

    String isikukood = "39006021234";

    public EstPersonalCode(String isikukood) {
        this.isikukood = isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public char getSugu() {
        String firstNumber = this.isikukood.substring(0,1);
        if (firstNumber.equals("1") || firstNumber.equals("3") || firstNumber.equals("5")) {
            return 'M';
        } else if (firstNumber.equals("2") || firstNumber.equals("4") || firstNumber.equals("6")) {
            return 'N';
        }
        return 0;
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

    @Override
    public String toString() {
        return "isikukood='" + isikukood;
    }
}
