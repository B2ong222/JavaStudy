package cond;

public class While2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10){
            System.out.print(a + " ");
            a++;
        }

        int b = 10;
        while (b>0){
            System.out.print(b + "");
            b--;
        }

//        while(true){
//            System.out.println("무한루프");
//        }
        int c = 0;
        while(true){
            if(c>0){
                break;
            }
            System.out.print(c + "");
            c++;
        }
    }
}
