package com.company;

public class Connection_Event {

    String protocol ;
    float Flow_bytes ;
    int dhcpfeature ;

    private float getFlowbyte() {
        return Flow_bytes;
    }

    private String getProtocol() {
        return protocol;
    }

 ;

    int DHCP_Event(){
        //dhcp discover
        //dhcp offer
        //dhcp request
        //dhcp ack

    return dhcpfeature;
    }

    void connection(){

    }

    void association(){

    }
    void main(){
        Connection_issue a = new Connection_issue(getProtocol(), getFlowbyte() , DHCP_Event());
        //a.fault_name="encoding error";
        if(a.isfault()==1) System.out.println("Connection Fault.....................................................DO SOMETHING.............................");
        System.out.println("Connection Event fired....");
    }
}
