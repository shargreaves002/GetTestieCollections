import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeTest {
    @Test
    public void testIsEmpty(){
        ArrayDeque<String> deque = new ArrayDeque<String>();

        assertTrue(deque.isEmpty());
    }

    @Test
    public void testAddOrder(){
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        deque.addFirst(0);
        deque.addLast(2);
        Iterator iterator = deque.iterator();
        Integer number = 0;
        while (iterator.hasNext()){
            assertEquals(number, iterator.next());
            number++;
        }
    }

    @Test
    public void testClear(){
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(0);
        deque.add(1);
        deque.add(2);
        deque.clear();
        assertTrue(deque.isEmpty());
    }

    @Test
    public void testRemove(){
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.add("0");
        deque.add("1");
        deque.add("2");
        deque.remove("1");
        assertEquals("0", deque.getFirst());
        assertEquals("2", deque.getLast());
    }
}
