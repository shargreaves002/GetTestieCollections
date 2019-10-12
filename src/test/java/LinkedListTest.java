import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    @Test
    public void testIsEmpty(){
        LinkedList<String> list = new LinkedList<String>();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddAll(){
        LinkedList<String> list = new LinkedList<String>();
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        list.addAll(strings);

        assertFalse(list.isEmpty());
    }

    @Test
    public void testGet(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        ListIterator iterator = list.listIterator();
        int index = 0;
        while (iterator.hasNext()){
            assertEquals(list.get(index), iterator.next());
            index++;
        }
    }

    @Test
    public void testClear(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.clear();
        assertTrue(list.isEmpty());
    }
}
