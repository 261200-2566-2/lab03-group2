public class Shield {
    public String name;
    public double baseDefense;
    public double shieldDefense;
    public int lvl=0;
    public Shield(String name, double baseDefense){
        this.name=name;
        this.baseDefense=baseDefense;
        shieldDefense=baseDefense;
    }
    public void show(){
        System.out.println("name : "+name);
        System.out.println("defense : "+shieldDefense);
        System.out.println("level :"+lvl);
    }
    public void levelUp(){
        lvl++;
        shieldDefense = baseDefense*(1+0.05*lvl);
    }

}
