package org.apache.java.lang.string.constructor.test;

/**
 * Initializes a newly created {@code String} object so that it represents
 * an empty character sequence.  Note that use of this constructor is
 * unnecessary since Strings are immutable.
 */
class StringEmptyConstructorTest {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("str=" + str);

        System.out.println("str.length()=" + str.length());
    }
}
