public class Shield {
    String name;
    double baseDefense;
    boolean equip = true;
    int lvl=0;
    Shield(String name, double baseDefense){
        this.name=name;
        this.baseDefense=baseDefense;
    }
    void show(){
        System.out.println("name : "+name);
        System.out.println("base defense : "+baseDefense);
    }

}
