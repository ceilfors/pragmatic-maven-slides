package com.ceilfors.slides;

import com.google.common.base.Joiner;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {
    	// Uncompilable when guava scope is set to test
        System.out.println(Joiner.on(" ").skipNulls().join("Hello", null, "world", null, "!"));
    }
}
