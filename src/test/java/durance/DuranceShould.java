package durance;

import durance.objects.ENCHANT_TYPE;
import durance.objects.Enchant;
import durance.objects.MagicBook;
import durance.objects.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class DuranceShould {
    Durance durance;
    @Mock
    MagicBook magicBook;
    @Mock
    Weapon weapon;

    @BeforeEach
    void setUp() {
        durance = new Durance(magicBook, weapon);
    }

    @Test public void
    enchant_a_weapon() {
        Enchant enchant = new Enchant(ENCHANT_TYPE.FIRE);
        given(magicBook.getEnchant()).willReturn(enchant);
        durance.enchantWeapon();
        then(magicBook).should().getEnchant();
        then(weapon).should().assignEnchant(enchant);
    }

}