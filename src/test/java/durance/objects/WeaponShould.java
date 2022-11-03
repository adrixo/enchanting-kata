package durance.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponShould {

    private Weapon weapon;

    @Test public void
    return_a_weapon_with_no_enchantments() {
        weapon = new Weapon("dagger of pain");
        assertThat(weapon.getName()).isEqualTo("dagger of pain");

        assertThat(weapon.getProperty(PropertyType.ICE)).isEqualTo(5);
        assertThat(weapon.getProperty(PropertyType.FIRE)).isEqualTo(5);
        assertThat(weapon.getProperty(PropertyType.LIFESTEAL)).isEqualTo(5);
        assertThat(weapon.getProperty(PropertyType.AGILITY)).isEqualTo(5);
        assertThat(weapon.getProperty(PropertyType.STRENGTH)).isEqualTo(5);
    }

    @Test public void
    weapon_with_agility_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(PropertyType.AGILITY);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.AGILITY)).isEqualTo(10);
    }

    @Test public void
    weapon_with_strength_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(PropertyType.STRENGTH);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.STRENGTH)).isEqualTo(10);
    }
    @Test public void
    weapon_with_fire_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(PropertyType.FIRE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.FIRE)).isEqualTo(10);
    }

    @Test public void
    weapon_with_ice_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(PropertyType.ICE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.ICE)).isEqualTo(10);
    }

    @Test public void
    weapon_with_lifesteal_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(PropertyType.LIFESTEAL);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.LIFESTEAL)).isEqualTo(10);
    }

    @Test public void
    weapon_with_fire_enchantment_first_later_ice() {
        weapon = new Weapon("dagger of pain");

        Enchant enchant = new Enchant(PropertyType.FIRE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.FIRE)).isEqualTo(10);

        enchant = new Enchant(PropertyType.ICE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getProperty(PropertyType.FIRE)).isEqualTo(5);
        assertThat(weapon.getProperty(PropertyType.ICE)).isEqualTo(10);
    }

    /*
    @Test public void
    get_description() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.FIRE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getDescription()).isEqualTo("Dagger of the Nooblet \n 5 - 10 attack damage \n 1.2 attack speed \n +5 fire damage");

    }*/
}