package Method;

public class MethodEx2 {
    static void main() {
        String message = "hello, world";
        For(message, 3);
        For(message, 5);
        For(message, 7);
    }
    public static void For(String m, int n){
        for (int i = 0; i < n; i++){
            System.out.println(m);
        }
    }
}
