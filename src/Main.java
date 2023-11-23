// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Sword claw = new Sword("Claw",10);
        System.out.println("Show stat weapon ///////////////");
        claw.show();
        Sword hammer = new Sword("Hammer",30);
        Shield ironShield = new Shield("iron shield",10);
        ironShield.show();
        Stat wayu=new Stat("wayu",hammer,null);
        Stat non=new Stat("non",claw,ironShield);
        System.out.println("Show hero after created /////////////");
        wayu.show();
        System.out.println("Wayu unequipped sword /////////");
        wayu.unequipSword();
        wayu.show();
        wayu.equipSword(hammer);

        System.out.println("Non unequipped shield ////////////");
        non.unequipShield();
        non.show();
        non.equipShield(ironShield);

        System.out.println("Attack phase ///////////////////");

        non.attack(wayu);
        wayu.attack(non);
        wayu.attack(non);
        wayu.attack(non);
        wayu.attack(non);
        wayu.attack(non);

        wayu.show();
        System.out.println("Aliasing check///////////////////");
        hammer.show();
        System.out.println("wayu's hammer");
        wayu.sword.show();
    }
}