package com.company;

/*
public class Main {

    public static void main(String[] args) {
	// write your code here


        Connection_Event E1 = new Connection_Event();
        Wireless_Communication E2 = new Wireless_Communication();
        Roaming_Event E3 = new Roaming_Event();
        Device_Info E4 = new Device_Info();

        E1.main();
        E2.main();
        E3.main();
        E4.main();

    }
}
 */
import java.util.Calendar;


public class Main {

    public static void main(String args[]) {

        Main object = new Main();
        object.Updater();

    }

    private synchronized void Updater() {

        while (true) {
            System.out.println("always running program ==> " + Calendar.getInstance().getTime());
            Connection_Event E1 = new Connection_Event();
            Wireless_Communication E2 = new Wireless_Communication();
            Roaming_Event E3 = new Roaming_Event();
            Device_Info E4 = new Device_Info();

            E1.main();
            E2.main();
            E3.main();
            E4.main();
            try {
                this.wait(8000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
