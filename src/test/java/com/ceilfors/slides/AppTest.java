package com.ceilfors.slides;

import com.google.common.base.Joiner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testJoin() {
        assertEquals("Hello world !", Joiner.on(" ").skipNulls().join("Hello", null, "world", null, "!"));
    }
}
