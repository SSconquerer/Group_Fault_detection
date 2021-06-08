package com.company;

public class Air_Interference_Issue implements Air_interface_fault{
    String fault_type;
    float fault_percent;
    String fault_name;
    @Override
    public void find_fault() {
        //Find fault using ml

    }

    @Override
    public void display_fault() {
        //Display fault
        //display the fault on gui
    }

    @Override
    public void fault_type() {
        fault_type="Air Interference Fault";
    }
}
