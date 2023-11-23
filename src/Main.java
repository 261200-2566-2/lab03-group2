// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Stat wayu=new Stat(10,10,10);
        Stat non=new Stat(5,5,5);

        wayu.equipSheild();
        wayu.equipSword();
        wayu.show();
        non.attack(wayu);
        wayu.show();
        non.levelUp();
        non.levelUp();
        non.levelUp();
        non.levelUp();
        non.attack(wayu);
        wayu.show();
        non.show();
    }
}