package co.ptm.sb340m3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PtmChild ptmChild = new PtmChild();
        ptmChild.helloWorld();

        Car car = Car.builder()
                .make("toyota")
                .model("RAV4")
                .color("ruby red")
                .build();

        System.out.println(DateUtils.format(new Date()));

        PtmStringEnhancer.checkPalindrome("hello");

    }

}
