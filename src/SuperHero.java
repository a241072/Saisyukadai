public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(), hero.getWeapon(), hero.getHp());
    }

    public void attack(Creature target) {
        System.out.println(getName()+"は"+getWeapon()+"で攻撃"+target.getName()+"に25ダメージ");
      target.setHp(target.getHp()-25);
    }
}