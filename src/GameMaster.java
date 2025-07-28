import java.util.ArrayList;
import java.util.Calendar;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", "剣", 100);
        Wizard wizard = new Wizard("魔法使い", 60, 30);
        Thief thief = new Thief("盗賊", 70);
        Goblin goblin = new Goblin('A', 50);
        Matango matango = new Matango('B', 45);
        Slime slime = new Slime('C', 40);
        ArrayList<Character> char_list = new ArrayList<>();
        char_list.add(hero);
        char_list.add(wizard);
        char_list.add(thief);
        ArrayList<Monster> char_list1 = new ArrayList<>();
        char_list1.add(goblin);
        char_list1.add(matango);
        char_list1.add(slime);

        for (Character character : char_list) {
            character.showStats();
        }
        for (Monster monster : char_list1) {
            monster.showStats();
        }

        for (Character character : char_list) {
            for (Monster monster : char_list1) {
                character.attack(monster);
            }
        }

        for (Monster monster : char_list1) {
            for (Character character : char_list) {
                monster.attack(character);
            }
        }


        SuperHero superHero = new SuperHero(hero);
        char_list.set(0, superHero);
        for(Monster monster : char_list1) {
            superHero.attack(monster);
        }

        for (Character character : char_list) {
            character.showStats();
            if(character.isAlive()){
                System.out.println("生存");
            }else{
                System.out.println("全滅");
            }
        }
        for (Monster monster : char_list1) {
            monster.showStats();
            if(monster.isAlive()) {
               System.out.println("生存");
            }else{
                System.out.println("生存状況:討伐済み");
            }
        }
    }
}


