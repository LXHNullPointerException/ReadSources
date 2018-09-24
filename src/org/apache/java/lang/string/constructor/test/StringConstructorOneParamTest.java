package org.apache.java.lang.string.constructor.test;
/**
 * Initializes a newly created {@code String} object so that it represents
 * the same sequence of characters as the argument; in other words, the
 * newly created string is a copy of the argument string. Unless an
 * explicit copy of {@code original} is needed, use of this constructor is
 * unnecessary since Strings are immutable.
 *
 */
class StringConstructorOneParamTest {
    public static void main(String[] args) {
        String str = new String("abc");
        System.out.println("str=" + str);
        System.out.println("abc".equals(str));
        System.out.println("abc" == str);
    }
}
