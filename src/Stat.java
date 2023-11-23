public class Stat {
    double maxHp;
    double maxMana;
    double damage;
    double def;
    double runSpeed;

    int level=0;

    public Stat(double damage,double def,double runSpeed){
        maxHp=100;
        maxMana=50;
        this.def=def;
        this.damage=damage;
        this.runSpeed=runSpeed;

    }
    public void levelUp(){
        level++;
        maxHp=100+(10*level);
        maxMana=100+(10*level);
        damage*=(1+0.1*level);
        def*=(1+0.05*level);
        runSpeed*=(0.1+0.03*level);
    }

    public void equipSword(){
        this.runSpeed-=(0.1+0.04*level);


    }
    public void equipSheild(){
        this.runSpeed-=(0.1+0.08*level);
    }

    public void show(){
        System.out.println("////////////////////");
        System.out.println("Hp"+this.maxHp);
        System.out.println("Mana"+this.maxMana);
        System.out.println("damage"+this.damage);
        System.out.println("def"+this.def);
        System.out.println("level"+this.level);
        System.out.println("reunSpeed"+this.runSpeed);

    }

    public double attack(Stat op){
        if(op.def>=damage)return op.maxHp;
        return op.maxHp=op.maxHp+op.def-damage;
    }

}
