package co.ptm.sb340m3;

import lombok.experimental.ExtensionMethod;
import lombok.experimental.UtilityClass;

@UtilityClass
@ExtensionMethod(PtmStringExtensions.class)
public class PtmStringEnhancer {

    public void checkPalindrome(String input) {
        if (input.isPalidrone()) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
