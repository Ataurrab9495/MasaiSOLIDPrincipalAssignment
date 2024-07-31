public class Main {
    public static void main(String[] args){
        Switchable switchable = new Lamp();
        Switch lampSwitch = new Switch(switchable);
        lampSwitch.operate();
    }
}


/* 
 * class Lamp {
    public void turnOn() {
        System.out.println("Lamp turned on");
    }
}

class Switch {
    private Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void operate() {
        lamp.turnOn();
    }
}
 */


 /* 
  * 1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
    2. Abstractions should not depend on details. Details should depend on abstractions.
  */

interface Switchable {
    void turnOn();
}

class Lamp implements Switchable {
    public void turnOn(){
        System.out.println("Lamp turned on.");
    }
}

class Switch {
    private Switchable mSwitchable;

    public Switch(Switchable mSwitchable){
        this.mSwitchable = mSwitchable;
    }

    public void operate() {
        mSwitchable.turnOn();
    }
}