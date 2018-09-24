package org.apache.java.lang.string.constructor.test;

/**
 * Allocates a new {@code String} that contains characters from a subarray
 * of the character array argument. The {@code offset} argument is the
 * index of the first character of the subarray and the {@code count}
 * argument specifies the length of the subarray. The contents of the
 * subarray are copied; subsequent modification of the character array does
 * not affect the newly created string.
 */
class CharArrayToStringConstructorPartTest {
    public static void main(String[] args) {
        char[] chars = new char[3];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';

        // 调用API之前先需要进行数据校验

        // ①当offset参数为负数的时候显然是不行的,当然可以为0
        // java.lang.StringIndexOutOfBoundsException:
        // String index out of range: -1
        // String str = new String(chars, -1, 2);

        // ②当count参数为负数的时候显然也是不行的,当然可以为0
        // java.lang.StringIndexOutOfBoundsException:
        // String index out of range: -1
        // String str = new String(chars,0,-1);

        // ③当offset和count参数都各自满足要求之后,
        // 需要保证子数组不能超出范围:
        // 1.offset = 0,count = 1 ===> [beginIndex,endIndex] = [0,1]
        // 2.offset = 1,count = 1 ===> [beginIndex,endIndex] = [1,2]
        // ...
        // 因此offset,count已知的情况下,[beginIndex,endIndex] = [offset,offset+count]
        // 而字符串的index范围为:0<= index <= string.length()
        // 故而offset >=0
        // && offset + count >=0 ===> count >= -offset ===> count >=max(-offset)=0
        // && offset + count <=string.length()

        // java.lang.StringIndexOutOfBoundsException:
        // String index out of range: 4
        String str = new String(chars, 0, 4);

        // 因此验证规则:
        // offset >= 0;
        // count >= 0;
        // offset + count <= string.length();

        System.out.println("str=" + str);
    }
}
