package durance.objects;

import java.util.HashMap;

public class Weapon {

    private Enchant enchant;
    private String name;

    HashMap<PropertyType, Property> properties;

    public Weapon (String name) {
        this.name = name;
        properties = Property.createPropertiesHashMap();
    }

    public void assignEnchant(Enchant enchant) {
        this.enchant = enchant;
    }

    public String getName() {
        return name;
    }

    public int getProperty(PropertyType propertyType) {
        Property property = properties.get(propertyType);
        int modifier = getEnchantModifier(propertyType);
        return property.getValue() + modifier;
    }

    private int getEnchantModifier(PropertyType propertyType) {
        if (enchant == null) {
            return 0;
        }
        int modifier = 0;
        if ( propertyType == enchant.getType() ) {
            modifier = enchant.getModifier();
        }
        return modifier;
    }
}