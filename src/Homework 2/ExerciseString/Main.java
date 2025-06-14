package org.example.ExerciseString;

public class Main {
    public static void main (String[] args) {
        String boolStr = "True";
        String byteStr = "120";
        String shortStr = "32000";
        String intStr = "147895632";
        String longStr = "987654321987654321";
        String doubleStr = "4444.5d";
        String floatStr = "2354.56f";

        boolean boolValue = Boolean.parseBoolean(boolStr);
        byte byteValue =  Byte.parseByte(byteStr);
        short shortValue = Short.parseShort(shortStr);
        int intValue = Integer.valueOf(intStr);
        long longValue = Long.valueOf(longStr);
        double doubleValue = Double.valueOf(doubleStr);
        float floatValue = Float.valueOf(floatStr);

        System.out.println("Boolean (via Booalean):" + boolValue);
        System.out.println("Byte (via Byte):" + byteValue);
        System.out.println("Short (via Short): " + shortValue);
        System.out.println("Int (via Integer):" + intValue);
        System.out.println("Long (via Long):" + longValue);
        System.out.println("Double (via Double):" + doubleValue);
        System.out.println("Float (via Float):" + floatValue);

    }
}
