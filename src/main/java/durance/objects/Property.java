package durance.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Property {
    private final PropertyType type;
    private int value;

    public Property (PropertyType type) {
        this.type = type;
        this.value = 5;
    }

    static HashMap<PropertyType, Property> createPropertiesHashMap() {
        HashMap<PropertyType, Property> properties = new HashMap<>();
        ArrayList<PropertyType> propertyTypes = getAllProperties();
        for( PropertyType p: propertyTypes) {
            properties.put(p, new Property(p));
        }
        return properties;
    }

    public static ArrayList<PropertyType> getAllProperties() {
        ArrayList<PropertyType> propertyTypes = new ArrayList<PropertyType>(Arrays.asList(PropertyType.values()));
        return propertyTypes;
    }


    public int getValue() {
        return value;
    }
}
