public class RolePlayingGame {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        wizard.prepareSpell();

        System.out.println(warrior.toString());
        System.out.println(warrior.isVulnerable());
        System.out.println(warrior.getDamagePoints(wizard));

        System.out.println(wizard.toString());
        System.out.println(wizard.isVulnerable());
        System.out.println(wizard.getDamagePoints(warrior));
    }
}
class WarriarGame {
    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(WarriarGame opponent) {
        return 0;
    }

    public String toString() {
        return "Fighter";
    }
}

class Warrior extends WarriarGame {
    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(WarriarGame opponent) {
        if (opponent.isVulnerable()) {
            return 10;
        }
        return 6;
    }

    public String toString() {
        return "Fighter is a Warrior";
    }

}

class Wizard extends WarriarGame {
    private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    public boolean isVulnerable() {
        return !spellPrepared;
    }

    public int getDamagePoints(WarriarGame opponent) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }
}


