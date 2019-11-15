import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }
    /*
    @Test
    public void testAdd(){
        double result = 3 + 3;
        assertTrue(result == 6);
    }
    @Test
    public void testAdd(){
        double result = 3 + 3;
        assertTrue(result == 6);
    } */
    @Test
    public void testAdd(){
        Canso c  = new Canso("Rolling in the deep",2010,"There's a fire starting in my heart\n" +
                "Reaching a fever pitch and it's bringing me out the dark\n" +
                "Finally I can see you crystal clear\n" +
                "Go 'head and sell me out and I'll lay your ship bare\n" +
                "See how I leave with every piece of you\n" +
                "Don't underestimate the things that I will do\n" +
                "There's a fire starting in my heart\n" +
                "Reaching a fever pitch and its bringing me out the dark\n" +
                "The scars of your love remind me of us\n" +
                "They keep me thinking that we almost had it all\n" +
                "The scars of your love they leave me breathless, I can't help feeling\n" +
                "We could have had it all (you're gonna wish you never had met me)\n" +
                "Rolling in the deep (tears are gonna fall, rolling in the deep)\n" +
                "You had my heart inside of your hand (you're gonna wish you never had met me)");
        Canso ca = Canso.find("nom", "Rolling in the deep").first();
        String nombre = c.getNom();
        assertEquals(nombre,"Rolling in the deep");
    }


}
