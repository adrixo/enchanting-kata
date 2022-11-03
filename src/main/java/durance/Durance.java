package durance;

import durance.objects.Enchant;
import durance.objects.MagicBook;
import durance.objects.Weapon;



public class Durance {
    private MagicBook magicBook;

    public Durance(MagicBook magicBook) {
        this.magicBook = magicBook;
    }

    public void enchant(Weapon weapon) {
        Enchant enchant = magicBook.getEnchant();
        weapon.assignEnchant(enchant);
    }
}
