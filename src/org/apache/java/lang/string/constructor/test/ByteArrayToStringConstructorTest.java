package org.apache.java.lang.string.constructor.test;

/**
 * Allocates a new {@code String} constructed from a subarray of an array
 * of 8-bit integer values.
 *
 * <p> The {@code offset} argument is the index of the first byte of the
 * subarray, and the {@code count} argument specifies the length of the
 * subarray.
 *
 * <p> Each {@code byte} in the subarray is converted to a {@code char} as
 * specified in the method above.
 *
 * The bytes to be converted to characters
 *  * @param hibyte The top 8 bits of each 16-bit Unicode code unit
 *  * @param offset The initial offset
 *  * @param count  The length
 * @throws IndexOutOfBoundsException
 * If the {@code offset} or {@code count} argument is invalid
 * deprecated This method does not properly convert bytes into characters.
 * As of JDK&nbsp;1.1, the preferred way to do this is via the
 * {@code String} constructors that take a {@link
 * java.nio.charset.Charset}, charset name, or that use the platform's
 * default charset.
 * <img src="http://www.asciima.com/img/ascii-en.png"></img>
 */
public class ByteArrayToStringConstructorTest {
    public static void main(String[] args){
        // byte[] bytes = {65,97,48,0,127};

        // 定义一个字节数组来存储所有的ascii码
        byte[] bytes = new byte[127];
        for(int i = 0;i< bytes.length;i++){
            bytes[i] = (byte) (i + 1);
        }

        // 
        // 
        // !"#$%&'()*+,-./
        // 0123456789
        // :;<=>?@
        // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        // [\]^_`
        // abcdefghijklmnopqrstuvwxyz
        // {|}~
        String str = new String(bytes,0,0,bytes.length);
        //System.out.println("str="+str);

        // 如何实现的呢?
        // 假设现在有个byte = 65,如何解析成A呢?
        byte byteValue = 65;
        // System.out.println((char) (byteValue));


        // ①1 << 1
        // 0000 0000 0000 0001 ===> 1
        // 000 0000 0000 00010 ===> 2 num << 1 ==> num = num * 2
        // ②1 << 2
        // 0000 0000 0000 0001 ===> 1
        // 0000 0000 0000 0100 ===> 4 num << 2 ==> num = num * 2^2
        // ③1 << 8
        // 0000 0000 0000 0001 ===> 1
        // 0000 0001 0000 0000 ===> 256 num << 8 ==> num = num * 2^8
        // 因此num << n ==> num = num * (2^n)
        // 同理num >> n ==> num = num /(2^n)
    }
}
