package com.company;

public class Device_Issue implements Device_fault{
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
    }

    @Override
    public void fault_type() {
        fault_type="Device Fault";
    }
}
