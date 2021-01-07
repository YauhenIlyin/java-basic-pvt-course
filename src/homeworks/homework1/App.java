package homeworks.homework1;

public class App {

    public static void main(String[] args) {
        //1. Побитовые операции:
        System.out.println("task 1: ");
        bitwiseOperatorDemonstrator();

        //2. приоритетность операторов
        System.out.println("\n\ntask 2: ");
        operatorPriorityDemonstrator();

        //3. complete
        System.out.println("\n\ntask 3 complete");

        //4.*
        System.out.println("\n\ntask 4: ");
        System.out.println(sleepIn(true, false));

        /*5
        3 classes ready
        оформление трех классов сделано по своему желанию, так как задание не было точным
        */
        System.out.println("\n\ntask 5 complete. 3 classes has been created");

        //6.*
        System.out.println("\n\ntask 6: ");
        int phoneNumber[] = new int[10];
        for (int i = 0; i < 9; i++) {
            phoneNumber[i] = i;
        }
        System.out.println(createPhoneNumber(phoneNumber));

        //7*
        System.out.println("\n\ntask 7: ");
        System.out.println(toBinaryString((byte) -5));

    }

    public static void bitwiseOperatorDemonstrator() {
        //дублирование кода необходимо для написания комментариев вручную для тех же операторов, но
        //при работе с отрицательными числами.
        System.out.println("\nin this demonstration bitwise operators (~ , &, &=, |, |=, ^, ^=, >>, >>=, >>>, <<, <<=, >>>=)\n" +
                "we use variables type byte: a=42, b=15 (in the first block) and a=-42, b=-15 (in the second block).\n");

        {
            System.out.println("demo with 42 and 15");
            byte a = 42, b = 15;
            System.out.println("~" + a + " = " + ~a);
            //byte a = 42 = 00101010; ~00101010 = 11010101; (~42 = -43)
            System.out.println("~" + b + " = " + ~b);
            //byte b = 15 = 00001111; ~00001111 = 11110000 (~15 = -16)
            System.out.println(a + " & " + b + " = " + (a & b));
            //a = 42 & b = 15; 00101010 & 00001111 (1 & 1 = 1, else 0) = 00001010 = 10
            System.out.println(a + " &= " + b + " is " + (a &= b) + " where result in \"a\" = " + a);
            //a = 42 &= b = 15;   a = a & b; a = 42 & 15; a = 00101010 & 00001111; a = 00001010 = 10;
            a = 42; //now value in a = 10. assign 42.
            System.out.println(a + " | " + b + " = " + (a | b));
            //a = 42 | b = 15; 00101010 | 00001111 = 00101111 = 47
            System.out.println(a + " |= " + b + " is " + (a |= b) + " where result in \"a\" = " + a);
            // a = 42 |= b = 15; a = a|b; a = 00101010 | 00001111 = 00101111 = 47;
            a = 42; //now value in a = 47. assign 42.
            System.out.println(a + " ^ " + b + " = " + (a ^ b));
            //a = 42 ^ b = 15; 00101010 ^ 00001111 = 00100101 = 37;
            System.out.println(a + " ^= " + b + " is " + (a ^= b) + " where result in \"a\" = " + a);
            //a = 42 ^= b = 15; a = a ^ b; a = 00101010 ^ 00001111 = 00100101 = 37;
            a = 42; //now value in a = 37. assign 42.
            System.out.println(a + " >> 2 = " + (a >> 2) + " and " + b + " >> 2000 = " + (b >> 2000));
            // a = 42 = 00101010; a >> 2 = 00001010 = 10; and b = 15 = 00001111; b >> 2000 = 00000000 = 0;
            System.out.println(a + " >>= 2 is " + (a >>= 2) + " and " + b + " >>= 2000 is " + (b >> 2000) + " , where results in \"a\" and \"b\"");
            // a = 42 = 00101010; a >>= 2; a = a >> 2; a = 00101010 >> 2 = 00001010 = 10;
            // b = 15 = 00001111; b >>= 2000; b = b >> 2000 = 00001111 >> 2000 = 00000000 = 0;
            a = 42; //now value in a = 10. assign 42.
            b = 15; //now value in b = 0. assign 15.
            System.out.println(a + " >>> 2 = " + (a >>> 2) + " and " + b + " >>> 2000 = " + (b >>> 2000));
            // a = 42 = 00101010; a >>> 2 = 00101010 >>> 2 = 00001010 = 10; and b = 15 = 00001111; b >>> 2000 = 00001111 >>> 2000 = 00000000;
            System.out.println(a + " >>>= 2 is " + (a >>>= 2) + " and " + b + " >>>= 2000 is " + (b >>>= 2000) + " , where results in \"a\" and \"b\"");
            // a = 42 = 00101010; a >>>= 2; a = a >>> 2 = 00101010 >>> 2 = 00001010 = 10;
            // b = 15 = 00001111; b >>>= 2000; b = b >>> 2000 = 00001111 >>> 2000 = 00000000 = 0;
            a = 42; //now value in a = 10. assign 42.
            b = 15; //now value in b = 0. assign 15.
            System.out.println(a + " << 25 = " + (a << 25) + " and " + b + " << 6 = " + (b << 6));
            // a = 42 = 00101010; a << 25; 00101010 << 25;
            // jvm up type of data to int. it's 4 bytes.
            // 00000000 00000000 00000000 00101010 << 25 = 0101010 0 00000000 00000000 00000000 = 1 409 286 144 (this value have type int)
            // b = 15 = 00001111; b << 6; 00001111 << 6;
            // jvm up type to int
            // 00000000 00000000 00000000 00001111 << 6 = 00000000 00000000 00000011 11000000 = 960 (this value have type int too)
            System.out.println(a + " <<= 25 is " + (a <<= 25) + " and " + b + " <<= 6 is " + (b <<= 6) + " , where results in \"a\" and \"b\"");
            // a = 42 = 00101010; a <<= 25; a = a << 25 = 00101010 << 25;
            //jvm up to int;
            // 00000000 00000000 00000000 00101010 << 25 = 0101010 0 00000000 00000000 00000000;
            // and this value convert to byte, when jvm save him in byte a variable.
            // and we have: (int to byte) a = (byte) 01010100 00000000 00000000 00000000 = 00000000 = 0;
            // b = 15 = 00001111; b <<= 6; b = b << 6; b = 00001111 << 6;
            //jvm up to int;
            // 00000000 00000000 00000000 00001111 << 6 = 00000000 00000000 00000011 11000000;
            //this int value jvm convert to byte too
            //b = (byte) 00000000 00000000 00000011 11000000 = 11000000 = -64;
        }

        {
            System.out.println("\ndemo with -42 and -15");
            byte a = -42, b = -15;
            System.out.println("~" + a + " = " + ~a);
            // a = -42 = 11010110; ~a = ~11010110 = 00101001 = 41;
            System.out.println("~" + b + " = " + ~b);
            // b = -15 = 11110001; ~b = ~11110001 = 00001110 = 14;
            System.out.println(a + " & " + b + " = " + (a & b));
            // a = -42 & b = -15; a & b = 11010110 & 11110001 = 11010000 = -48;
            System.out.println(a + " &= " + b + " is " + (a &= b) + " where result in \"a\" = " + a);
            // a = -42 & b = -15; a &= b; a = a & b = 11010110 & 11110001 = 11010000 = -48;
            a = -42; //now value in a = -48. assign -42.
            System.out.println(a + " | " + b + " = " + (a | b));
            // a = -42 | b = -15; a | b = 11010110 | 11110001 = 11110111 = - 9;
            System.out.println(a + " |= " + b + " is " + (a |= b) + " where result in \"a\" = " + a);
            // a = -42 |= b = -15; a |= b; a = a | b = 11010110 | 11110001 = 11110111 = - 9;
            a = -42; //now value in a = -9. assign -42.
            System.out.println(a + " ^ " + b + " = " + (a ^ b));
            // a = -42 ^ b = -15; a ^ b = 11010110 ^ 11110001 = 00100111 = 39;
            System.out.println(a + " ^= " + b + " is " + (a ^= b) + " where result in \"a\" = " + a);
            // a = -42 ^= b = -15; a ^= b; a = a ^ b = 11010110 ^ 11110001 = 00100111 = 39;
            a = -42; //now value in a = 39. assign -42.
            System.out.println(a + " >> 2 = " + (a >> 2) + " and " + b + " >> 2000 = " + (b >> 2000));
            // a = -42 >> 2 = 11010110 >> 2 = 11110101 = -11
            // when we use >> high bit saving. and all new bits have value 1.
            // b = -15 >> 2000 = 11110001 >> 2000 = 11111111 = -1
            // when we use  >> high bit saving, and all new bits have value from this hight bit. in this example it's 1.
            System.out.println(a + " >>= 2 is " + (a >>= 2) + " and " + b + " >>= 2000 is " + (b >> 2000) + " , where results in \"a\" and \"b\"");
            // a = -42 >>= 2; a = a >> 2 = 11010110 >> 2 = 11110101 = -11;
            // b = -15 >>= 2000; b = b >> 2000 = 11110001 >> 2000 = 11111111 = -1;
            a = -42; //now value in a = -11. assign -42.
            b = -15; //now value in b = -1. assign -15.
            System.out.println(a + " >>> 2 = " + (a >>> 2) + " and " + b + " >>> 2000 = " + (b >>> 2000));
            // a = -42 >>> 2 = 11010110 >>> 2 = 00110101
            //не разобрался как работает сдвиг вправо для отрицательных чисел
            System.out.println(a + " >>>= 2 is " + (a >>>= 2) + " and " + b + " >>>= 2000 is " + (b >>>= 2000) + " , where results in \"a\" and \"b\"");
            //не разобрался как работает сдвиг вправо для отрицательных чисел
            a = -42; //now value in b = -11. assign -42.
            b = -15; //now value in b = -1. assign -15.
            System.out.println(a + " << 25 = " + (a << 25) + " and " + b + " << 6 = " + (b << 6));
            // a = -42 << 25; 11010110 << 25 = 1010110 0 00000000 00000000 00000000 = -1 409 286 144
            // b = -15 << 6; 11110001 << 6 = 111100 01000000 = -960
            System.out.println(a + " <<= 25 is " + (a <<= 25) + " and " + b + " <<= 6 is " + (b <<= 6) + " , where results in \"a\" and \"b\"");
            // a = -42 <<= 25; a = a << 25; 00000000 00000000 00000000 11010110 << 25 = 1010110 0 00000000 00000000 00000000 = -1 409 286 144
            //jvm convert int value to byte : 00000000 = 0;
            // b = -15 <<= 6; b = b << 6; 11110001 << 6 = 111100 01000000 = -960
            //jvm convert int ty byte when save value in byte variable. b = 01000000 = 64;
        }


    }

    public static void operatorPriorityDemonstrator() {
        System.out.println("5 + 2 / 8 = " + (5 + 2 / 8)); // 2/8 = 0; 5+0 = 5;
        System.out.println("(5 + 2) / 8 = " + (5 + 2) / 8); // 5+2 = 7; 7/8 = 0;
        int x = 2, y = 8;
        System.out.println("(5 + 2++) / 8 = " + (5 + x++) / 8); // 5+2 = 7; x++=3; 5/8 = 0;
        x = 2;
        System.out.println("(5 + 2++) / --8 = " + (5 + x++) / --y); // 5+2 = 7; x++=3; --y=7; 7/7 = 1;
        x = 2;
        y = 8;
        System.out.println("(5 * 2 >> 2++) / --8 = " + (5 * 2 >> x++) / --y); //5*2 = 10; 10 >> 2 = 1010 >> 2 = 10 = 2; x++ = 3; --y =7; 2/7 =0;
        x = 2;
        y = 8;
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + (5 + 7 > 20 ? 68 : 22 * 2 >> x++) / --y); // 5+7=12; 12>20 is false; 22*2=44;
        // 44 >> 2 = 101100 >> 2 = 1011 = 11; x++ = 3; --y = 7; 11 / 7 = 1;
        x = 2;
        y = 8;
        //System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + ((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> x++) / --y)); //error with using >=. boolean variable cannot using to /

        x = 2;
        y = 8;
        System.out.println("6 - 2 > 3 && 12 * 12 <= 119 = " + (6 - 2 > 3 && 12 * 12 <= 119)); // 6-2 = 4; 4>3 is true; 12*12=144; 144<=119 is false;
        // true && false is false;
        boolean a = true, b = false;
        System.out.println(a && b); // true && false is false
    }

    public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        if (!isWeekday || isVacation) {
            return true;
        } else {
            return false;
        }
    }

    public static String createPhoneNumber(int[] phoneNumber) {
        return "(" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2] + ") " + phoneNumber[3] + phoneNumber[4] + phoneNumber[5] + "-"
                + phoneNumber[6] + phoneNumber[7] + phoneNumber[8] + phoneNumber[9];
    }

    public static String toBinaryString(byte number) {
        String binaryView = "";
        int symbolCounter = 1, sign1 = 0, sign2 = 1;
        if (number < 0) {
            sign1 = 1;
            sign2 = 0;
            number *= -1;
        }
        while (number > 1) {
            symbolCounter++;
            if (number % 2 == 0) {
                binaryView = sign1 + binaryView;
            } else {
                binaryView = sign2 + binaryView;
            }
            number /= 2;
        }
        if (number % 2 == 0) {
            binaryView = sign1 + binaryView;
        } else {
            binaryView = sign2 + binaryView;
        }
        for (int i = 0; i < 8 - symbolCounter; i++) {
            binaryView = sign1 + binaryView;
        }
        return binaryView;
    }

}
