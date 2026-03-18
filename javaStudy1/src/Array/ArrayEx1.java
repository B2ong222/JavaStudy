package Array;

public class ArrayEx1 {
    static void main() {
        int[] students = new int[]{1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : students){
            sum += i;
        }
        System.out.println("총합 "+sum);
        System.out.println("평균 "+sum/5);
    }
}