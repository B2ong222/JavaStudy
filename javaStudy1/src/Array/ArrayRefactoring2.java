package Array;

public class ArrayRefactoring2 {
    static void main() {
        int[] students = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + "번호" + students[i]);
        }
    }
}
