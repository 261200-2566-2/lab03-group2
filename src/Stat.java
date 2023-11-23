public class Stat {
    double maxHp=100;
    double maxMana=50;
    double runSpeed;
    double baseRunSpeed;
    Sword sword;
    Shield shield;
    int lvl=0;

    public Stat(Sword sword,Shield shield,double runSpeed){
        baseRunSpeed=runSpeed;
        this.runSpeed=runSpeed*(0.1+0.03*lvl);
        this.sword=sword;
        if(sword!=null) this.runSpeed-=baseRunSpeed*(0.1+0.04*sword.lvl);
        this.shield=shield;
        if(shield!=null) this.runSpeed-=baseRunSpeed*(0.1+0.08*shield.lvl);

    }
    void levelUp(){
        lvl++;
        maxHp=100+(10*lvl);
        maxMana=100+(10*lvl);
        runSpeed=baseRunSpeed*(0.1+0.03*lvl);
        if(sword!=null) this.runSpeed-=baseRunSpeed*(0.1+0.04*sword.lvl);
        if(shield!=null) this.runSpeed-=baseRunSpeed*(0.1+0.08*shield.lvl);
    }
    void unequipSword(){

    }
    void unequipShield(){

    }
    void equipSword(Sword sword){
        this.runSpeed-=baseRunSpeed*(0.1+0.04*lvl);
    }
    void equipSheild(Shield shield){
        this.runSpeed-=baseRunSpeed*(0.1+0.08*lvl);
    }

    void show(){
        System.out.println("////////////////////");
        System.out.println("Hp : "+this.maxHp);
        System.out.println("Mana : "+this.maxMana);
        System.out.println("damage : "+this.swordDamage);
        System.out.println("def : "+this.shieldDefense);
        System.out.println("level : "+this.level);
        System.out.println("Max runSpeed : "+this.maxRunSpeed);

    }

    double attack(Stat op){
        if(op.def>=damage)return op.maxHp;
        return op.maxHp=op.maxHp+op.def-damage;
    }

}
