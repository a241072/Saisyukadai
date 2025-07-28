public abstract class Character implements Creature{


    private  int hp;
    private  String name;

    public Character(String name,int hp){
       this.name = name;
        this.hp = hp;
    }

    public Character() {

    }

    public final boolean isAlive(){
        if(getHp() > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public void showStats(){
        System.out.println(getName()+";hp"+getHp());
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



