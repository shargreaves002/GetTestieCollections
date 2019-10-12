import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class HashSetTest {
    @Test
    public void testIsEmpty(){
        HashSet<String> set = new HashSet<String>();

        assertTrue(set.isEmpty());
    }

    @Test
    public void testAdd(){
        HashSet<String> set = new HashSet<String>();

        set.add("Hello");

        assertFalse(set.isEmpty());
    }

    @Test
    public void testContains(){
        HashSet<String> set = new HashSet<String>();
        String value = "Hello";
        set.add(value);
        assertTrue(set.contains(value));
    }

    @Test
    public void testRemove(){
        HashSet<String> set = new HashSet<String>();
        String value = "Hello";
        set.add(value);
        set.remove(value);
        assertFalse(set.contains(value));
    }
}
