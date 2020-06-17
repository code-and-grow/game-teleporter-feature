package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank(10, BankType.LHV);



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
//        bank.deposit(20);
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(30, bank.getBalance() );
    }

    @org.junit.jupiter.api.Test
    void getBank() {
        assertEquals(BankType.LHV, bank.getBank() );
    }

    @org.junit.jupiter.api.Test
    void maxValue() {
        assertEquals(10, bank.maxValue(10,5) );
    }

    @org.junit.jupiter.api.Test
    void equalObjects() {
        Bank bank2 = new Bank(10, BankType.LHV);
        assertEquals(bank, bank2 );
    }
}