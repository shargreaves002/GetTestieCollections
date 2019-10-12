import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class HashMapTest {
    @Test
    public void testIsEmpty(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        assertTrue(map.isEmpty());
    }

    @Test
    public void testPut(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Key", 1);
        assertFalse(map.isEmpty());
    }

    @Test
    public void testGet(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer expected = 1;
        map.put("Key", expected);
        Integer actual = map.get("Key");
        assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Key", 1);
        map.remove("Key");
        assertTrue(map.isEmpty());
    }
}
