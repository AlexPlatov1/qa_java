import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    Feline feline;

    @Test
    public void doesHaveManeAlwaysTrueTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline, "Самец");
        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline, "Самец");
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline, "Самец");
        assertEquals(LionAlex.FRIENDS, lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline, "Самец");
        assertEquals(LionAlex.PLACE_OF_LIVING, lionAlex.getPlaceOfLiving());
    }
}
