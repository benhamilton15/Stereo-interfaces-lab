import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CD cD1;
    CDPlayer cDPlayer;
    CD cD2;

    @Before
    public void before(){
        ArrayList<String> songList1 = new ArrayList<String>();
        songList1.add("Thriller");
        songList1.add("Thriller oooh");
        songList1.add("Thriller Ahhh");
        songList1.add("Billy Jean");
        cD1 = new CD("Thriller", songList1);
        cD2 = new CD("Thriller 2", songList1);
        cDPlayer = new CDPlayer();


    }

    @Test
    public void canAddCD(){
        cDPlayer.addCD(cD1);
        assertEquals(1, cDPlayer.cDCount());
    }

    @Test
    public void canChangeCD(){
        cDPlayer.addCD(cD1);
        cDPlayer.addCD(cD2);
        cDPlayer.changeCD(2);
        assertEquals("Thriller 2", cDPlayer.getCurrentCD());
    }
}
