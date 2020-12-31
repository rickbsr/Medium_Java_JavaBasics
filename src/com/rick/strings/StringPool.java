package com.rick.strings;

public class StringPool {


    public static void main(String[] args) {

//        String strA = "ABC";
//        String strB = "ABC";
//
//        System.out.println(strA == strB); // true
//
//
//        String strNewA = new String("ABC");
//        String strNewB = new String("ABC");
//
//        System.out.println(strNewA == strNewB); // false

        // --- 分隔線 --- //

//        String str = "A";
//        str += "B";
//        System.out.println(str); // AB

        // --- 分隔線 --- //

//        String comboStr = "init";
//        comboStr += "A"; // line 2
//        comboStr += "A"; // line 3
//        comboStr += "A"; // line 4
//        comboStr += "A"; // line 5
//
//        System.out.println(comboStr);

        // --- 分隔線 --- //

        // Literal String
//        String s1 = "ABC";
//        String s2 = "ABC";
//        System.out.println(s1 == s2); // true


        // New String
//        String s1 = "ABC";
//        String s3 = new String("ABC");
//        System.out.println(s1 == s3); // false

        // --- 分隔線 --- //

//        String s1 = "ABC";
//
//        String literalStr = "A" + "B" + "C";
//        System.out.println(s1 == literalStr); // true
//
//        String a = "A";
//        String b = "B";
//        String c = "C";
//        String variableStr = a + b + c;
//        System.out.println(s1 == variableStr); // false
//
//        System.out.println(variableStr == literalStr); // false

        // --- 分隔線 --- //

//        String s1 = "ABC";
//        String s3 = new String("ABC");
//        String s4 = s3.intern();
//        System.out.println(s1 == s3); // false
//        System.out.println(s1 == s4); // false

        // --- 分隔線 --- //

//        String a = "A";
//        String b = "B";
//        String c = "C";
//        String variableStr = a + b + c;
//        System.out.println( "ABC" == variableStr); // false

        // --- 分隔線 --- //

        String s1 = "ABC";
        System.out.println(staticS1 == s1);
        System.out.println(staticS2 == s1);
        System.out.println(staticS3 == s1);
        System.out.println(staticS4 == s1);

    }

    static String staticS1 = "ABC";
    static String staticS2 = new String("ABC");
    static String staticS3 = "A" + "B" + "C";
    static String staticSa = "A";
    static String staticSb = "B";
    static String staticSc = "C";
    static String staticS4 = staticSa + staticSb + staticSc;
}
