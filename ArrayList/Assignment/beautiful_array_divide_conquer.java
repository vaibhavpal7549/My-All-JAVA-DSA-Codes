
import java.util.*;

public class beautiful_array_divide_conquer {

    public static ArrayList<Integer> beautifulArray(int n) {

        ArrayList<Integer> res = new ArrayList<>();

        divideConque(1, 1, res, n);

        return res;
    }

    public static void divideConque(int start, int increment, ArrayList<Integer> res, int n) {

        if (start + increment > n) {
            res.add(start);
            return;
        }

        divideConque(start, 2 * increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> ans = beautifulArray(n);

        System.out.println("Beautiful Array : " + ans);
    }
}