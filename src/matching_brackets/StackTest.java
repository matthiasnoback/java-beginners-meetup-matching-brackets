package matching_brackets;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void initially_the_stack_is_empty() {
        Stack<String> stack = new Stack<>();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void pop_will_return_the_previously_pushed_element() throws Exception {
        Stack<String> stack = new Stack<>();
        String pushElement = "A string";
        stack.push(pushElement);

        String poppedElement = stack.pop();

        assertEquals(pushElement, poppedElement);
    }

    @Test
    public void pop_from_empty_stack_throws_no_such_element_exception() throws Exception {
        Stack<String> emptyStack = new Stack<>();

        expectedException.expect(NoSuchElementException.class);

        emptyStack.pop();
    }
}
