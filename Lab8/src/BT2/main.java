
package BT2;


public class main {
    public static void main(String[] args) {
        xeDap xd = new xeDap("xxx", "zzz","ccc");
        xeOTo oto = new xeOTo();
        MayBay mb = new MayBay();
        xd.layVanToc();
        oto.layVanToc();
        mb.layVanToc();
        mb.catCanh();
        mb.haCanh();
                }
}
