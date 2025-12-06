import java.util.Arrays;
import java.util.List;

public class LastOccurence {
    public static int solve(int n, int key, List<Integer> v) {
        // initialize search bounds and result
        int start = 0;
        int end = n - 1;
        int res = -1;

        // binary search loop
        while (start <= end) {
            // compute mid safely
            int mid = start + (end - start) / 2;
            // when match found, store index and move right
            if (v.get(mid) == key) {
                res = mid;
                start = mid + 1;
            }
            // when key is smaller, move left
            else if (key < v.get(mid)) {
                end = mid - 1;
            }
            // otherwise move right
            else {
                start = mid + 1;
            }
        }
        // return last occurrence or -1
        return res;
    }

    // program entry
    public static void main(String[] args) {
        // define input size and key
        int key = 13;
        // define sorted list
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        // compute n from list size
        int n = v.size();
        // run search
        
        int ans = solve(n, key, v);
        // print result
        System.out.println(ans);
    }
}

