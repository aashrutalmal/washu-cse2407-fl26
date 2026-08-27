package test.java;

import main.java.Simple;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSimple {

    @Test
    public void testSimple() {
        final int N = 69;
        Simple s = new Simple();
        s.setData(N);
        assertEquals("Value gotten from object does not match value put in", N, s.getData());
    }

}
