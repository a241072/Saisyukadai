public  class Matango extends Monster {
    public Matango(char suffix, int hp) {
        super("お化けキノコ" , suffix, hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(getName()+getSuffix()+"はたいあたり攻撃"+target.getName()+"に6ダメージ");
        target.setHp(target.getHp()-6);
    }
}
