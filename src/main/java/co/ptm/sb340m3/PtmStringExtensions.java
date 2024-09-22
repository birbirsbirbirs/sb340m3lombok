package co.ptm.sb340m3;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PtmStringExtensions {

    public boolean isPalidrone(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
