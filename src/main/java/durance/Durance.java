package durance;

import durance.objects.Enchant;
import durance.objects.MagicBook;
import durance.objects.Weapon;

public class Durance {
    private MagicBook magicBook;
    private Weapon weapon;

    public Durance(MagicBook magicBook, Weapon weapon) {
        this.magicBook = magicBook;
        this.weapon = weapon;
    }

    public void enchantWeapon() {
        Enchant enchant = magicBook.getEnchant();
        weapon.assignEnchant(enchant);
    }
}
