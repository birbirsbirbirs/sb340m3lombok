package co.ptm.sb340m3;


import lombok.experimental.Delegate;

public class PtmChild {  //extends PtmParent

//    @Override
//    public void helloWorld() {
//        super.helloWorld();
//    }

    @Delegate
    private PtmParent ptmParent=new PtmParent();

}
