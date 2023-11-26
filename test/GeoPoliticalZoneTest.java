import ChibuzorTask.GeoPoliticalZone;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GeoPoliticalZoneTest {
    @Test
    public void testForGeoPoliticalZone(){
        GeoPoliticalZone zone = GeoPoliticalZone.SOUTHSOUTH;
        System.out.println(Arrays.toString(zone.getStates()));
        assertSame(zone,GeoPoliticalZone.SOUTHSOUTH);
    }


    }

