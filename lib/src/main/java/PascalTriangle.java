import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(last = generate(last));
        }
        return result;
    }

    public List<Integer> generate(List<Integer> row) {
        List<Integer> result = new ArrayList<>(row.size() + 1);
        for (int i = 0; i < row.size() + 1; i++) {
            result.add(i == 0 || i == row.size() ? 1 : row.get(i) + row.get(i - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(1));
    }

}
