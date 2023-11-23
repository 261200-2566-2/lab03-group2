public class Sword {
    public String name;
    public double baseDamage;
    public int lvl=0;
    public double swordDamage;
    public Sword(String name, double baseDamage){
        this.name=name;
        this.baseDamage=baseDamage;
        swordDamage = baseDamage;
    }
    public void show(){
        System.out.println("name : "+name);
        System.out.println("damage : "+swordDamage);
        System.out.println("level :"+lvl);
    }
    public void levelUp(){
        lvl++;
        swordDamage = baseDamage*(1+0.1*lvl);
    }

}
