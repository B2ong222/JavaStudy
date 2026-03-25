package Method;

public class MethodReturn3 {
    static void main() {
        checkAge(10);
        checkAge(20);
    }
    public static void checkAge(int age) {
        if (age < 18){
            System.out.println(age +"살 미성년자 출입불가");
            return;
        }
        System.out.println(age + "살 입장해");
    }
}
