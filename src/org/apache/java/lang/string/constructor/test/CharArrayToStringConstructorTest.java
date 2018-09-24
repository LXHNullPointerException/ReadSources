package org.apache.java.lang.string.constructor.test;
/**
 * Allocates a new {@code String} so that it represents the sequence of
 * characters currently contained in the character array argument. The
 * contents of the character array are copied; subsequent modification of
 * the character array does not affect the newly created string.
 *
 * @param  value
 *         The initial value of the string
 */
class CharArrayToStringConstructorTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String str = new String(chars);
        System.out.println("str=" + str);
        System.out.println("str.length()=" + str.length());
        System.out.println("修改原来的字符数组,是否会影响现在的字符串呢?");
        chars[1] = 'a';
        System.out.println("str=" + str);
    }
}
