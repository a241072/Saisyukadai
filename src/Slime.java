public  class Slime extends Monster{
    public   Slime(char suffix, int hp) {
        super("スライム",suffix,hp);
    }

    @Override
    public final void attack(Creature target) {
        System.out.println(getName()+getSuffix()+"はたいあたり攻撃"+target.getName()+"に5ダメージ");
        target.setHp(target.getHp()-5);
    }
}
