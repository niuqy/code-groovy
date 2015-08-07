import java_code.Song;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by abner on 7/15/15.
 */
public class SongTest {
    @Test
    public void testToString(){
        Song sng = new Song();
        sng.setArtist("Village People");
        sng.setName("Y.M.C.A");
        sng.setGenre("Disco");

        Assert.assertEquals("Y.M.C.A,Village People,Disco",
                sng.toString());
    }

    @Test
    public void testGetGenre(){
        Song sng = new Song();
        sng.setArtist("Village People");
        sng.setName("Y.M.C.A");
        sng.setGenre("Disco");

        Assert.assertEquals("Disco",sng.getGenre());
    }
}
