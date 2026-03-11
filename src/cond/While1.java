package cond;

public class While1 {
    public static void main(String[] args) {
        int count = 0;
        count ++;
        System.out.println("카운트: "+count);
        count ++;
        System.out.println("카운트: "+count);
        count ++;
        System.out.println("카운트: "+count);

        count = 0;
        while (count < 3){
            count ++;
            System.out.println("카운트: "+count);
        }
    }
}
