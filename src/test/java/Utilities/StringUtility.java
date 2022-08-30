package Utilities;

import java.security.SignedObject;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){
        if (expected.equals(actual))
            System.out.println("PASSED!");
        else System.out.println("FAILED!!!");
    }
}
