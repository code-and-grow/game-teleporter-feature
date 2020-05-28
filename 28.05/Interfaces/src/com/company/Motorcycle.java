package com.company;

import com.sun.jdi.Type;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;

public class Motorcycle implements Vehicle, Value {
    @Override
    public Type type() {
        return null;
    }

    @Override
    public VirtualMachine virtualMachine() {
        return null;
    }

    @Override
    public void drive() {

    }

    @Override
    public void steer() {

    }
}
