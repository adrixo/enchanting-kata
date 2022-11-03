package durance.objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class MagicBookShould {

    @Mock
    EnchanmentRandomize randomMock;

    @Test
    public void
    roll_random_enchantment_100_percent_times() {
        given(randomMock.doesReturnEnchantment()).willReturn(true);
        MagicBook magicBook = new MagicBook(randomMock);
        Enchant enchant = magicBook.getEnchant();
        assertThat(enchant.getType()).isIn(Property.getAllProperties());
    }

    @Test
    public void
    roll_random_enchantment_0_percent_times() {
        given(randomMock.doesReturnEnchantment()).willReturn(false);
        MagicBook magicBook =  new MagicBook(randomMock);
        Enchant enchant = magicBook.getEnchant();
        assertThat(enchant).isNull();
    }
}