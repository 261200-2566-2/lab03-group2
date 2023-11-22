public class Stat {
    private double maxHp;
    private double maxMana;
    private double damage;
    private double def;
    private double runSpeed;

    public Stat(double damage,double def,double runSpeed){
        this.maxHp=100;
        this.maxMana=50;
        this.def=def;
        this.damage=damage;
        this.runSpeed=runSpeed;

    }
    public void levelUp(int level){
        this.maxHp=100+(10*level);
        this.maxMana=100+(10*level);
        this.damage*=(1+0.1*level);
        this.def*=(1+0.05*level);
        this.runSpeed*=(0.1+0.03*level);
    }

    public void equipSword(int level){
        this.runSpeed-=(0.1+0.04*level);
    }
    public void equipSheild(int level){
        this.runSpeed-=(0.1+0.08*level);
    }
}
