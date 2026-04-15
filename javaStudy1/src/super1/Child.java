package super1;

public class Child extends Parent {
    private String value = "child";

    @Override
    public void hello() {
        System.out.println("hi");
    }
    public void call(){
        System.out.println(this.value);
        System.out.println(super.value);
        this.hello();
        super.hello();
    }
}
