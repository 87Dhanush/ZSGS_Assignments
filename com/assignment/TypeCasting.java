package com.assignment;
public class TypeCasting {
    public static void main(String[] args) {
        //Expicit conversion
        // 1. Float to int
        float floatValue = 9.99f;
        int intValue = (int) floatValue;
        System.out.println("Float value: " + floatValue);
        System.out.println("Converted to int: " + intValue);

        // 2. Double to float
        double doubleValue = 12345.6784;
        float a = (float) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted to float: " + a);

        // 3. Int to short
        int b = 150000;
        short shortValue = (short) b; //lossy conversion
        System.out.println("Int value: " + b);
        System.out.println("Converted to short: " + shortValue);

        // 4. long to int
        long longValue=150000000;
        int d=(int)longValue;
        System.out.println("Long value: "+longValue);
        System.out.println("Converted to int: "+d);

        //Implicit conversion(auto conversion)
        // 5.short to int
        short e=12;
        int f=e;
        System.out.println("Short value: "+longValue);
        System.out.println("Converted to int: "+d);

        //6.int to double
        int g=12;
        float h=g;
        System.out.println("Int value: "+g);
        System.out.println("Converted to h: "+h);

        //7.float to double
        float i=12.1f;
        double j=i;
        System.out.println("float value: "+i);
        System.out.println("Converted to double: "+j);

        //8.int to long
        int k=12;
        long l=k;
        System.out.println("Int value: "+k);
        System.out.println("Converted to Long: "+l);

    }
}

//2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short