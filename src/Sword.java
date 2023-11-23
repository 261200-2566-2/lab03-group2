public class Sword {
    String name;
    double baseDamage;
    int lvl=0;
    boolean equip = false;
    Sword(String name, double baseDamage){
        this.name=name;
        this.baseDamage=baseDamage;
    }
    void show(){
        System.out.println("name : "+name);
        System.out.println("base damage : "+baseDamage);
    }
}
