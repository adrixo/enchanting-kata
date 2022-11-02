package durance.objects;

public class Weapon {

    private int strength;
    private String name;
    private int ice;
    private int fire;
    private int lifesteal;
    private int agility;

    public Weapon (String name) {
        this.name = name;
        this.ice = 5;
        this.fire = 5;
        this.lifesteal = 5;
        this.agility = 5;
        this.strength = 5;
    }
    public void assignEnchant(Enchant enchant) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getFire() {
        return fire;
    }

    public int getStrength() {
        return strength;
    }

    public int getIce() {
        return ice;
    }

    public int getLifesteal() {
        return lifesteal;
    }
}
