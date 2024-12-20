import java.util.Arrays;
class Solution{
    public int[] reverseArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return arr;
    }
}

class Solution2{
    int [] array = {1, 2, 3, 4, 5};
    int result = Arrays.stream(array).map(n -> n * 2).sum();
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution.reverseArray(arr)));
        System.out.println("---------------------------------------------------");
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.result);
    }
}