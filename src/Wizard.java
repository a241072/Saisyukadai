public  class Wizard extends Character {
    private int mp;
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
        mp = 30;
    }

    public void attack(Creature target) {
        System.out.println(getName()+"は火の玉をとなえた"+target.getName()+"に3のダメージ");
        target.setHp(target.getHp()-3);

    }
}

