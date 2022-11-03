package durance.objects;

public class Enchant {
    private final PropertyType type;
    private int modifier;

    public Enchant(PropertyType type) {
        this.modifier = 5;
        this.type = type;
    }

    public int getModifier() {
        return modifier;
    }

    public PropertyType getType() {
        return type;
    }
}
