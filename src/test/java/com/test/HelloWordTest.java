package com.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tyler.Wang on 2017/9/4.
 *
 */
public class HelloWordTest {

    @Test
    public void testMainMethod() {
        HelloWorld h = new HelloWorld();
        h.printHelloWorld();
        Assert.assertNotNull(h);
    }

}
