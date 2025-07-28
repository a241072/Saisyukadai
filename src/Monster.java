public abstract class Monster implements Creature {

    private String name;
    private char suffix;
    private int hp;

    public Monster(String name, char suffix, int hp) {
        this.name = name;
        this.hp = hp;
        this.suffix = suffix;
    }

    public final boolean isAlive(){
        if(getHp() > 0){
            return true;
        }
        else {
            return false;
        }
    }
    public void showStats(){
        System.out.println(getName()+suffix+"HP"+getHp());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

