import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static int sum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static List<Integer> sortByDigitSum(List<Integer> weights) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return sum(i1) - sum(i2);
            }
        };
        Collections.sort(weights, comparator);
        return weights;
    }

    public static void main(String[] args) {
        List<Integer> weight = new ArrayList<Integer>();
        weight.add(56);
        weight.add(65);
        weight.add(74);
        weight.add(100);
        weight.add(99);
        weight.add(68);
        weight.add(86);
        weight.add(180);
        weight.add(90);
        List<Integer> sortedWeights = sortByDigitSum(weight);
        System.out.println(sortedWeights);
    }
}