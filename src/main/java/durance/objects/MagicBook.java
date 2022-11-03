package durance.objects;

import java.util.ArrayList;
import java.util.Random;

public class MagicBook {
    EnchanmentRandomize enchanmentRandomize;

    public MagicBook() {
        this.enchanmentRandomize = new EnchanmentRandomize();
    }

    MagicBook(EnchanmentRandomize enchanmentRandomize) {
        this.enchanmentRandomize = enchanmentRandomize;
    }

    public Enchant getEnchant() {
        if ( !enchanmentRandomize.doesReturnEnchantment() ) {
            return null;
        }
        Random rand = new Random();
        ArrayList<PropertyType> properties = Property.getAllProperties();
        PropertyType randomType = properties.get(rand.nextInt(properties.size()));

        return new Enchant(randomType);
    }
}
