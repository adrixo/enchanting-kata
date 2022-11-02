package durance.objects;

public class Weapon {

    private Enchant enchant;
    private String name;
    private int defaultIce;
    private int defaultFire;
    private int defaultLifesteal;
    private int defaultStrength;
    private int defaultAgility;

    public Weapon (String name) {
        this.name = name;
        this.defaultIce = 5;
        this.defaultFire = 5;
        this.defaultLifesteal = 5;
        this.defaultAgility = 5;
        this.defaultStrength = 5;
    }

    public void assignEnchant(Enchant enchant) {
        this.enchant = enchant;
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        int modifier = 0;
        if (enchant != null &&
                enchant.getType().equals(ENCHANT_TYPE.AGILITY)) {
            modifier += enchant.getModifier();
        }
        return defaultAgility + modifier;
    }

    public int getFire() {
        int modifier = 0;
        if (enchant != null &&
                enchant.getType().equals(ENCHANT_TYPE.FIRE)) {
            modifier += enchant.getModifier();
        }
        return defaultFire + modifier;
    }

    public int getStrength() {
        int modifier = 0;
        if (enchant != null &&
                enchant.getType().equals(ENCHANT_TYPE.STRENGTH)) {
            modifier += enchant.getModifier();
        }
        return defaultStrength + modifier;
    }

    public int getIce() {
        int modifier = 0;
        if (enchant != null &&
                enchant.getType().equals(ENCHANT_TYPE.ICE)) {
            modifier += enchant.getModifier();
        }
        return defaultIce + modifier;
    }

    public int getLifesteal() {
        int modifier = 0;
        if (enchant != null &&
                enchant.getType().equals(ENCHANT_TYPE.LIFESTEAL)) {
            modifier += enchant.getModifier();
        }
        return defaultLifesteal + modifier;
    }
}
