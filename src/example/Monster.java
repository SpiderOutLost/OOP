package example;

public class Monster {
    int eyes;
    int arms;
    int legs;

    Monster() {
        this(2);

    }


    Monster(int eyes, int arms, int legs) {
        this.legs = legs;
        this.eyes = eyes;
        this.arms = arms;
        System.out.println("Вы чучело");
    }

    Monster(int partsOfMonster) {
        this(partsOfMonster, partsOfMonster, partsOfMonster);
    }

    void Voice() {
        System.out.println("GRRAAAAAAAA");
    }

    void Voice(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("GRRAAAAAAAA");
        }
    }

    void Voice(int count, String words) {
        for (int i = 0; i < count; i++) {
            System.out.println(words);
        }
    }
}
