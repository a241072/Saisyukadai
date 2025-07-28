public  class Goblin extends Monster{
    public Goblin( char suffix, int hp) {
        super("ゴブリン", suffix, hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(getName()+getSuffix()+"はナイフで切り付けた"+target.getName()+"に8ダメージ");
        target.setHp(target.getHp()-8);
    }
}
