package static2;

public class DecoMain1 {
    static void main() {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        System.out.println(s);
        System.out.println(deco);
    }
}
