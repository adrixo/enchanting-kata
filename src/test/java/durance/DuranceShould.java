package durance;

import durance.objects.*;
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
        durance = new Durance(magicBook);
    }

    @Test public void
    enchant_a_weapon() {
        Enchant enchant = new Enchant(PropertyType.FIRE);
        given(magicBook.getEnchant()).willReturn(enchant);
        durance.enchant(weapon);
        then(weapon).should().assignEnchant(enchant);
    }

}