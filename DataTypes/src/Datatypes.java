/**
 * Created by mvieck on 12/20/16.
 */
public class Datatypes {
    public static void main(String[] args) {

        /* Everything from byte to char are all primitive datatypes in Java */
        byte byte9 = 9;
        byte byteA = 10;
        byte byteB = 11;
        System.out.printf("Byte %X %X %X\n",byte9, byteA, byteB);

        //16 bit signed two's complement integer, 2x smaller than an integer
        short shortNum = 10;
        System.out.printf("Short %d\n",shortNum);

        //32 bit signed two's complement integer, min is (-2^31) and max is (2^31 - 1)
        int integer = 10;
        System.out.printf("Integer %d\n",integer);

        //64 bit signed two's compliment integer, min is (-2^63) and max is (2^63 - 1)
        long longInteger = 10L;
        System.out.printf("Long %d\n", longInteger);

        //32 bit IEEE floating point
        float floatingPnt = 3.14f;
        System.out.printf("Float %f, %.3f\n", floatingPnt, floatingPnt);

        //64 bit double-precision value, used mostly for decimals
        double decimal = 3.14;
        System.out.printf("Double %f, %.4f\n",decimal, decimal);

        //Represents true or false
        boolean bool = true;
        System.out.printf("Booleans %b, ",bool);
        bool = false;
        System.out.printf("%b\n", bool);

        //single 16-bit unicode character, min is \u0000 and max is \uffff
        char character = 'a';
        System.out.printf("Char %c\n",character);

        /* The Reference type is any variable that accesses another object */
        //A string is one example of reference types
        String abc = "abc";
        System.out.println("String " + abc);
    }
}
