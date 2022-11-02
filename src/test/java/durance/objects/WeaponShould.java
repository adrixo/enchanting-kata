package durance.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponShould {

    private Weapon weapon;

    @BeforeEach
    void setUp() {
    }

    @Test public void
    return_a_weapon_with_no_enchantments() {
        weapon = new Weapon("dagger of pain");
        assertThat(weapon.getName()).isEqualTo("dagger of pain");
        assertThat(weapon.getAgility()).isEqualTo(5);
        assertThat(weapon.getFire()).isEqualTo(5);
        assertThat(weapon.getIce()).isEqualTo(5);
        assertThat(weapon.getStrength()).isEqualTo(5);
        assertThat(weapon.getLifesteal()).isEqualTo(5);
    }

    @Test public void
    weapon_with_agility_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.AGILITY);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getAgility()).isEqualTo(10);
    }

    @Test public void
    weapon_with_strength_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.STRENGTH);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getStrength()).isEqualTo(10);
    }

    @Test public void
    weapon_with_fire_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.FIRE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getFire()).isEqualTo(10);
    }

    @Test public void
    weapon_with_ice_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.ICE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getIce()).isEqualTo(10);
    }

    @Test public void
    weapon_with_lifesteal_enchantment() {
        weapon = new Weapon("dagger of pain");
        Enchant enchant = new Enchant(ENCHANT_TYPE.LIFESTEAL);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getLifesteal()).isEqualTo(10);
    }

    @Test public void
    weapon_with_fire_enchantment_first_later_ice() {
        weapon = new Weapon("dagger of pain");

        Enchant enchant = new Enchant(ENCHANT_TYPE.FIRE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getFire()).isEqualTo(10);

        enchant = new Enchant(ENCHANT_TYPE.ICE);
        weapon.assignEnchant(enchant);
        assertThat(weapon.getIce()).isEqualTo(10);
        assertThat(weapon.getFire()).isEqualTo(5);
    }
}