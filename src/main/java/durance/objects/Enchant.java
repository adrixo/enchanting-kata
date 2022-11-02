package durance.objects;

public class Enchant {
    private final ENCHANT_TYPE type;
    private int modifier;

    public Enchant(ENCHANT_TYPE type) {
        this.modifier = 5;
        this.type = type;
    }

    public int getModifier() {
        return modifier;
    }

    public ENCHANT_TYPE getType() {
        return type;
    }
}
