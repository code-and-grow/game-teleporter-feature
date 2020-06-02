package com.company;

public interface PersonalCode {

    default boolean isHuman(){
        return true;
    }

    char getSugu();
    int getSynniAasta();
    String getSynniKuu();
    int getSynniPaevaPaev();
    String getSynniPaev();
    int getVanus();

    int age = 0;
}
