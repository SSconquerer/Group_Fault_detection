package com.company;

import java.util.Random;

public class Connection_issue implements Connection_fault {
    String fault_type,f1;
    float fault_percent,f2;
    int f3;
    String fault_name;
    Connection_issue(String f1, float f2 ,int f3){
        this.f1=f1;
        this.f2=f2;
        this.f3=f3;
    }
    @Override
    public void fault_type() {
        fault_type="Connection Fault";
    }

    @Override
    public void find_fault() {
          //Find fault using ml
    }

    @Override
    public void display_fault() {
          //Display fault
    }

    int isfault(){
        //   if(fault_percent<0.5)return 0;
        Random rand = new Random();
        if(rand.nextDouble()<0.5)return 0;
        else return 1;
    }
}
