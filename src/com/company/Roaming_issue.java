package com.company;

public class Roaming_issue implements Roaming_fault{
    String fault_type;
    float fault_percent;
    String fault_name;
    @Override
    public void fault_type() {
        fault_type="Roaming Fault";
    }

    @Override
    public void find_fault() {
        //Find fault using ml
    }

    @Override
    public void display_fault() {
        //Display fault
    }
}
