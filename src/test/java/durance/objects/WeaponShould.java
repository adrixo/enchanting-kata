package durance.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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

}