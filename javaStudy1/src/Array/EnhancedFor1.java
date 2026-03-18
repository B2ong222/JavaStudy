package Array;

public class EnhancedFor1 {
    static void main() {
        int[] nums = {1, 2, 3, 4, 5};

        // 일반 for문
        for(int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            System.out.println(num);
        }

        // 향상된 for문, for-each문
        for (int num : nums) {
            System.out.println(num);
        }

        // for-each문을 사용할 수 없는 경우: 증가하는 index 값이 필요한 경우
        for(int i = 0; i < nums.length; ++i) {
            System.out.println("num" + i + "번의 결과는: " + nums[i]);
        }
    }
}
