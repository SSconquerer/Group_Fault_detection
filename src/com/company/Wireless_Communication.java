package com.company;

public class Wireless_Communication {
    float channel_usage;
    float terminal_supply;
    int signal_coverage;

    void Encoding(){
        try {
            //encodes the signal to be sent
        }
        catch(Exception e )
        {  Air_Interference_Issue a = new Air_Interference_Issue();
        a.fault_name="encoding error";}
        finally {
            System.out.println("Execution Finished");
        }

    }

    void encryption(){
        try {
            //encodes the signal to be sent
        }
        catch(Exception e )
        {  Air_Interference_Issue a = new Air_Interference_Issue();
            a.fault_name="encryption  error";}
        finally {
            System.out.println("Execution Finished");
        }

    }

    void Modulation(){
        try {
            //encodes the signal to be sent
        }
        catch(Exception e )
        {  Air_Interference_Issue a = new Air_Interference_Issue();
            a.fault_name="Modulation error";}
        finally {
            System.out.println("Execution Finished");
        }

    }

    void Multiplexing(){
        try {
            //encodes the signal to be sent
        }
        catch(Exception e )
        {  Air_Interference_Issue a = new Air_Interference_Issue();
            a.fault_name="Multiplexing error";}
        finally {
            System.out.println("Execution Finished");
        }

    }

    void main(){
        System.out.println("Wireless communication Event fired....");
    }

}
