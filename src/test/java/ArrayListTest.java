import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void testIsEmpty(){
        //Given
        ArrayList<String> list = new ArrayList<String>();

        //then
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAdd(){
        //Given
        ArrayList<String> list = new ArrayList<String>();

        //when
        list.add("Hello");

        //then
        assertFalse(list.isEmpty());
    }

    @Test
    public void testGet(){
        ArrayList<String> list = new ArrayList<String>();

        //when
        String expected = "Hello";
        list.add(expected);

        String actual = list.get(0);

        assertEquals(expected, actual);
    }

    @Test
    public void testRemove(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.remove(0);

        assertTrue(list.isEmpty());
    }
}
