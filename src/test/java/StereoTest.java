import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CD cD1;
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
        stereo = new Stereo();

    }

    @Test
    public void canAddCD(){
        stereo.getCDPlayer().addCD(cD1);
        assertEquals(1, stereo.getCDPlayer().cDCount());
    }

    @Test
    public void canChangeCD(){
        stereo.getCDPlayer().addCD(cD1);
        stereo.getCDPlayer().addCD(cD2);
        stereo.getCDPlayer().changeCD(2);
        assertEquals("Thriller 2", stereo.getCDPlayer().getCurrentCD());
    }
}
